package models;
// Generated Jun 8, 2017 6:33:21 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="conference"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class User  implements java.io.Serializable {


     private Integer id;
     private Role role;
     private String username;
     private String password;
     private String email;
     private String name;
     private String surname;
     private String institution;
     private String gender;
     private String image;
     private String shirtSize;
     private String linkedin;
     private Set conferences = new HashSet(0);
     private Set userAgendas = new HashSet(0);

    public User() {
    }

	
    public User(Role role, String username, String password, String email, String name, String surname, String institution, String gender, String image, String shirtSize, String linkedin) {
        this.role = role;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.institution = institution;
        this.gender = gender;
        this.image = image;
        this.shirtSize = shirtSize;
        this.linkedin = linkedin;
    }
    public User(Role role, String username, String password, String email, String name, String surname, String institution, String gender, String image, String shirtSize, String linkedin, Set conferences, Set userAgendas) {
       this.role = role;
       this.username = username;
       this.password = password;
       this.email = email;
       this.name = name;
       this.surname = surname;
       this.institution = institution;
       this.gender = gender;
       this.image = image;
       this.shirtSize = shirtSize;
       this.linkedin = linkedin;
       this.conferences = conferences;
       this.userAgendas = userAgendas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="role_id", nullable=false)
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

    
    @Column(name="username", unique=true, nullable=false)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="surname", nullable=false)
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }

    
    @Column(name="institution", nullable=false)
    public String getInstitution() {
        return this.institution;
    }
    
    public void setInstitution(String institution) {
        this.institution = institution;
    }

    
    @Column(name="gender", nullable=false, length=20)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Column(name="image", nullable=false)
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    
    @Column(name="shirt_size", nullable=false, length=10)
    public String getShirtSize() {
        return this.shirtSize;
    }
    
    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    
    @Column(name="linkedin", nullable=false)
    public String getLinkedin() {
        return this.linkedin;
    }
    
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_conference", catalog="conference", joinColumns = { 
        @JoinColumn(name="user_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="conference_id", nullable=false, updatable=false) })
    public Set getConferences() {
        return this.conferences;
    }
    
    public void setConferences(Set conferences) {
        this.conferences = conferences;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    public Set getUserAgendas() {
        return this.userAgendas;
    }
    
    public void setUserAgendas(Set userAgendas) {
        this.userAgendas = userAgendas;
    }




}


