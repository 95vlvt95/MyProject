package ua.a.pavlenko.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users")
public class User implements Serializable{
    public static final long serialVersionUID = 1L;

    /*TEST COMMIT */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column
    private String loginName;

    @Column
    private String enPassword;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Version
    @Column
    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEnPassword() {
        return enPassword;
    }

    public void setEnPassword(String enPassword) {
        this.enPassword = enPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){}

    public User(String loginName, String enPassword, String firstName, String lastName, String email){
        this.loginName = loginName;
        this.enPassword = enPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", " +
                "loginName=" + loginName + ", " +
                "encryptedPassword=" + enPassword + ", " +
                "firstName=" + firstName + ", " +
                "lastName=" + lastName + ", " +
                "email=" + email + ", " +
                "version=" + version + "]";
    }
}
