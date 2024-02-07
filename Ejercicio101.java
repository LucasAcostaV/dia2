//Declara dos variables numéricas (con el valor que desees), muestra por consola la
//suma, resta, multiplicación, división y módulo (resto de la división).

public class Ejercicio101 {
    public static void main(String[] args) {
        int numero1 = 6, numero2 = 2, suma, resta, multiplicacion, modulo;
        float division;

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo = numero1 % numero2;

        System.out.printf("La suma es: "+suma);
        System.out.printf("\nLa resta es: "+resta);
        System.out.printf("\nLa multiplicacion es: "+multiplicacion);
        System.out.printf("\nLa division con decimales es %f, la division sin decimales es %1.0f, la division es con dos decimales es %.2f ",division,division,division);
        System.out.printf("\nEl modulo es: "+modulo);

    }
}
