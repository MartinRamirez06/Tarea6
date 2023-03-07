public class Main {
    public static void main(String[] args) {
        // Crear instancia de ConsolaVideojuegos
        ConsolaVideojuegos consola = new ConsolaVideojuegos();

        // Utilizar métodos de acceso para modificar atributos
        consola.setMarca("Nintendo");
        consola.setModelo("Switch");
        consola.setCantidadJugadores(4);

        // Imprimir atributos utilizando el método toString
        System.out.println(consola);

        // Llamar a los métodos de uso general
        consola.conectar(); // Imprime "Conectando la consola..."
        consola.conectar(); // Imprime "La consola ya está conectada"
        consola.jugar(2); // Imprime "La consola no está conectada, no se puede jugar"
        consola.desconectar(); // Imprime "Desconectando la consola..."
        consola.jugar(4); // Imprime "Jugando con 4 jugadores"
    }
}
