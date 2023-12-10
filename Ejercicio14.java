/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, 
 * y luego la muestre por pantalla.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        int[] array = new int[100];

        int secuencia = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                array[secuencia] = i;
                secuencia++;
            }
        }
        System.out.println("La secuencia generada es: ");
        mostrarArray(array, secuencia);
    }

    /**
     * Funcion para imprimir el array.
     * 
     * @param array 
     * @param secuencia 
     */
    public static void mostrarArray(int[] array, int secuencia) {
        for (int i = 0; i < secuencia; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
