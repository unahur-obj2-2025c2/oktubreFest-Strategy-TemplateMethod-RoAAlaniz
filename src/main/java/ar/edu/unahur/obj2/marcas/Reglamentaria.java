package ar.edu.unahur.obj2.marcas;

public class Reglamentaria {
    private static Reglamentaria instancia;

    private Double graduacionReglamentaria = 0.10;

    private Reglamentaria() {
    }

    public static Reglamentaria getInstance(){
        if (instancia == null){
            instancia = new Reglamentaria();
        }
        return instancia;
    }

    public Double getGraduacionReglamentaria() {
        return graduacionReglamentaria;
    }
}