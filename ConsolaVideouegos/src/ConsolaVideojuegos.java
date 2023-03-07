public class ConsolaVideojuegos {

        // Atributos
        private String marca;
        private String modelo;
        private boolean conectada;
        private int cantidadJugadores;

        // Constructores
        public ConsolaVideojuegos() {
            this.marca = "";
            this.modelo = "";
            this.conectada = false;
            this.cantidadJugadores = 0;
        }

        public ConsolaVideojuegos(String marca, String modelo, boolean conectada, int cantidadJugadores) {
            this.marca = marca;
            this.modelo = modelo;
            this.conectada = conectada;
            this.cantidadJugadores = cantidadJugadores;
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

        public boolean isConectada() {
            return conectada;
        }

        public void setConectada(boolean conectada) {
            this.conectada = conectada;
        }

        public int getCantidadJugadores() {
            return cantidadJugadores;
        }

        public void setCantidadJugadores(int cantidadJugadores) {
            this.cantidadJugadores = cantidadJugadores;
        }

        // Método toString
        @Override
        public String toString() {
            return "ConsolaVideojuegos{" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", conectada=" + conectada +
                    ", cantidadJugadores=" + cantidadJugadores +
                    '}';
        }

        // Métodos de uso general
        public void conectar() {
            if (conectada) {
                System.out.println("La consola ya está conectada");
            } else {
                System.out.println("Conectando la consola...");
                conectada = true;
            }
        }

        public void desconectar() {
            if (conectada) {
                System.out.println("Desconectando la consola...");
                conectada = false;
            } else {
                System.out.println("La consola ya está desconectada");
            }
        }

        public void jugar(int cantidadJugadores) {
            if (!conectada) {
                System.out.println("La consola no está conectada, no se puede jugar");
            } else if (cantidadJugadores <= 0) {
                System.out.println("Cantidad de jugadores inválida");
            } else if (cantidadJugadores > this.cantidadJugadores) {
                System.out.println("No se pueden jugar con más de " + this.cantidadJugadores + " jugadores");
            } else {
                System.out.println("Jugando con " + cantidadJugadores + " jugadores");
            }
        }
    }


