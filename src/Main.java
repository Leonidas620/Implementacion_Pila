public class Main {
    public static void main(String[] args) {
        System.out.println("--- LinkedStack ---");

        // Crea una instancia de la pila genérica
        LinkedStack<String> pila = new LinkedStack<>();

        // Inserta cuatro elementos
        pila.Push("Elemento 1");
        pila.Push("Elemento 2");
        pila.Push("Elemento 3");
        pila.Push("Elemento 4");
        System.out.println("Se insertaron 4 elementos.");

        // Elimina el último elemento insertado (Elemento 4)
        System.out.println("Elemento extraído (Pop): " + pila.Pop());

        // Consulta y muestra el elemento en la parte superior actual (Elemento 3)
        System.out.println("Elemento en la cima actual (Top): " + pila.Top());

        // Verificamos que la pila no esté vacía
        System.out.println("¿La pila está vacía?: " + pila.isEmpty());
    }
}
