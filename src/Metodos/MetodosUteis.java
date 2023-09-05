package Metodos;

import java.util.Arrays;

public class MetodosUteis {
    public static void main(String[] args) {
        String palavra = "aeiou";

        System.out.println(palavra.charAt(0) + "" + palavra.charAt(2));

        String palavra2 = "BRASIL EUA ARGENTINA";

        String[] palavrasSeparadas = palavra2.split(" ");

        System.out.println(Arrays.toString(palavrasSeparadas));

        String inteiro = "5";
        String quebrado = "5.5";
        String dobro = "9.3123123";

        int inteiroInt = Integer.parseInt(inteiro);
        float quebradoFlo = Float.parseFloat(quebrado);
        double dobroDobro = Double.parseDouble(dobro);

        System.out.printf("Inteiro: %d%nFloat: %f%nDouble: %f", inteiroInt, quebradoFlo, dobroDobro);

    }
}
