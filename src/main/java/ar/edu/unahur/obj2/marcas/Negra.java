package ar.edu.unahur.obj2.marcas;

public class Negra extends Marca{
    private Double graduacionDistinta;   

    public Negra(Double gramosLupolos, Double graduacion, String nombre, String pais, Double graduacionDistinta) {
        super(gramosLupolos, graduacion, nombre, pais);
        this.graduacionDistinta = graduacionDistinta;
    }

    public Double getGraduacionDistinta() {
        return graduacionDistinta;
    }

    @Override 
    public Double getGraduacion() {
        return Math.min(Mundial.getMundial().getGraduacionReglamentaria(), this.getGraduacionDistinta() * 2);
    }

    public void setGraduacionDistinta(Double graduacionDistinta) {
        this.graduacionDistinta = graduacionDistinta;
    }
}