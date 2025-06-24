import java.util.ArrayList;

public class somaArrays {

    public static int somaVetores(ArrayList<Integer> vetorA, ArrayList<Integer> vetorB){
        int soma = 0;
        
        for(int i = 0; i < vetorA.size() ; i++){
            soma += vetorA.get(i) + vetorB.get(i);
        }
        System.out.println("Valor da soma dos vetores indicados: " + soma);
        return soma;
    }

    public static String concatPalavras(ArrayList<String> arrayA , ArrayList<String> arrayB){
        String concatenação = null;
        StringBuilder sb = new StringBuilder();
        for(String palavra : arrayA){
            sb.append(palavra).append(", ");
        }

        for(String palavra : arrayB){
            sb.append(palavra).append(", ");
        }
        concatenação = sb.toString().replaceAll(", $", "");
        
        return concatenação;
    }

    public static String ordenandoStrings(String palavras){
        String ordenado = null;
        for(int i = 0; i < palavras.length(); i++){
            char letra = 0;
            letra = palavras.charAt(i);

        }

        return ordenado;
    }

    public static void main(String[] args){
        ArrayList<String> vetor1 = new ArrayList<>();
        ArrayList<String> vetor2 = new ArrayList<>();

        vetor1.add("Banana");
        vetor2.add("Maçã");
        vetor1.add("Aveia");
        vetor2.add("Cereal");


        System.out.println("vetor1: " + vetor1);
        System.out.println("vetor2: " + vetor2);

        String caféDaManhã = null;
        caféDaManhã = concatPalavras(vetor1, vetor2);
        System.out.println("O café da Manhã tem esses itens: " + caféDaManhã);

    }
}
