/**
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
 * luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
 * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
 * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
 * usuario V, I además de N (nº de valores a crear).
 * 
 * @author Daniel Leiva
 */
public class Ejercicio13 {
    public static void main(String[] args) {

        int valorInicial = obtenerValor("Ingrese un valor inicial (V): ");
        int incremento = obtenerValor("Ingrese el incremento (I): ");
        int numeroDeValores = obtenerValor("Ingrese el número de valores (N): ");

        int[] secuencia = new int[numeroDeValores];

        for (int i = 0; i < numeroDeValores; i++) {
            secuencia[i] = valorInicial + i * incremento;
        }

        System.out.println("La secuencia aritmética generada es: ");
        mostrarArray(secuencia);

    }

    /**
     * Funcion para obtener los distintos valores.
     * 
     * @param mensaje Mensaje para pedir cada valor.
     * @return devuelve la lectura de teclado.
     */
    public static int obtenerValor (String mensaje) {
        System.out.println(mensaje);
        int valor = Integer.parseInt(System.console().readLine());
        return valor;
    }

    /**
     * Funcion para imprimir el array generado.
     * 
     * @param array 
     */
    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }  
}
