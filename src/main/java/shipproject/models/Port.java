package shipproject.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ports")
@Getter
@Setter
public class Port {

    @Id
    @NotEmpty(message = "Port cannot to be without name")
    private String name;

    @Column(name = "nav_description")
    @NotEmpty(message = "Port cannot to be without navigational description")
    private String nav_description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country")
    private Country country;

    @OneToMany(mappedBy = "port", cascade = CascadeType.ALL)
    private List<Vessel> regVessels;

    public Port() {
    }

    public Port(String name, Country country, String nav_description) {
        this.name = name;
        this.country = country;
        this.nav_description = nav_description;
    }

    public Port(String name, String nav_description, Country country, List<Vessel> regVessels) {
        this.name = name;
        this.nav_description = nav_description;
        this.country = country;
        this.regVessels = regVessels;
    }
}
