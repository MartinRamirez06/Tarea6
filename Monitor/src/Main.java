public class Main {
    public static void main(String[] args) {
        // Crear un objeto Monitor
        MonitorAtributosyDemas miMonitor = new MonitorAtributosyDemas("Dell", 23.5, "1920x1080", false);

        // Acceder a los atributos del Monitor
        System.out.println("Marca del monitor: " + miMonitor.getMarca());
        System.out.println("Tamaño del monitor: " + miMonitor.getTamaño() + " pulgadas");
        System.out.println("Resolución del monitor: " + miMonitor.getResolucion());
        System.out.println("El monitor está encendido: " + miMonitor.isEncendido());

        // Llamar a los métodos de uso general del Monitor
        miMonitor.encender();
        miMonitor.cambiarResolucion("2560x1440");
        miMonitor.encender();
        miMonitor.apagar();
        miMonitor.apagar();
    }
}
