import java.util.Scanner;

//Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.

public class Ejercicio104 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.printf("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.printf("Bienvenido "+nombre);
    }
}
