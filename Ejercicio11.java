/**
 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
 * primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] primerArray = new int[100];
        int[] segundoArray = new int[100];

        for (int i = 0; i < primerArray.length; i++) {
            primerArray[i] = i + 1;
        }

        for (int i = 0; i < primerArray.length; i++) {                  // Con la formula primerArray.length - 1 tomamos el ultimo valor
            segundoArray[i] = primerArray[primerArray.length - 1 - i];  // del primer array y restando i avanzamos en las posiciones anteriores del array.
        }

        System.out.println("Los valores del primer array son: ");
        mostrarArray(primerArray);
        System.out.println("Los valores del segundo array en oreden inverso son: ");
        mostrarArray(segundoArray);           
        
    }
    /**
     * Funcion para imprimir los array's.
     * 
     * @param array 
     */
    public static void mostrarArray (int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
