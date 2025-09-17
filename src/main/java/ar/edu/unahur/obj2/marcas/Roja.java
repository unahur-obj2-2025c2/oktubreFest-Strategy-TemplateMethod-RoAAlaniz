package ar.edu.unahur.obj2.marcas;

public class Roja extends Marca{
    private Double graduacionDistinta;
    
    public Roja(Double gramosLupolos, Double graduacion, String nombre, String pais, Double graduacionDistinta) {
        super(gramosLupolos, graduacion, nombre, pais);
        this.graduacionDistinta = graduacionDistinta;
    }

    public Double getGraduacionDistinta() {
        return graduacionDistinta;
    }

    @Override
    public Double getGraduacion() {
        return this.graduacionDistinta * 1.25;
    }
}
