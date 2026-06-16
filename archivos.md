# 💾 Módulo 5: Manejo de Archivos (Guardar y Cargar)

Hasta ahora, toda la información de nuestro juego (la salud, el inventario, el mapa) se almacena en la memoria RAM, lo que significa que se borra en el momento que cerramos el programa. Para que los datos persistan en el tiempo, necesitamos el **manejo de archivos**.

El manejo de archivos nos permite comunicarnos con el disco duro de la computadora. Podemos crear archivos de texto, escribir variables en ellos para "guardar la partida", y luego abrir esos mismos archivos para leer el texto y "cargar" nuestro progreso.

## 🎮 Ejercicio Práctico: Sistema de Guardado
En este ejemplo, creamos un script en Java que simula guardar el estado actual del jugador. Utilizamos la clase `FileWriter` para crear un archivo llamado `partida_guardada.txt` y escribir la salud y el inventario en él. Inmediatamente después, usamos la clase `Scanner` para leer ese mismo archivo línea por línea y mostrarlo en pantalla, completando el ciclo de guardado y carga.

📥 **[Haz clic aquí para ver y descargar el código fuente del sistema de guardado](ejercicios/Archivos.java)**