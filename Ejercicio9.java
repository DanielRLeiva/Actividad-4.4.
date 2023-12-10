/**
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores 
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un 
 * valor N y mostrará en qué posiciones del array aparece N.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio9 {
    public static void main(String[] args) {

        int[] numerosEnteros = new int[100];

        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = (int) (1 + Math.random()*10);
        }

        System.out.println("Ingresa un valor N: ");
        int numeroN = Integer.parseInt(System.console().readLine());

        
        System.out.println("La posición de " + numeroN + " en el array es: ");
        
        for (int i = 0; i < numerosEnteros.length; i++) {
            if (numerosEnteros[i] == numeroN) {  // Compara la posición del array con el numero N.
                System.out.println("Posición: " + i);
            }
        }
    }
}
