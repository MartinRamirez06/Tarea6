public class MonitorAtributosyDemas {
    // Atributos
    private String marca;
    private double tamaño;
    private String resolucion;
    private boolean encendido;

    // Constructor por defecto
    public MonitorAtributosyDemas() {
        this.marca = "";
        this.tamaño = 0.0;
        this.resolucion = "";
        this.encendido = false;
    }

    // Constructor sobrecargado
    public MonitorAtributosyDemas(String marca, double tamaño, String resolucion, boolean encendido) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.resolucion = resolucion;
        this.encendido = encendido;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    // Método toString
    @Override
    public String toString() {
        return "Monitor [marca=" + marca + ", tamaño=" + tamaño + ", resolucion=" + resolucion + ", encendido=" + encendido + "]";
    }

    // Métodos de uso general
    public void encender() {
        if (encendido) {
            System.out.println("El monitor ya está encendido.");
        } else {
            encendido = true;
            System.out.println("El monitor se ha encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El monitor se ha apagado.");
        } else {
            System.out.println("El monitor ya está apagado.");
        }
    }

    public void cambiarResolucion(String nuevaResolucion) {
        resolucion = nuevaResolucion;
        System.out.println("La resolución del monitor ha sido cambiada a " + resolucion + ".");
    }
}

