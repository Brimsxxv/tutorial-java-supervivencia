package ejercicios;

import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Archivos {
    public static void main(String[] args) {
        // Pedimos el nombre del cliente de forma interactiva
        String cliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente para generar la factura:", "Facturación", JOptionPane.QUESTION_MESSAGE);
        
        // Verificamos que sí haya escrito un nombre
        if (cliente != null && !cliente.trim().isEmpty()) {
            // Creamos un nombre de archivo personalizado (ej: Factura_Jeremy.txt)
            String nombreArchivo = "Factura_" + cliente.replaceAll(" ", "_") + ".txt";
            
            try {
                // FileWriter crea el archivo en el disco duro
                FileWriter escritor = new FileWriter(nombreArchivo);
                escritor.write("=== FARMACIA LA SALUD ===\n");
                escritor.write("Cliente: " + cliente + "\n");
                escritor.write("-------------------------\n");
                escritor.write("- Caja de Paracetamol\n");
                escritor.write("- Paquete de Curitas\n");
                escritor.write("- Pastillas para la tos\n");
                escritor.write("-------------------------\n");
                escritor.write("Total pagado: $12.50\n");
                escritor.write("¡Gracias por su compra!");
                
                escritor.close(); // Siempre cerramos el archivo para liberar memoria
                
                // Confirmación visual del éxito
                JOptionPane.showMessageDialog(null, "✅ Factura guardada exitosamente en su computadora como:\n" + nombreArchivo, "Operación Completada", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception e) {
                // Si algo sale mal, mostramos el error
                JOptionPane.showMessageDialog(null, "❌ Error al guardar la factura: " + e.getMessage(), "Error de Sistema", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada. No se generó la factura.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}