/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.SOAP;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fanny
 */
@Entity
@Table(name = "prof_asig")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfAsig.findAll", query = "SELECT p FROM ProfAsig p"),
    @NamedQuery(name = "ProfAsig.findById", query = "SELECT p FROM ProfAsig p WHERE p.id = :id"),
    @NamedQuery(name = "ProfAsig.findByHorasSemanales", query = "SELECT p FROM ProfAsig p WHERE p.horasSemanales = :horasSemanales")})
public class ProfAsig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "horas_semanales")
    private int horasSemanales;
    @JoinColumn(name = "asignatura_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Asignatura asignaturaId;
    @JoinColumn(name = "profesor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Profesor profesorId;

    public ProfAsig() {
    }

    public ProfAsig(Integer id) {
        this.id = id;
    }

    public ProfAsig(Integer id, int horasSemanales) {
        this.id = id;
        this.horasSemanales = horasSemanales;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public Asignatura getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(Asignatura asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public Profesor getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Profesor profesorId) {
        this.profesorId = profesorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfAsig)) {
            return false;
        }
        ProfAsig other = (ProfAsig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.SOAP.ProfAsig[ id=" + id + " ]";
    }
    
}
