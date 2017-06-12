package models;
// Generated Jun 12, 2017 10:46:59 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GalleryPhoto generated by hbm2java
 */
@Entity
@Table(name="gallery_photo"
    ,catalog="conference"
)
public class GalleryPhoto  implements java.io.Serializable {


     private Integer id;
     private Agenda agenda;
     private String image;

    public GalleryPhoto() {
    }

    public GalleryPhoto(Agenda agenda, String image) {
       this.agenda = agenda;
       this.image = image;
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
    @JoinColumn(name="agenda_id", nullable=false)
    public Agenda getAgenda() {
        return this.agenda;
    }
    
    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    
    @Column(name="image", nullable=false)
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }




}


