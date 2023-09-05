package Metodos;

public class Recursao {
    static int fatorial(int x) {

        if (x > 1) {
            return x * fatorial(x - 1);
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        int resultado = fatorial(6);
        System.out.println(resultado);
    }

}
