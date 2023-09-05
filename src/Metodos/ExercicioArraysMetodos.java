package Metodos;

public class ExercicioArraysMetodos {

    public static double calculaMedia(int[] idadeAlunos){
        int soma = 0;
        int tamanhoArray = idadeAlunos.length;

        for (int i : idadeAlunos) {
            soma += i;
        }
        return soma/tamanhoArray;
    }

    public static int calculaAlunosMedia(int[] idadesAlunos, double media){
        int quantidadeAlunos = 0;

        for (int idade:idadesAlunos){
            if (idade > media){
                quantidadeAlunos++;
            }
        }

        return quantidadeAlunos;
    }

    public static void main(String[] args) {
        int[] idades = {10, 12, 14, 11, 9};

        double media = calculaMedia(idades);
        int alunosAcimaMedia = calculaAlunosMedia(idades, media);

        System.out.printf("A média de idade da sala é: %.2f\nE a quantidade da alunos acima dela é: %d", media, alunosAcimaMedia);
    }
}
