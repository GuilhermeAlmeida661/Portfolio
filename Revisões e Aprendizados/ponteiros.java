import java.util.HashMap;
import java.util.ArrayList;

public class ponteiros {

    //métodos de manipulação de ponteiros

    static void pegaValor(int[] vetor){
        int ponteiro = 0;
        int ponteiroDir_Esq = 0;
        int tamanho = vetor.length - 1; //lembrando que para pegar o ultimo indice válido tem que ser length - 1
        int meio_Fim = vetor.length/2;
        System.out.println(meio_Fim);
        int ponteiroMeio_Fim = 0;
        /*for(int i = 0; i < vetor.length ; i++){
            ponteiro = vetor[i];
            System.out.println("Os valores contidos nesse vetor são: " + ponteiro);
        }
        for(int i = tamanho; i >= 0 ; i--){ // andando no vetor da direita p/ esquerda
            ponteiroDir_Esq = vetor[i];
            System.out.println("O vetor da direita p/ esquerda vai assim: " + ponteiroDir_Esq);
        }*/
        for(int i = meio_Fim; i <= tamanho; i++){ // andando no vetor do meio para o extremo da direita
            ponteiroMeio_Fim = vetor[i];
            System.out.println("Assim anda o ponteiro do meio para a direita do vetor: " + ponteiroMeio_Fim);
        }
        for(int i = meio_Fim; i >= 0; i--){
            ponteiroMeio_Fim = vetor[i];
            System.out.println("Assim vai andar o ponteiro do meio para a esquerda do vetor: " + ponteiroMeio_Fim);
        }
    }

    static void pegaReferencia(int[] vetor){
        int ponteiro = 0;
        for(int i = 0; i < vetor.length; i++){
            ponteiro = i;
            System.out.println("As posições existentes nesse vetor são: " + ponteiro);
        }
    }

    public static void main(String[] args){
        //chamada dos valores do vetor
        int[] vetor1 = {1,2,3,4,5,6,7,8,9};
        pegaValor(vetor1);
        
        //Lista e suas manipulações
        ArrayList<String> meuArray = new ArrayList<>();
        meuArray.add("Banana");
        meuArray.add("Goiaba");
        meuArray.add("Uva");
        meuArray.add("Morango");
        meuArray.removeFirst(); //Remove "Banana"
        meuArray.add("Umbu");

        //deve remover tudo
        // se for só remove ele mesmo dentro de um laço ele roda somente uma única vez
        for(int i = 0; i < meuArray.size() -1; i++){
            meuArray.remove(meuArray.get(i)); 
            System.out.println(meuArray.size());
        }
        // A lista deve estar null ou 0
         for(String fruta : meuArray){
            System.out.println(fruta);
        }

    }
}
