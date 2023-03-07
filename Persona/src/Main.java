public class Main {
    public static void main(String[] args) {
        // Crear un objeto Persona utilizando el constructor por defecto
        PersonaAtributosyDemas persona1 = new PersonaAtributosyDemas();

        // Establecer valores de los atributos utilizando los métodos de acceso
        persona1.setNombre("Juan");
        persona1.setEdad(25);
        persona1.setGenero("Masculino");
        persona1.setDireccion("Calle 123, Ciudad");

        // Imprimir el objeto Persona utilizando el método toString
        System.out.println("Persona 1: " + persona1);

        // Crear un objeto Persona utilizando el constructor sobrecargado
        PersonaAtributosyDemas persona2 = new PersonaAtributosyDemas("María", 30, "Femenino", "Avenida 456, Ciudad");

        // Imprimir el objeto Persona utilizando el método toString
        System.out.println("Persona 2: " + persona2);

        // Utilizar los métodos de uso general
        persona1.presentarse();
        persona1.celebrarCumpleaños();
        persona1.cambiarDireccion("Calle 789, Ciudad");
    }
}
