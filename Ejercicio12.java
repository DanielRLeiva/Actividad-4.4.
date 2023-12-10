/**
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
 * distintas opciones:
 * 
 *      a. Mostrar valores.
 *      b. Introducir valor.
 *      c. Salir.
 * 
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
 * hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int[] array = new int[10];

        while (true) {

            System.out.println();
            System.out.println("Menú opciones: ");
            System.out.println("---------------------");
            System.out.println();
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir");
            System.out.println();

            System.out.println("Seleccione una opción: ");
            System.out.println();
            String opcion = System.console().readLine();
            System.out.println();

            switch (opcion) {

                case "a":
                    System.out.println("Los valores del array son: ");
                    System.out.println();
                    mostrarArray(array);
                    break;

                case "b":
                    try {                    
                        System.out.println("Ingrese un valor (V): ");
                        System.out.println();
                        int valor = Integer.parseInt(System.console().readLine());

                        System.out.println();
                        System.out.println("Ingrese una posicón (P): ");
                        System.out.println();
                        int posicion = Integer.parseInt(System.console().readLine());
                        if (posicion >= 0 && posicion < array.length) {
                            introducirValor(array, valor, posicion);
                        } else {
                            System.out.println("La posicion elegida no es válida. ");
                            System.out.println();
                        }
                    }catch (NumberFormatException nfe) {
                        System.out.println("Ingrese un valor válido (número entero): ");
                        System.out.println();
                    }
                    break; 
                
                case "c":
                    System.out.println("Ha terminado el programa.");
                    System.exit(0);
            
            default:
                    System.out.println("Opción no válida. Intentelo de nuevo.");
                    System.out.println();
            }
        }
    }

    /**
     * Funcion para imprimir el array.
     * 
     * @param array
     */
    public static void mostrarArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }  

    /**
     * Funcion para guardar e imprimir la introduccion de los distintos valores.
     * 
     * @param array Se guarda la posicion y el valor en el array.
     * @param valor valor introducido en el array.
     * @param posicion posicion introducida del valor.
     */
    public static void introducirValor (int[] array, int valor, int posicion) {
        array[posicion] = valor;
        System.out.println();
        System.out.println("El valor " + valor + " se ha insertado en la posicion " + posicion + ".");
    }  
}
