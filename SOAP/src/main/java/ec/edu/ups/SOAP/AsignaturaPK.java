/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.SOAP;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;

/**
 *
 * @author Fanny
 */
public class AsignaturaPK implements Serializable{
    
     @Basic(optional = false)
    @NotNull
    @Column(name = "ASIGNATURA")
    private int asignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALUMNO")
    private int alumno;

    public AsignaturaPK() {
    }

    public AsignaturaPK(int asignatura, int alumno) {
        this.asignatura = asignatura;
        this.alumno = alumno;
    }

    public int getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(int asignatura) {
        this.asignatura = asignatura;
    }

    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) asignatura;
        hash += (int) alumno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsignaturaPK)) {
            return false;
        }
        AsignaturaPK other = (AsignaturaPK) object;
        if (this.asignatura != other.asignatura) {
            return false;
        }
        if (this.alumno != other.alumno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iesvdc.acceso.entidades.AlumAsigPK[ asignatura=" + asignatura + ", alumno=" + alumno + " ]";
    }
    
}
