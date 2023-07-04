package shipproject.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "seamen")
@Setter
@Getter
@AllArgsConstructor
public class Seaman implements Serializable {

    @Id
    @Column(name="seaman_passport_number")
    @NotNull(message = "Passport number cannot be empty")
    private Integer passportNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipowner", referencedColumnName = "name")
    private ShipOwner shipowner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "citizenship", referencedColumnName = "name")
    private Country citizenship;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vessel", referencedColumnName = "IMO")
    private Vessel vessel;

    @Column(name = "fullname")
    @NotEmpty(message = "Name for seaman should be entered")
    private String fullName;

    @Column(name = "position")
    @NotEmpty(message = "Seaman cannot work on a vessel without position")
    private String position;

    @Column(name = "birthdate")
    @NotNull(message = "Enter birth date")
    private Date birth;

    @Column(name = "birthplace")
    @NotEmpty(message = "Enter birth place")
    private String birthPlace;

    public Seaman() {}

    public Seaman(String fullName, String position, Vessel vessel, Country citizenship,
                  Date birth, String birthPlace, ShipOwner shipOwner, Integer passportNumber){
        this.setPassportNumber(passportNumber);
        this.fullName = fullName;
        this.position = position;
        this.vessel = vessel;
        this.citizenship = citizenship;
        this.birth = birth;
        this.birthPlace = birthPlace;
        this.shipowner = shipOwner;
    }

    @Override
    public String toString() {
        return "Seaman{" +
                "passportNumber=" + passportNumber +
                ", shipowner=" + shipowner +
                ", citizenship=" + citizenship +
                ", vessel=" + vessel +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", birth=" + birth +
                ", birthPlace='" + birthPlace + '\'' +
                '}';
    }
}
