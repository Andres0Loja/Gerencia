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

public class ProfesorPK implements Serializable{
    
     @Basic(optional = false)
    @NotNull
    @Column(name = "ASIGNATURA")
    private int asignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROFESOR")
    private int profesor;

    public ProfesorPK() {
    }

    public ProfesorPK(int asignatura, int profesor) {
        this.asignatura = asignatura;
        this.profesor = profesor;
    }

    public int getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(int asignatura) {
        this.asignatura = asignatura;
    }

    public int getProfesor() {
        return profesor;
    }

    public void setProfesor(int profesor) {
        this.profesor = profesor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) asignatura;
        hash += (int) profesor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfesorPK)) {
            return false;
        }
        ProfesorPK other = (ProfesorPK) object;
        if (this.asignatura != other.asignatura) {
            return false;
        }
        if (this.profesor != other.profesor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iesvdc.acceso.entidades.ProfAsigPK[ asignatura=" + asignatura + ", profesor=" + profesor + " ]";
    }
    
}
    
