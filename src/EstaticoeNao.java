public class EstaticoeNao {
    int numero = 10;
    static int modificavel = 0;

    public void mudar(int a){
        numero = a;
    }

    public static void nMudar(int b){
        modificavel = b;
    }

    public static void main(String[] args) {
        EstaticoeNao teste = new EstaticoeNao();

        nMudar(2);

        teste.mudar(3);

        System.out.println(modificavel);
        System.out.println(teste.modificavel);
        System.out.println(teste.numero);
    }
}
