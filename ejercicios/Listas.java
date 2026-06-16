package ejercicios;

import java.util.ArrayList; // Importamos la clase ArrayList

public class Listas {
    public static void main(String[] args) {
        System.out.println("--- ABRIENDO INVENTARIO DEL JUGADOR ---\n");
        
        // Creamos una lista dinámica para guardar Strings (nombres de objetos)
        ArrayList<String> inventario = new ArrayList<>();
        
        // Añadimos objetos al inventario (La lista crece automáticamente)
        inventario.add("Espada de Madera");
        inventario.add("Poción de Salud");
        inventario.add("Antorcha");
        inventario.add("Carne Cruda");
        
        System.out.println("🎒 Tienes " + inventario.size() + " objetos en tu mochila:");
        System.out.println(inventario);
        
        System.out.println("\n🔥 El jugador cocina la 'Carne Cruda' y la consume para recuperar energía...");
        // Removemos el objeto por su nombre (La lista se reduce)
        inventario.remove("Carne Cruda");
        
        System.out.println("\n🎒 Inventario actualizado (" + inventario.size() + " objetos):");
        
        // Recorremos la lista usando un ciclo for-each moderno
        for (String item : inventario) {
            System.out.println("- " + item);
        }
    }
}