
package modelo;


public class Producto {
    int codigo;
    String nombre;
    String categoria;
    float temperatura;
    float stock;
    float stock_minimo;
    float precio;
    int minutosMinimo;

    public int getMinutos() {
        return minutosMinimo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(float stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Producto() {
    }

    public Producto(int codigo, String nombre, String categoria, float temperatura, float stock, float stock_minimo, float precio, int minutos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.temperatura = temperatura;
        this.stock = stock;
        this.stock_minimo = stock_minimo;
        this.precio = precio;
        this.minutosMinimo=minutos;
        
    }
    
    
}
