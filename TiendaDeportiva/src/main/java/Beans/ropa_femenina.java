
package Beans;

public class ropa_femenina {
    private int id_prenda;
    private String tipo_prenda;
    private String marca;
    private String talla;
    private String color;
    private String estilo;
    private int precio;
    private boolean disponible;

    public ropa_femenina(int id_prenda, String tipo_prenda, String marca, String talla, String color, String estilo, int precio, boolean disponible) {
        this.id_prenda = id_prenda;
        this.tipo_prenda = tipo_prenda;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.estilo = estilo;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        this.id_prenda = id_prenda;
    }

    public String getTipo_prenda() {
        return tipo_prenda;
    }

    public void setTipo_prenda(String tipo_prenda) {
        this.tipo_prenda = tipo_prenda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getPrecio() {
        return precio;
    }

    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public String toString() {
        return "Ropa_femenina{" + "id_prenda=" + id_prenda + ", tipo_prenda=" + tipo_prenda + ", marca=" + marca + ", talla=" + talla + ", color=" + color + ", estilo=" + estilo + ", precio=" + precio + ", disponible=" + disponible + '}';
    }

}
