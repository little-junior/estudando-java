package Excecoes;
import Excecoes.MinhaExcecao;

import java.sql.SQLException;

public class TratandoExcecoes {
    public static void main(String[] args) {
        String[] palavra = {"aaaaaaaaaaaaa"};

        if (palavra.length < 2){
            throw new MinhaExcecao("MENOR QUE DOIS");
        }
    }

}
