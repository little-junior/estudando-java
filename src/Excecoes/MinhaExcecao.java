package Excecoes;

public class MinhaExcecao extends RuntimeException{
        //Chame os contrutores da classe mãe.

        public MinhaExcecao(String mensagem) {
            super(mensagem);
        }


        public MinhaExcecao(String mensagem, Throwable error) {
            super(mensagem, error);
        }
    }
