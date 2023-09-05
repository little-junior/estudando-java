package ManipulandoArquivos;

import java.io.*;
import java.util.Scanner;

public class Leitura {


    public static void main(String[] args) {
        try{
            File myFile = new File("F:\\apps\\GIMP 2\\bin\\libmpc-3.dll");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()){
                String line = myReader.nextLine();
                System.out.println(line);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Error occured.");
            e.printStackTrace();
        }
    }
}
