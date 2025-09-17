package ar.edu.unahur.obj2.marcas;

public class Rubia extends Marca{
    private Double graduacionDistinta;
    
    public Rubia(Double gramosLupolos, Double graduacion, String nombre, String pais, Double graduacionDistinta) {
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

    public void setGraduacionDistinta(Double graduacionDistinta) {
        this.graduacionDistinta = graduacionDistinta;
    }
}