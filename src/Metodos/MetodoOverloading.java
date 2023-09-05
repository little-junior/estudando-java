package Metodos;

public class MetodoOverloading {
    public static int somarAlgo(int x, int y) {
        return x + y;
    }

    public static double somarAlgo(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int somaInteiro = somarAlgo(1, 2);
        double somarDouble = somarAlgo(1.2, 0.8);

        System.out.println(somaInteiro);
        System.out.println(somarDouble);
    }


}
