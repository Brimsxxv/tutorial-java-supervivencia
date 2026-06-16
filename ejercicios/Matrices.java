package ejercicios;

public class Matrices {
    public static void main(String[] args) {
        System.out.println("--- GENERANDO MAPA DEL MUNDO ---\n");
        
        // Una matriz 2D (filas y columnas) para representar el terreno
        // 'A' = Agua, 'T' = Tierra, 'B' = Bosque
        char[][] mapa = {
            {'A', 'A', 'T', 'T', 'A'},
            {'A', 'T', 'B', 'T', 'T'},
            {'T', 'T', 'B', 'B', 'T'},
            {'T', 'A', 'A', 'T', 'T'}
        };
        
        // Usamos dos ciclos 'for' anidados (uno dentro de otro) para recorrer la matriz
        for (int fila = 0; fila < mapa.length; fila++) {
            for (int col = 0; col < mapa[fila].length; col++) {
                // Imprimimos el terreno en esa coordenada específica
                System.out.print(mapa[fila][col] + " ");
            }
            System.out.println(); // Salto de línea al terminar de dibujar una fila completa
        }
        
        System.out.println("\n🗺️ Mapa generado con éxito.");
    }
}