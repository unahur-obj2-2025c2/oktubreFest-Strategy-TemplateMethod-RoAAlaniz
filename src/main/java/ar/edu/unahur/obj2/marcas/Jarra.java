package ar.edu.unahur.obj2.marcas;

public class Jarra {
    private Double capacidad;
    private Marca marca;

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Jarra(Double capacidad, Marca marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Double alcoholTotal() {
        return capacidad * marca.alcoholLitro();
    }
}
