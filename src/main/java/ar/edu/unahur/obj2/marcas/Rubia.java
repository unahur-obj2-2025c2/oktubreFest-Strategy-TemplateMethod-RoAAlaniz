package ar.edu.unahur.obj2.marcas;

public class Rubia extends Marca{
    private final Double graduacionDistinta;

    public Rubia(Double gramosLupulo, String paisOrigen, Double graduacionDistinta) {
        super(gramosLupulo, paisOrigen);
        this.graduacionDistinta = graduacionDistinta;
    }

    @Override
    public Double graduacionCerveza() {
        return getGraduacionDistinta();
    }

    public Double getGraduacionDistinta() {
        return graduacionDistinta;
    }
}