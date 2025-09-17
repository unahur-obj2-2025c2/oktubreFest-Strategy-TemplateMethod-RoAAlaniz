package ar.edu.unahur.obj2.marcas;

public abstract class Marca {
    private Double gramosLupolos;
    private Double graduacion;
    private String nombre;
    private String pais;

    public Marca(Double gramosLupolos, Double graduacion, String nombre, String pais) {
        this.gramosLupolos = gramosLupolos;
        this.graduacion = graduacion;
        this.nombre = nombre;
        this.pais = pais;
    }

    public Double getGramosLupolos() {
        return gramosLupolos;
    }

    public String getNombre() {
        return nombre;
    } 

    public String getPais() {
        return pais;
    } 
    
    public abstract Double getGraduacion();

    public Double alcoholLitro(){
        return this.graduacion / 100.0;
    } 

    public void setGramosLupolos(Double gramosLupolos) {
        this.gramosLupolos = gramosLupolos;
    }

    public void setGraduacion(Double graduacion) {
        this.graduacion = graduacion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}