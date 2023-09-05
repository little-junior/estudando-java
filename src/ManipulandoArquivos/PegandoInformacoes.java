package ManipulandoArquivos;

import java.io.*;

public class PegandoInformacoes {
    public static void main(String[] args) {
        File myFile = new File("texto1.txt");
        if (myFile.exists()){
            System.out.println("Nome do arquivo: " + myFile.getName());
            System.out.println("Caminho do arquivo: " + myFile.getAbsolutePath());
            System.out.println("É legível? : " + myFile.canRead());
            System.out.println("É escritivel? : " + myFile.canWrite());
            System.out.println("Tamanho do arquivo: " + myFile.length());
        }
    }
}
