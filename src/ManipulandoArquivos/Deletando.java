package ManipulandoArquivos;
import java.io.*;

public class Deletando {
    public static void main(String[] args) {
        File myFile = new File("F:\\projetos_atuais\\untitled\\src\\ManipulandoArquivos\\GIMP 2.10.34.lnk");
        System.out.println(myFile.delete());
    }
}
