package shipproject.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import shipproject.models.enums.Role;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "username")
    @NotEmpty(message = "Username should be filled")
    private String username;

    @Column(name = "password")
    @NotEmpty(message = "Password should be filled")
    private String password;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "non_expired")
    private boolean nonExpired;

    @Column(name = "non_locked")
    private boolean nonLocked;

    @Column(name = "non_credentials_expired")
    private boolean nonCredentialsExpired;

    @Column(name = "is_enabled")
    private boolean isEnabled;

    public User() {}

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return username + " password : " + password + " role: " + role;
    }
}
