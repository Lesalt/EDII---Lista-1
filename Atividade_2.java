import java.util.Scanner;

public class Atividade_2 {
    public static String ordenarCrescente(int vetor[]){
        int vetorAux[] = vetor;
        String retorno = "";
        for (int i = 1; i < vetorAux.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetorAux[i] < vetor[j]) {
                    int temp = vetorAux[i];
                    vetorAux[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        for(int i = 0; i < vetor.length; i++){
            retorno += vetor[i] + " ";
        }
        return retorno;
    }
    public static String ordenarDecrescente(int vetor[]){
        int vetorAux[] = vetor;
        String retorno = "";
        for (int i = 1; i < vetorAux.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetorAux[i] > vetor[j]) {
                    int temp = vetorAux[i];
                    vetorAux[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        for(int i = 0; i < vetor.length; i++){
            retorno += vetor[i] + " ";
        }
        return retorno;
    }
    public static String paresAndSoma(int vetor[]){
        String pares = "";
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 == 0) {
                pares += vetor[i] + " ";
                soma += vetor[i];
            }
        }
        String resul = String.format("Numeros pares: " + pares + "\nSoma: " + soma);
        return  resul;
    }
    public static String imparesAndProduto(int vetor[]){
        String impares = "";
        int prod = 1;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] % 2 != 0) {
                impares += vetor[i] + " ";
                prod *= vetor[i];
            }
        }
        String resul = String.format("Numeros ímpares: " + impares + "\nProduto: " + prod);
        return resul;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int vetorNums[] = new int[15];
        int num;
        int question = Integer.MIN_VALUE;
        for(int i = 0; i < vetorNums.length; i++){
            num = Integer.parseInt(read.nextLine());
            vetorNums[i] = num;
        }
        while(question != 0){
            System.out.println("Digite:\n1)Vetor em ordem crescente.\n2)Vetor em ordem decrescente.\n3)Números pares e soma.\n4)Números ímpares e soma.\n0)PARA ENCERRAR.");
            question = Integer.parseInt(read.nextLine());
            switch (question){
                case (1):
                    System.out.println(ordenarCrescente(vetorNums));
                    break;
                case(2):
                    System.out.println(ordenarDecrescente(vetorNums));
                    break;
                case(3):
                    System.out.println(paresAndSoma(vetorNums));
                    break;
                case(4):
                    System.out.println(imparesAndProduto(vetorNums));
                    break;
                case(0):
                    question = 0;
                    break;
                default:
                    System.out.println("O número digitado não condiz com nenhuma das opções! Digite novamente: ");
            }
        }
    }
}
