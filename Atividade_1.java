import java.util.Scanner;
public class Atividade_1 {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String vetor[] = new String[5];
        String nome;
        String searchNome;
        String resul = "";
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Informe o " + (i + 1) + "º nome: ");
            nome = read.nextLine();
            vetor[i] = nome;
        }
        System.out.println("Informe o nome que deseja procurar: ");
        searchNome = read.nextLine();
        for(int j = 0; j < vetor.length; j++){
            if(vetor[j].equals(searchNome)){
                resul = String.format("O nome (" + searchNome + ") está na " + (j + 1) + "º posição do vetor.");
                break;
            }else{
                resul = "Nome não encontrado";
            }
        }
            System.out.println(resul);
    }
}
