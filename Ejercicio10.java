/**
 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
 * mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
 * por debajo de la media.
 * 
 * @author Daniel Leiva
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Ingrese una cantidad N de personas: ");
        int N = Integer.parseInt(System.console().readLine());

        double[] alturas = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1) + " (en  metros): ");
            alturas[i] = Double.parseDouble(System.console().readLine());
        }

        double sumaAlturas = 0;
        double alturaMaxima = alturas[0];
        double alturaMinima = alturas[0];

        for (double altura : alturas) {
            sumaAlturas += altura;

            if (altura > alturaMaxima) {
                alturaMaxima = altura;
            }

            if (altura < alturaMinima) {
                alturaMinima = altura;
            }
        }
        double alturaMedia = sumaAlturas / N;
        int personasPorEncima = 0;
        int personasPorDebajo = 0;

        for (double altura : alturas) {
            if (altura > alturaMedia) {
                personasPorEncima++;
            }else if (altura < alturaMedia) {
                personasPorDebajo++;
            }
        }
        System.out.println("Altura media: " + alturaMedia);
        System.out.println("Altura máxima: " + alturaMaxima);
        System.out.println("Altura mínima: " + alturaMinima);
        System.out.println("Personas por encima de la media: " + personasPorEncima);
        System.out.println("Personas por debajo de la media: " + personasPorDebajo);
    }
}
