# 🥞 TDA Pila (Stack) - Implementación en Java 26

Este repositorio contiene la implementación del **Tipo de Dato Abstracto (TDA) Pila** utilizando una estructura de datos enlazada (nodos) en Java. El código está basado en los conceptos teóricos y prácticos presentados en la **Conferencia 3**.

## 📌 Características Principales

* **Esquema LIFO (Last In, First Out):** El último elemento en entrar es el primero en salir.
* **Estructura Dinámica:** Implementada mediante nodos enlazados (`Node<E>`), sin límite de tamaño predefinido.
* **Genérica:** Utiliza tipos genéricos `<E>` para permitir almacenar cualquier tipo de objeto (String, Integer, etc.).
* **Manejo de Errores:** Los métodos `Top()` y `Pop()` devuelven `null` si la pila está vacía, evitando excepciones no controladas.

## 📂 Estructura del Proyecto

El código se divide en los siguientes archivos:

* `IStack.java`: Interfaz que define las operaciones básicas del TDA Pila.
* `Node.java`: Clase genérica que representa un nodo (almacena `info` y referencia `next`).
* `LinkedStack.java`: Clase que implementa la pila usando los nodos.
* `Main.java`: Clase de prueba que demuestra el uso de la pila.

## 🛠️ Operaciones Implementadas

| Operación | Descripción | Complejidad |
| :--- | :--- | :--- |
| **`Push(E item)`** | Agrega un nuevo elemento en la cima de la pila. | O(1) |
| **`Pop()`** | Elimina y devuelve el elemento en la cima. | O(1) |
| **`Top()`** | Devuelve el elemento en la cima sin eliminarlo. | O(1) |
| **`isEmpty()`** | Verifica si la pila está vacía (`true`/`false`). | O(1) |

## 💻 Código de Ejemplo

Así de sencillo es usar la implementación:

```java
public class Main {
    public static void main(String[] args) {
        LinkedStack<String> pila = new LinkedStack<>();

        // Push
        pila.Push("Elemento 1");
        pila.Push("Elemento 2");
        pila.Push("Elemento 3");

        // Top
        System.out.println("Cima actual: " + pila.Top()); // Elemento 3

        // Pop
        System.out.println("Extraído: " + pila.Pop()); // Elemento 3
        System.out.println("Nueva cima: " + pila.Top()); // Elemento 2
    }
}
