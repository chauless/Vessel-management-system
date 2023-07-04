package shipproject.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country implements Serializable {

    @Id
    @Column(name = "name")
    @NotEmpty(message = "Country cannot to be without name")
    private String name;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<ShipOwner> shipOwners;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Vessel> vessels;

    @OneToMany(mappedBy = "citizenship", cascade = CascadeType.ALL)
    private List<Seaman> seamen;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Port> ports;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
