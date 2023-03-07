public class Main {
    public static void main(String[] args) {

                // Crear un objeto Automovil utilizando el constructor por defecto
                AutoMovil automovil1 = new AutoMovil();

                // Establecer valores de los atributos utilizando los métodos de acceso
                automovil1.setMarca("Ford");
                automovil1.setModelo("Mustang");
                automovil1.setAño(2021);
                automovil1.setColor("Rojo");
                automovil1.setPrecio(35000.0);

                // Imprimir el objeto Automovil utilizando el método toString
                System.out.println("Automóvil 1: " + automovil1);

                // Crear un objeto Automovil utilizando el constructor sobrecargado
                AutoMovil automovil2 = new AutoMovil("Chevrolet", "Camaro", 2021, "Negro", 38000.0);

                // Imprimir el objeto Automovil utilizando el método toString
                System.out.println("Automóvil 2: " + automovil2);

                // Utilizar los métodos de uso general
                automovil1.encender();
                automovil1.acelerar();
                automovil1.frenar();
            }
        }




