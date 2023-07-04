package shipproject.models;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import shipproject.models.enums.VesselType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "vessels")
@Getter
@Setter
@Valid
public class Vessel implements Serializable {

    @Id
    @Column(name = "IMO")
    @NotNull(message = "IMO cannot to be null")
    private Integer IMO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country", referencedColumnName = "name")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipowner", referencedColumnName = "name")
    private ShipOwner shipOwner;

    @OneToMany(mappedBy = "vessel", cascade = CascadeType.ALL)
    private List<Seaman> seamen;

    @Column(name = "name")
    @NotNull(message = "Vessel cannot to be without name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private VesselType vesselType;

    @Column(name = "building_date")
    @NotNull(message = "Enter date of building")
    private LocalDate dateOfBuild;

    @NotNull(message = "Vessel cannot to be without port of registration")
    @JoinColumn(name = "port_of_registration")
    @ManyToOne(fetch = FetchType.LAZY)
    private Port port;

    public Vessel() {
    }

    public Vessel(Integer IMO, String name) {
        this.IMO = IMO;
        this.name = name;
    }

    public Vessel(String name, Integer IMO, ShipOwner shipOwner, VesselType vesselType, Country country, Port port, LocalDate buildingDate) {
        this.name = name;
        this.IMO = IMO;
        this.vesselType = vesselType;
        this.shipOwner = shipOwner;
        this.country = country;
        this.port = port;
        this.dateOfBuild = buildingDate;
    }
}
