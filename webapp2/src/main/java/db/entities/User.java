package db.entities;

import global.types.Email;
import global.types.Login;
import global.types.Name;
import global.types.Password;
import global.types.Role;
import global.types.Surname;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author E589510
 */

@Entity
public class User implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Email email;
    private Login login;
    private Password passHash;
    private Name name;
    private Surname surname;
    private Role user_role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email.getEmail();
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getLogin() {
        return login.getLogin();
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getPassHash() {
        return passHash.getPassword();
    }

    public void setPassHash(Password passHash) {
        this.passHash = passHash;
    }

    public String getName() {
        return name.getName();
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getSurname() {
        return surname.getSurname();
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public Role getRole() {
        return user_role;
    }

    public void setRole(Role role) {
        this.user_role = role;
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
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

 

   

    

    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email.getEmail() + ", login=" + login.getLogin() + ", passHash=" + passHash.getPassword() + ", name=" + name.getName() + ", surname=" + surname.getSurname() + ", role=" + user_role + '}';
    }



	
}
