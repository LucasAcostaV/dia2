//Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
//Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

public class Ejercicio102 {
    public static void main(String[] args) {
        int numero1 = 4, numero2 = 4;

        if(numero1 - numero2 < 0){
            System.out.printf("El numero %d es mayor que el numero %d",numero2,numero1);
        }else if(numero1 - numero2 > 0){
            System.out.printf("El numero %d es mayor que el numero %d",numero1,numero2);
        }else{
            System.out.printf("Los numeros son iguales --> %d = %d",numero1,numero2);
        }
    }
}
