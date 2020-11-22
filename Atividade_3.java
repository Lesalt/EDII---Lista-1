import java.util.Scanner;
public class Atividade_3 {
    public static String[][] organizarNotas(String vetorNomes[]){
        Scanner read = new Scanner(System.in);
        String vetorRelacaoNotas[][] = new String[vetorNomes.length][4];
        double nota = 0;
        double media = 0;
        int numeroAluno = -1;
        for(int j = 0; j < vetorNomes.length; j++){
            numeroAluno++;
            for(int k = 0; k < 4; k++){
                if(k < 1){
                    vetorRelacaoNotas[j][k] = vetorNomes[numeroAluno];
                }else if(k > 0 && k < 3){
                    System.out.println("Informe a " + k + "º nota do " + (numeroAluno + 1) + "º aluno: ");
                    nota = read.nextDouble();
                    vetorRelacaoNotas[j][k] = Double.toString(nota);
                }else{
                    media = (Double.parseDouble(vetorRelacaoNotas[j][k-2]) + Double.parseDouble(vetorRelacaoNotas[j][k-1]))/2.0;
                    vetorRelacaoNotas[j][k] = Double.toString(media);
                }
            }
        }
        return vetorRelacaoNotas;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String vetorNomes[] = new String[5];
        String nome = "";
        for(int i = 0; i < vetorNomes.length; i++){
            System.out.println("Informe o nome do " + (i + 1) + "º aluno: ");
            nome = read.nextLine();
            vetorNomes[i] = nome;
        }
        String relacaoNotas[][] = organizarNotas(vetorNomes);
        String resul = "|Nome | Nota1 | Nota2 | Media |";
        for(int j = 0; j < vetorNomes.length; j++){
            resul += "\n";
            for(int k = 0; k < 4; k ++){
                resul += " |"+ relacaoNotas[j][k] +"| ";
            }
        }
        System.out.println(resul);
    }
}
