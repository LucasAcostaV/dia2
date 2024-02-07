//Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
//se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
//mas la contraseña y mostrara un mensaje diciendo “Correcto!”. Piensa bien en la
//condición de salida (3 intentos y si acierta sale, aunque le queden intentos, si no acierta
//en los 3 intentos mostrar el mensaje “Fallaste jaja!!”).

import java.util.Scanner;

public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contraseña = "1597", pin, pinDeCuatroDigitos;
        int i=0,j=0,c=0;
        boolean bandera = true;

        do{
            c=0;

            System.out.printf("Introduzca su pin (de cuatro digitos): ");
            pin = entrada.nextLine();
            pinDeCuatroDigitos = pin.substring(0, Math.min(pin.length(), 4));

            for (i=0;i<4;i++){
                if(contraseña.charAt(i) == pinDeCuatroDigitos.charAt(i)){
                    c += 1;
                }else {
                    break;
                }
            }

            j++;
        }while(j < 3 && c < 4);

        if (c==4){
            System.out.printf("Correcto!");
        }else{
            System.out.printf("Fallaste, jaja!");
        }

    }
}
