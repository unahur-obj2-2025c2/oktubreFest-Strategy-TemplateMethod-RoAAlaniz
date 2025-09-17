package ar.edu.unahur.obj2.marcas.Personas;

import ar.edu.unahur.obj2.marcas.Marca;

public class PersonaCheco extends Persona{

    public PersonaCheco(Double peso, Boolean escuchaMusicaTradicional, Integer nivelDeAguante) {
        super(peso, escuchaMusicaTradicional, nivelDeAguante);
    }

    @Override
    public Boolean gustoCerveza(Marca unaMarca) {
        return unaMarca.getGraduacion() >= 0.8;
    }
}