/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Akaros
 */
@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t")
    , @NamedQuery(name = "Trainers.findByTrainerid", query = "SELECT t FROM Trainers t WHERE t.trainerid = :trainerid")
    , @NamedQuery(name = "Trainers.findByTrlast", query = "SELECT t FROM Trainers t WHERE t.trlast = :trlast")
    , @NamedQuery(name = "Trainers.findByTrfirst", query = "SELECT t FROM Trainers t WHERE t.trfirst = :trfirst")
    , @NamedQuery(name = "Trainers.findByTrsubject", query = "SELECT t FROM Trainers t WHERE t.trsubject = :trsubject")})
public class Trainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainerid")
    private Integer trainerid;
    @Size(max = 20)
    @Column(name = "trlast")
    private String trlast;
    @Size(max = 20)
    @Column(name = "trfirst")
    private String trfirst;
    @Size(max = 20)
    @Column(name = "trsubject")
    private String trsubject;

    public Trainers() {
    }

    public Trainers(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public Integer getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public String getTrlast() {
        return trlast;
    }

    public void setTrlast(String trlast) {
        this.trlast = trlast;
    }

    public String getTrfirst() {
        return trfirst;
    }

    public void setTrfirst(String trfirst) {
        this.trfirst = trfirst;
    }

    public String getTrsubject() {
        return trsubject;
    }

    public void setTrsubject(String trsubject) {
        this.trsubject = trsubject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerid != null ? trainerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainers)) {
            return false;
        }
        Trainers other = (Trainers) object;
        if ((this.trainerid == null && other.trainerid != null) || (this.trainerid != null && !this.trainerid.equals(other.trainerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "emergon.entity.Trainers[ trainerid=" + trainerid + " ]";
    }
    
}
