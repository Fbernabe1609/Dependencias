package org.example;

public class EstudianteDepresivo {
    Medac medac;
    Alumno alumno;

    public EstudianteDepresivo(Medac medac, Alumno alumno) {
        this.medac = medac;
        this.alumno = alumno;
    }

    public Medac getMedac() {
        return medac;
    }

    public void setMedac(Medac medac) {
        this.medac = medac;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
