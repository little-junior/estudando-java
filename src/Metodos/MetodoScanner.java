package Metodos;

import java.util.Scanner;

public class MetodoScanner {
    static Scanner scan = new Scanner(System.in);

    public static int lerInteiro(){
        int a = scan.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int num = lerInteiro();

        System.out.println(num);
    }
}
