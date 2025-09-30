package ar.edu.unahur.obj2.marcas;


public abstract class Marca {
    protected Double gramosLupulo;
    protected String paisOrigen;

    public Marca(Double gramosLupulo, String paisOrigen) {
        this.gramosLupulo = gramosLupulo;
        this.paisOrigen = paisOrigen;
    }

    public Double getGramosLupulo() {
        return gramosLupulo;
    }

    public void setGramosLupulo(Double gramosLupulo) {
        this.gramosLupulo = gramosLupulo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public abstract Double graduacionCerveza();

    protected Double graduacionCervezaNegra(){
        return Double.min(Reglamentaria.getInstance().getGraduacionReglamentaria(), 2 * gramosLupulo);
    }
}