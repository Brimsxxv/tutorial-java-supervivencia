package ejercicios;

import javax.swing.JOptionPane;

public class Metodos {

    // MÉTODO 1: Aplica un descuento al precio original
    public static double calcularDescuento(double precioOriginal, double porcentajeDescuento) {
        double descuento = precioOriginal * (porcentajeDescuento / 100);
        return precioOriginal - descuento;
    }

    // MÉTODO 2: Agrega el 15% de IVA a la compra
    public static double aplicarIVA(double precioBase) {
        return precioBase * 1.15;
    }

    public static void main(String[] args) {
        try {
            // Pedimos el dato al usuario con una ventana interactiva
            String input = JOptionPane.showInputDialog(null, "Ingrese el precio del medicamento ($):", "Caja Registradora", JOptionPane.QUESTION_MESSAGE);

            // Verificamos que el usuario no haya cancelado la ventana
            if (input != null && !input.isEmpty()) {
                double precioInicial = Double.parseDouble(input);

                // Llamamos a nuestros métodos para hacer los cálculos
                double precioConDescuento = calcularDescuento(precioInicial, 10); // 10% de descuento por cliente frecuente
                double precioFinal = aplicarIVA(precioConDescuento);

                // Preparamos el ticket formateando los números a 2 decimales
                String ticket = String.format("🧾 TICKET DE VENTA\n\nPrecio Original: $%.2f\nDescuento aplicado (10%%): $%.2f\nTotal a Pagar (con IVA 15%%): $%.2f", 
                                              precioInicial, precioConDescuento, precioFinal);

                // Mostramos el resultado final
                JOptionPane.showMessageDialog(null, ticket, "Transacción Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Por si el usuario escribe letras en lugar de números
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un número válido.", "Error de Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
}