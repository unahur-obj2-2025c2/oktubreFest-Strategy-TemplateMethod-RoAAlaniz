package ar.edu.unahur.obj2.marcas;

public class Jarra {
    private Double capacidad;
    private Marca suMarca;

    public Jarra(Double capacidad, Marca suMarca) {
        this.capacidad = capacidad;
        this.suMarca = suMarca;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Marca getSuMarca() {
        return suMarca;
    }

    public void setSuMarca(Marca suMarca) {
        this.suMarca = suMarca;
    }
}