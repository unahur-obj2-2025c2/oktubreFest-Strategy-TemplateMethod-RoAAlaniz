package ar.edu.unahur.obj2.marcas;

public class Roja extends Marca{

    public Roja(Double gramosLupulo, String paisOrigen) {
        super(gramosLupulo, paisOrigen);
    }

    @Override
    public Double graduacionCerveza() {
        return super.graduacionCervezaNegra() * 1.25;
    }
}