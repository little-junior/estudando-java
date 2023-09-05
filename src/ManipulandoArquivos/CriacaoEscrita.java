package ManipulandoArquivos;

import java.io.*;

public class CriacaoEscrita {
    public static void main(String[] args) {
        String filePath = "F:\\projetos_atuais\\untitled\\src\\ManipulandoArquivos\\teste.txt";

        File myObj = new File(filePath);

        try{
            if(myObj.createNewFile()){
                System.out.println("Arquivo criado com sucesso");
                try {
                    FileWriter escreverArquivo = new FileWriter(filePath);
                    escreverArquivo.write("Arquivo criado e escrito com sucesso");
                    escreverArquivo.close();
                    System.out.println("Arquivo criado e escrito com sucesso");
                } catch (IOException e){
                    System.out.println("deu erro na escrita");
                    e.printStackTrace();
                }
            } else{
                System.out.println("Arquivo já existe");
            }
        }catch(IOException e){
            System.out.println("deu erro na criacao");
            e.printStackTrace();
        }
    }

}
