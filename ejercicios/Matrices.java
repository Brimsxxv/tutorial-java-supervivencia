package ejercicios;

import javax.swing.JOptionPane;

public class Matrices {
    public static void main(String[] args) {
        // Matriz 3x3 para representar los estantes de la farmacia
        String[][] estantes = {
            {"[Paracetamol]", "[Ibuprofeno]", "[Aspirina]"},
            {"[Amoxicilina]", "[Azitromicina]", "[Penicilina]"},
            {"[Vitamina C]", "[Vitamina D]", "[Complejo B]"}
        };

        // StringBuilder nos ayuda a armar el texto con formato
        StringBuilder vistaEstantes = new StringBuilder("🏪 MAPA DE ESTANTES DE LA FARMACIA\n\n");

        // Usamos dos ciclos 'for' anidados para recorrer filas y columnas
        for (int fila = 0; fila < estantes.length; fila++) {
            vistaEstantes.append("Estante ").append(fila + 1).append(":  ");
            
            for (int col = 0; col < estantes[fila].length; col++) {
                vistaEstantes.append(estantes[fila][col]).append("  ");
            }
            vistaEstantes.append("\n\n"); // Salto de línea por cada estante completo
        }

        // Mostramos el resultado visual en la ventana emergente
        JOptionPane.showMessageDialog(null, vistaEstantes.toString(), "Organización de Inventario", JOptionPane.INFORMATION_MESSAGE);
    }
}