package db.entities;

import global.types.*;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.eclipse.persistence.annotations.PrimaryKey;

/**
 *
 * @author E589510
 */
@Entity
@Table(name="users", uniqueConstraints = @UniqueConstraint(columnNames = {"login"}))

public class User implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Embedded
    private Integer id;
    
    @Embedded
    private Email email;
    
    @Embedded
    private Login login;
    
    @Embedded
    private Password passHash;
    
    @Embedded
    private Name name;
    
    @Embedded
    private Surname surname;
    
    @Enumerated
    private Role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Password getPassHash() {
        return passHash;
    }

    public void setPassHash(Password passHash) {
        this.passHash = passHash;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Surname getSurname() {
        return surname;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return Objects.equals(this.login, other.login);
    }

    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", login=" + login + ", passHash=" + passHash + ", name=" + name + ", surname=" + surname + ", role=" + role + '}';
    }

	
}
