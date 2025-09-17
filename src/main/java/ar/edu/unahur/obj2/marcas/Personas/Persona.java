package ar.edu.unahur.obj2.marcas.Personas;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.marcas.Jarra;
import ar.edu.unahur.obj2.marcas.Marca;

public abstract class Persona {
    private Double peso;
    private List<Jarra> jarrasCompradas = new ArrayList<>();
    private Boolean escuchaMusicaTradicional;
    private Integer nivelDeAguante;

    public Persona(Double peso, Boolean escuchaMusicaTradicional, Integer nivelDeAguante) {
        this.peso = peso;
        this.escuchaMusicaTradicional = escuchaMusicaTradicional;
        this.nivelDeAguante = nivelDeAguante;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public List<Jarra> getJarrasCompradas() {
        return jarrasCompradas;
    }

    public void setJarrasCompradas(List<Jarra> jarrasCompradas) {
        this.jarrasCompradas = jarrasCompradas;
    }

    public Boolean getEscuchaMusicaTradicional() {
        return escuchaMusicaTradicional;
    }

    public void setEscuchaMusicaTradicional(Boolean escuchaMusicaTradicional) {
        this.escuchaMusicaTradicional = escuchaMusicaTradicional;
    }

    public Integer getNivelDeAguante() {
        return nivelDeAguante;
    }

    public void setNivelDeAguante(Integer nivelDeAguante) {
        this.nivelDeAguante = nivelDeAguante;
    }

    public Double alcoholTotalConsumido() {
        return jarrasCompradas.stream().mapToDouble(j->j.alcoholTotal()).sum();
    }

    public Boolean estaEbria(){
        return this.alcoholTotalConsumido() * peso > getNivelDeAguante();
    }

    public abstract Boolean gustoCerveza(Marca unaMarca);
}