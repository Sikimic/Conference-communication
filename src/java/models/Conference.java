package models;
// Generated Jun 8, 2017 6:33:21 PM by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Conference generated by hbm2java
 */
@Entity
@Table(name="conference"
    ,catalog="conference"
)
public class Conference  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Date dateStart;
     private Date dateEnd;
     private String place;
     private String field;
     private Date dateEndRegistration;
     private String status;
     private int agendaId;
     private int galleryId;
     private Set<User> users = new HashSet(0);

    public Conference() {
    }

	
    public Conference(String name, Date dateStart, Date dateEnd, String place, String field, Date dateEndRegistration, String status, int agendaId, int galleryId) {
        this.name = name;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.place = place;
        this.field = field;
        this.dateEndRegistration = dateEndRegistration;
        this.status = status;
        this.agendaId = agendaId;
        this.galleryId = galleryId;
    }
    public Conference(String name, Date dateStart, Date dateEnd, String place, String field, Date dateEndRegistration, String status, int agendaId, int galleryId, Set users) {
       this.name = name;
       this.dateStart = dateStart;
       this.dateEnd = dateEnd;
       this.place = place;
       this.field = field;
       this.dateEndRegistration = dateEndRegistration;
       this.status = status;
       this.agendaId = agendaId;
       this.galleryId = galleryId;
       this.users = users;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_start", nullable=false, length=10)
    public Date getDateStart() {
        return this.dateStart;
    }
    
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_end", nullable=false, length=10)
    public Date getDateEnd() {
        return this.dateEnd;
    }
    
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    
    @Column(name="place", nullable=false)
    public String getPlace() {
        return this.place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }

    
    @Column(name="field", nullable=false)
    public String getField() {
        return this.field;
    }
    
    public void setField(String field) {
        this.field = field;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_end_registration", nullable=false, length=10)
    public Date getDateEndRegistration() {
        return this.dateEndRegistration;
    }
    
    public void setDateEndRegistration(Date dateEndRegistration) {
        this.dateEndRegistration = dateEndRegistration;
    }

    
    @Column(name="status", nullable=false)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="agenda_id", nullable=false)
    public int getAgendaId() {
        return this.agendaId;
    }
    
    public void setAgendaId(int agendaId) {
        this.agendaId = agendaId;
    }

    
    @Column(name="gallery_id", nullable=false)
    public int getGalleryId() {
        return this.galleryId;
    }
    
    public void setGalleryId(int galleryId) {
        this.galleryId = galleryId;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_conference", catalog="conference", joinColumns = { 
        @JoinColumn(name="conference_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="user_id", nullable=false, updatable=false) })
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }




}


