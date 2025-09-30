package ar.edu.unahur.obj2.marcas;

public class Negra extends Marca{

    public Negra(Double gramosLupulo, String paisOrigen) {
        super(gramosLupulo, paisOrigen);
    }

    @Override
    public Double graduacionCerveza() {
        Double gramosReglamento = Reglamentaria.getInstance().getGraduacionReglamentaria();
        return Math.min(gramosReglamento, 2 * gramosLupulo / 100.0);
    } //el mínimo entre la graduación reglamentaria y el doble de su contenido de lúpulo
}