package ar.edu.unahur.obj2.marcas.Personas;

import ar.edu.unahur.obj2.marcas.Marca;

public class PersonaAlemana extends Persona{
    
    public PersonaAlemana(Double peso, Boolean escuchaMusicaTradicional, Integer nivelDeAguante) {
        super(peso, escuchaMusicaTradicional, nivelDeAguante);
    }

    @Override
    public Boolean gustoCerveza(Marca unaMarca) {
        return true; //les gustan todas las cervezas
    }
}
