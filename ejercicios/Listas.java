package ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listas {
    public static void main(String[] args) {
        // Creamos una lista dinámica para el carrito de compras
        ArrayList<String> carrito = new ArrayList<>();

        // Añadimos productos al carrito (la lista crece sola)
        carrito.add("💊 Caja de Paracetamol");
        carrito.add("🧴 Alcohol en Gel");
        carrito.add("🩹 Paquete de Curitas");
        carrito.add("🍬 Pastillas para la tos");

        // Mostramos el carrito inicial
        StringBuilder ticketInicial = new StringBuilder("🛒 CARRITO DE COMPRAS ACTUAL:\n\n");
        for (String item : carrito) {
            ticketInicial.append("- ").append(item).append("\n");
        }
        ticketInicial.append("\nTotal de artículos: ").append(carrito.size());
        
        JOptionPane.showMessageDialog(null, ticketInicial.toString(), "Revisión de Carrito", JOptionPane.INFORMATION_MESSAGE);

        // Simulamos que el cliente saca un producto del carrito
        carrito.remove("🧴 Alcohol en Gel");
        JOptionPane.showMessageDialog(null, "El cliente devolvió el 'Alcohol en Gel'. Actualizando...", "Modificación", JOptionPane.WARNING_MESSAGE);

        // Mostramos el carrito final actualizado
        StringBuilder ticketFinal = new StringBuilder("🛒 CARRITO FINAL:\n\n");
        for (String item : carrito) {
            ticketFinal.append("- ").append(item).append("\n");
        }
        ticketFinal.append("\nTotal de artículos a facturar: ").append(carrito.size());

        JOptionPane.showMessageDialog(null, ticketFinal.toString(), "Listo para pagar", JOptionPane.INFORMATION_MESSAGE);
    }
}