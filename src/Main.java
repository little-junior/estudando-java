public class Main {
    public static boolean palindromo(int x) {
        String xReverse = Integer.toString(x);

        String palavra = new StringBuilder(xReverse).reverse().toString();

        return xReverse.equals(palavra);
    }
    public static void main(String[] args) {
        System.out.println(palindromo(121));
    }
}