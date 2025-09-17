package ar.edu.unahur.obj2.marcas.Personas;

import ar.edu.unahur.obj2.marcas.Marca;

public class PersonaBelga extends Persona{
    
    public PersonaBelga(Double peso, Boolean escuchaMusicaTradicional, Integer nivelDeAguante) {
        super(peso, escuchaMusicaTradicional, nivelDeAguante);
    }

    @Override
    public Boolean gustoCerveza(Marca unaMarca) {
        return unaMarca.getGramosLupolos() > 4.0;
    }
}
