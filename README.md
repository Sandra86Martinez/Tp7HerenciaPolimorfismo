
# PROGRAMACIÓN II - TRABAJO PRÁCTICO 7: HERENCIA Y POLIMORFISMO EN JAVA

Este repositorio contiene las soluciones y ejercicios del Módulo 5, enfocados en la aplicación práctica de los pilares del diseño Orientado a Objetos: **Herencia** y **Polimorfismo**.

## Objetivo Principal

El objetivo central es desarrollar jerarquías de clases flexibles y reutilizables en Java, demostrando la aplicación de los siguientes conceptos:

-   **Herencia (`extends`):** Crear relaciones "es un" (is-a) entre clases base (superclases) y clases derivadas (subclases).
-   **Polimorfismo:** Utilizar la sobrescritura (`@Override`) y las llamadas dinámicas a métodos.
-   **Abstracción:** Definir comportamientos comunes obligatorios mediante **Clases y Métodos Abstractos**.

## Ejercicios Clave (Katas)

La práctica se estructura en Katas para afianzar la aplicación de los conceptos:

| Kata | Concepto Central | Implementación |
| :--- | :--- | :--- |
| **1. Vehículos** | Herencia Básica y `super()` | Jerarquía simple para demostrar la reutilización de código. |
| **2. Figuras Geométricas** | **Clases y Métodos Abstractos** | Uso de `abstract` para obligar a subclases (`Círculo`, `Rectángulo`) a implementar `calcularArea()`. |
| **3. Empleados** | Polimorfismo y `instanceof` | Lista polimórfica de empleados; llamada dinámica a `calcularSueldo()` y clasificación segura. |
| **4. Animales** | Sobrescritura (`@Override`) | Implementación de comportamiento único (`hacerSonido()`) en subclases (`Perro`, `Gato`, `Vaca`). |

## Conclusiones Esenciales

Al finalizar esta práctica, se consolida la comprensión sobre:

-   El uso de `super()` para la correcta inicialización de objetos.
-   La aplicación de `instanceof`, `Upcasting` y `Downcasting` para el manejo seguro de objetos en jerarquías.
-   El diseño modular y flexible mediante la abstracción.
