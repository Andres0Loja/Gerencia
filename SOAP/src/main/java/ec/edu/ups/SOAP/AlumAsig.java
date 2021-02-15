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
@Table(name = "alum_asig")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlumAsig.findAll", query = "SELECT a FROM AlumAsig a"),
    @NamedQuery(name = "AlumAsig.findById", query = "SELECT a FROM AlumAsig a WHERE a.id = :id"),
    @NamedQuery(name = "AlumAsig.findByFaltas", query = "SELECT a FROM AlumAsig a WHERE a.faltas = :faltas")})
public class AlumAsig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "faltas")
    private int faltas;
    @JoinColumn(name = "alumno_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Alumno alumnoId;
    @JoinColumn(name = "asignatura_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Asignatura asignaturaId;

    public AlumAsig() {
    }

    public AlumAsig(Integer id) {
        this.id = id;
    }

    public AlumAsig(Integer id, int faltas) {
        this.id = id;
        this.faltas = faltas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public Alumno getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Alumno alumnoId) {
        this.alumnoId = alumnoId;
    }

    public Asignatura getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(Asignatura asignaturaId) {
        this.asignaturaId = asignaturaId;
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
        if (!(object instanceof AlumAsig)) {
            return false;
        }
        AlumAsig other = (AlumAsig) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.ups.SOAP.AlumAsig[ id=" + id + " ]";
    }
    
}
