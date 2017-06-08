package models;
// Generated Jun 8, 2017 6:33:21 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Gallery generated by hbm2java
 */
@Entity
@Table(name="gallery"
    ,catalog="conference"
)
public class Gallery  implements java.io.Serializable {


     private Integer id;
     private int name;

    public Gallery() {
    }

    public Gallery(int name) {
       this.name = name;
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
    public int getName() {
        return this.name;
    }
    
    public void setName(int name) {
        this.name = name;
    }




}


