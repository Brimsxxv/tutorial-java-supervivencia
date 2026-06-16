package ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Archivos {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE GUARDADO ---");
        String nombreArchivo = "partida_guardada.txt";

        // 1. GUARDAR PARTIDA (Escribir en el archivo)
        try {
            // FileWriter crea el archivo si no existe, o lo sobreescribe si ya existe
            FileWriter escritor = new FileWriter(nombreArchivo);
            escritor.write("Salud: 85\n");
            escritor.write("Inventario: Espada de Madera, Pocion de Salud\n");
            escritor.write("Dia Actual: 5\n");
            escritor.close(); // Siempre hay que cerrar el archivo al terminar
            
            System.out.println("💾 Progreso guardado correctamente en: " + nombreArchivo);
        } catch (Exception e) {
            System.out.println("❌ Error al guardar la partida: " + e.getMessage());
        }

        // 2. CARGAR PARTIDA (Leer del archivo)
        System.out.println("\n--- CARGANDO PARTIDA ---");
        try {
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);
            
            // Leemos línea por línea mientras haya contenido
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println("Leyendo dato -> " + linea);
            }
            lector.close(); // Cerramos el lector
            
            System.out.println("✅ Partida cargada con éxito. ¡Bienvenido de vuelta!");
        } catch (Exception e) {
            System.out.println("❌ Error al cargar la partida: " + e.getMessage());
        }
    }
}