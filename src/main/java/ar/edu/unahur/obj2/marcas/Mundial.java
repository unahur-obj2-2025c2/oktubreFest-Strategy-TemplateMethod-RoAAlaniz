package ar.edu.unahur.obj2.marcas;

public class Mundial {
    private static Mundial instance = new Mundial();

    public static Mundial getInstance() {
        return instance;
    }

    public static void setInstance(Mundial instance) {
        Mundial.instance = instance;
    }
    private Double graduacionReglamentaria = 0.8;

    public static Mundial getMundial() {
        return instance;
    }

    public Double getGraduacionReglamentaria() {
        return graduacionReglamentaria;
    }

    public void cambiarGraduacionReglamentaria(Double nuevaGraduacion) {
        graduacionReglamentaria = nuevaGraduacion;
    }
}
