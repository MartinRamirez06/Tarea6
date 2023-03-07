public class PersonaAtributosyDemas {

        // Atributos
        private String nombre;
        private int edad;
        private String genero;
        private String direccion;

        // Constructor por defecto
        public PersonaAtributosyDemas() {
            this.nombre = "";
            this.edad = 0;
            this.genero = "";
            this.direccion = "";
        }

        // Constructor sobrecargado
        public PersonaAtributosyDemas(String nombre, int edad, String genero, String direccion) {
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
            this.direccion = direccion;
        }

        // Métodos de acceso
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        // Método toString
        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", direccion=" + direccion + "]";
        }

        // Métodos de uso general
        public void presentarse() {
            System.out.println("Hola, mi nombre es " + nombre + ".");
        }

        public void celebrarCumpleaños() {
            edad++;
            System.out.println("¡Feliz cumpleaños! Ahora tengo " + edad + " años.");
        }

        public void cambiarDireccion(String nuevaDireccion) {
            direccion = nuevaDireccion;
            System.out.println("Mi nueva dirección es " + direccion + ".");
        }
    }




