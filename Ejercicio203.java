//Hacer una función que, dada una palabra (String) o frase, diga si la misma es palíndrome o
//no. Una palabra/frase palíndrome es aquella que se lee igual tanto de atrás para adelante,
//como de adelante para atrás. Ejemplos de palíndromes: "MADAM", "RACECAR", "AMORE,
//ROMA", "BORROW OR ROB", "WAS IT A CAR OR A CAT I SAW?".

import java.util.Scanner;

public class Ejercicio203 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase, fraseSinEspacio;
        int i,j,c=0;

        System.out.printf("Ingrese una frase o palabra: ");
        frase = entrada.nextLine().toLowerCase();

        fraseSinEspacio = frase.replaceAll(" ","");

        for (i=0; i<fraseSinEspacio.length(); i++){
            for (j=fraseSinEspacio.length()-1; j>0; j--)
                if (fraseSinEspacio.charAt(i) == fraseSinEspacio.charAt(j)){
                    c+=1;
                    break;
                }
        }

        if (c == fraseSinEspacio.length()){
            System.out.printf("La frase o palabra es palindrome ");
        }else {
            System.out.printf("La frase o palabra no es palindrome");
        }
    }
}
