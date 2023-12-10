/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre 
 * 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real 
 * R. Por último, mostrará cuántos valores del array son igual o superiores a R.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        double[] numerosReales = new double[100];

        for (int i = 0; i < numerosReales.length; i++) {
            numerosReales[i] = Math.random();   
        }

        System.out.println("Ingresa un número real R: ");
        double valorR = Double.parseDouble(System.console().readLine());

        int contadorValores = 0;

        for (double numero : numerosReales) { // La variable numero en cada iteracion toma el valor del array numerosReales.
            if (numero >= valorR) {
                contadorValores++;
            }
        }
        System.out.println("La cantidad de valores iguales o superiores a R son: " + contadorValores);
    }
}