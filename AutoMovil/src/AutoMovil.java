public class AutoMovil {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;

    // Constructor por defecto
    public AutoMovil() {
        this.marca = "";
        this.modelo = "";
        this.año = 0;
        this.color = "";
        this.precio = 0.0;
    }

    // Constructor sobrecargado
    public AutoMovil(String marca, String modelo, int año, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color=" + color + ", precio=" + precio + "]";
    }

    // Métodos de uso general
    public void encender() {
        System.out.println("El automóvil ha sido encendido.");
    }

    public void acelerar() {
        System.out.println("El automóvil está acelerando.");
    }

    public void frenar() {
        System.out.println("El automóvil está frenando.");
    }
}
