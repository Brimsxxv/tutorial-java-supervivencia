package ejercicios;

public class Ciclos {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO MODO SUPERVIVENCIA ---");
        
        // El profesor quiere ver que sabes usar ciclos. 
        // Aquí usamos un ciclo FOR para simular el paso de 5 días en el juego.
        int diasParaSobrevivir = 5;
        
        for (int diaActual = 1; diaActual <= diasParaSobrevivir; diaActual++) {
            System.out.println("☀️ Día " + diaActual + ": El sol sale. El personaje tala árboles y recolecta bayas.");
            System.out.println("🌙 Noche " + diaActual + ": Cae la oscuridad. El personaje se refugia en su base.\n");
        }
        
        System.out.println("🏆 ¡Felicidades! Lograste sobrevivir los primeros días.");
    }
}