//Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia
//laboral o no (“De lunes a viernes consideramos dias laborales”).

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio110 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia;

        System.out.printf("Ingrese un dia: ");
        dia = entrada.nextLine().toLowerCase();

        switch (dia){
            case "lunes":
                System.out.printf("Es un dia laboral");
                break;
            case "martes":
                System.out.printf("Es un dia laboral");
                break;
            case "miercoles":
                System.out.printf("Es un dia laboral");
                break;
            case "jueves":
                System.out.printf("Es un dia laboral");
                break;
            case "viernes":
                System.out.printf("Es un dia laboral");
                break;
            default:
                System.out.printf("No es un dia laboral");
                break;
        }
    }
}
