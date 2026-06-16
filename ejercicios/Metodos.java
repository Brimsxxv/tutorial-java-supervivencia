package ejercicios;

public class Metodos {
    // Variable global para la vida de nuestro personaje
    static int salud = 100;

    // MÉTODO 1: Función para recibir daño
    public static void recibirDanio(int cantidad) {
        salud -= cantidad;
        System.out.println("⚠️ ¡Ouch! Recibiste " + cantidad + " de daño. Salud actual: " + salud);
    }

    // MÉTODO 2: Función para curarse
    public static void curarVida(int cantidad) {
        salud += cantidad;
        if (salud > 100) {
            salud = 100; // Tope máximo de vida
        }
        System.out.println("💚 Usaste un botiquín. Te curaste " + cantidad + " puntos. Salud actual: " + salud);
    }

    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE MÉTODOS DEL JUGADOR ---");
        System.out.println("Salud inicial: " + salud + "\n");
        
        // Aquí "llamamos" a los métodos que creamos arriba
        recibirDanio(30);
        curarVida(15);
        recibirDanio(90); // Daño crítico
        
        if (salud <= 0) {
            System.out.println("💀 Fin de la partida...");
        }
    }
}