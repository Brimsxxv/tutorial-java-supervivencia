package ejercicios;

import javax.swing.JOptionPane; // Librería para crear ventanas emergentes

public class Ciclos {
    public static void main(String[] args) {
        int cantidadFrascos = 5;
        // StringBuilder nos ayuda a armar un texto largo
        StringBuilder reporte = new StringBuilder("Iniciando revisión de Lote de Paracetamol:\n\n");

        // Usamos un ciclo FOR para revisar cada frasco automáticamente
        for (int frasco = 1; frasco <= cantidadFrascos; frasco++) {
            reporte.append("💊 Frasco #").append(frasco).append(": Revisado - Fecha de caducidad OK\n");
        }

        reporte.append("\n✅ Todo el lote ha sido revisado con éxito.");
        
        // ¡Magia interactiva! Mostramos el resultado en una ventana real
        JOptionPane.showMessageDialog(null, reporte.toString(), "Sistema de Farmacia - Control de Lotes", JOptionPane.INFORMATION_MESSAGE);
    }
}