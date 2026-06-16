# 🎒 Módulo 4: Listas (El Inventario)

Hasta ahora vimos que los Vectores y Matrices son útiles, pero tienen un límite: **su tamaño es fijo**. Si creas un arreglo de 5 espacios, no puedes guardar 6 cosas. 

Pero en un juego, el jugador recoge y tira objetos constantemente. Para manejar datos que cambian de tamaño, usamos las **Listas**, específicamente `ArrayList` en Java. Las listas son "dinámicas", es decir, crecen cuando añades un elemento (con `.add()`) y se encogen cuando lo quitas (con `.remove()`).

## 🎮 Ejercicio Práctico: Mochila Dinámica
En este ejercicio, hemos programado el inventario del jugador usando un `ArrayList`. Simulamos la recolección inicial de objetos, consultamos el tamaño de la lista con `.size()`, y luego eliminamos un objeto específico tras ser consumido.

📥 **[Haz clic aquí para ver y descargar el código fuente del sistema de inventario](ejercicios/Listas.java)**