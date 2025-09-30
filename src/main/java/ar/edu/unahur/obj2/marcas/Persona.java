package ar.edu.unahur.obj2.marcas;
import java.util.ArrayList;
import java.util.List;

public class Persona{
    private Integer peso;
    private List<Jarra> jarrasConsumidas = new ArrayList<>();
    private Boolean leGustaMusicaTradicional;
    private Integer nivelAguante;
    private Double litros;
    private Marca marcaPreferida;
    private Pais nacionalidad;

    public Persona(Integer peso, Boolean leGustaMusicaTradicional, Integer nivelAguante, Marca marcaPreferida, Pais nacionalidad) {
        this.peso = peso;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.marcaPreferida = marcaPreferida;
        this.nacionalidad = nacionalidad;
        this.nivelAguante = nivelAguante;
        this.litros = 0.0;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Marca getMarcaPreferida() {
        return marcaPreferida;
    }

    public void setMarcaPreferida(Marca marcaPreferida) {
        this.marcaPreferida = marcaPreferida;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public List<Jarra> getJarrasConsumidas() {
        return jarrasConsumidas;
    }

    public void setJarrasConsumidas(List<Jarra> jarrasConsumidas) {
        this.jarrasConsumidas = jarrasConsumidas;
    }

    public Boolean getLeGustaMusicaTradicional() {
        return leGustaMusicaTradicional;
    }

    public void setLeGustaMusicaTradicional(Boolean leGustaMusicaTradicional) {
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
    }

    public Integer getNivelAguante() {
        return nivelAguante;
    }

    public void setNivelAguante(Integer nivelAguante) {
        this.nivelAguante = nivelAguante;
    }

    public Boolean estaEbria(){
        return jarrasConsumidas.stream().mapToDouble(j -> j.getLitros()).sum() * peso > nivelAguante;
    }

    public Boolean gustoPersonas(Marca unaMarca){
        return switch (nacionalidad.nombre()){
            case "Belgica" -> unaMarca.gramosLupulo() > 4;
            case "Repliplica Checa" -> unaMarca.graduacion() > 8;
            case "Alemania" -> Boolean.TRUE;
        };
    }
}
