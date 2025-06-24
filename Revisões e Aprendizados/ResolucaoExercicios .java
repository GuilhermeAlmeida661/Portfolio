import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*Exercicios de Fundamentos de programação em Java(Looping e Condicionais, Vetores e Arrays)*/

public class ResolucaoExercicios{
    public static void main(String[] args) throws Exception {
        //para o usuário digitar os dados para a resolução dos exercicios -> Scanner//
        Scanner scanner = new Scanner(System.in);
        int number = -1221;
        int target = 7;
        int[] nums = {1,3,5,6};
        boolean knightIsAwake = true;
        List<Integer>sumElementsArray = new ArrayList<>();

        //aqui temos as chamadas dos métodos para serem testados e ver se estão corretas as soluções
        //para verificar basta "descomentar" os métodos
        System.out.println("Exercicio 1:");
        System.out.println("Verifique se o numero digitado ele é Par ou Ímpar.\n");
        //verificaParOuImpar(scanner);
        System.out.println("Exercicio 2:");
        System.out.println("O usuário digitará um número e você tem que mostrar a tabuada de 0 ao 10 desse número usando 'For'.\n");
        //Tabuada(scanner);
        System.out.println("Exercicio 3:");
        System.out.println("Some os digitos de um número inteiro.\n");
        //SomaDigitos(scanner);
        System.out.println("Exercicio 4:");
        System.out.println("Mostre o fatorial de um número que é digitado pelo usuário.\n");
        //Fatorial(scanner);
        System.out.println("Exercicio 5:");
        System.out.println("Imprima todos os Números Primos entre 0 e 100.\n");
        //primos();
        System.out.println("Exercicio 6:");
        System.out.println("Crie um vetor de 10 números inteiros e calcule a soma de todos os elementos.\n");
        //somaElementos();
        System.out.println("Exercicio 7:");
        System.out.println("Crie um vetor com 5 números. Desloque os elementos para a direita, de forma que o último vire o primeiro.\n");
        //avançaElementos(); -LeetCode
        //isPalindrome(number); -LeetCode
        //searchInsert(nums, target); -HackerRank
        simpleArraySum(sumElementsArray);
        //fechar a leitura de dados do teclado, boa prática de programação
        //canFastAttack(knightIsAwake);
        scanner.close();
        
    }
        //Exercicio 1 - Escreva um programa que receba um número inteiro do usuário e diga se ele é par ou ímpar.

        private static void verificaParOuImpar(Scanner scanner){
            System.out.println("Digite um número positivo para a verificação: ");
            int numero = scanner.nextInt();
            if(numero < 0){
                System.out.println("Este número é negativo, por favor insira um novo número");
            }
            if(numero % 2 == 0){
                System.out.println("Esse número que você digitou é Par.\n");
            }
            else{
                System.out.println("O número digitado é Ímpar.\n");
            }
        }

        private static void Tabuada(Scanner scanner){
            System.out.println("Digite Um número para saber a tabuada completa dele de 0 a 10:");
            int numero = scanner.nextInt();
            for(int i = 0; i <= 10; i++){
                System.out.printf("A tabuada do %d x %d é: %d\n", numero, i, numero*i);
            }

        }

        private static void SomaDigitos(Scanner scanner){
            int soma = 0;
            System.out.println("Digite um número inteiro para que os digitos sejam somados:");
            int numero = scanner.nextInt();
            while(numero != 0){
                int ultimoDigito = numero % 10;
                soma += ultimoDigito;
                numero = numero/10;
            }
            System.out.printf("A soma dos digitos é: %d\n", soma);
        }

        private static void Fatorial(Scanner scanner){
            int fatorial = 1;
            System.out.println("Digite um número para saber o fatorial dele:");
            int numero = scanner.nextInt();
            while(numero != 0){
                fatorial = fatorial * (numero--);
            }
            System.out.printf("O fatorial dele é: %d\n", fatorial);
        }

        private static void primos(){
            int primo = 1;
            while(primo < 100){
                if(primo % 2 == 0 || primo % 3 == 0){
                    if(primo % 5 == 0 || primo % 7 == 0){
                    }
                }
                else{
                    System.out.println(+ primo);
                }
                primo++;
            }
        }

        //Teste de resposta do exercism Annalyn's Infiltration
        private static boolean canFastAttack(boolean knightIsAwake){
            System.out.println("Can Annalyn perform a fast attack?");
            if(knightIsAwake){
                System.out.println("False\n");
                return false;
            }
            if(!knightIsAwake){
                System.out.println("True\n");
                return true;
            }
            else{
                return true;
            }
        }

        private static int somaElementos(){
            int soma = 0;
            int[] vector = {5,10,10,10,10,10,10,10,10,10};
            for(int i = 0; i < 10 ; i++){
                soma += vector[i]; 
            }
            System.out.println("A soma dos valores do vetor é: \n"+ soma);
            return soma;
        }

        private static void avançaElementos(){
            int vet[] = {1,2,3,4,5};
            int aux[] = {1,1,1,1,1};
            for(int pos = 0; pos < vet.length; pos++){
                if(pos < vet.length){
                    aux[pos + 1] = vet[pos];
                }
                else{
                    pos = 0;
                }
                System.out.printf("Vetor[%d] = %d\n", pos, aux[pos]);
            }
        }

        public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int originalNumber = number;

        while(number != 0){
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        if(originalNumber < 0 && reverseNumber < 0){
            reverseNumber *= -1;
            System.out.println(reverseNumber);
            return false;
        }
        System.out.println(reverseNumber == originalNumber);
         return reverseNumber == originalNumber;
    }

    public static int searchInsert(int[] nums, int target){
        int auxiliarTarget = 0;
        int Target = target;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == Target){
                auxiliarTarget = i;
                System.out.println(auxiliarTarget + " -Teste 1");
                return auxiliarTarget;
            }
            if(nums[i] < Target && nums[i] > nums[0]){
                System.out.println(i + " -Teste 2");
                return i+1;
            }
            if(nums[nums.length] < Target){
                System.out.println(i + " -Teste 3");
                return nums.length +1;
            }
            else{
                i = 0;
            }
        }
        return 9;
    }

    public static int simpleArraySum(List<Integer> sumElementsArray){
        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt();
        int sum = 0;
        for(int i = 0; i< tamanho; i++){
            int numero = scan.nextInt();
            sumElementsArray.add(numero);
            sum+= sumElementsArray.get(i);
        }
        for( int i=0; i< tamanho; i++){
            System.out.printf("{%d\t}", sumElementsArray.get(i));
        }
        System.out.println("\nSoma total=>" + sum);

        return sum;
    }

    //Reproduzir os exercícios da Amazon
    //Receber uma string e avaliar se ela é válida, com os casos "xy", "xyyx", "yx", "xyx" e "yy" -> lembre-se
    //que isso são somente exemplos buscando esses valores, onde somente "xyyx" e "yy" são substrings especiais
    // na qual voce tem que somar quantas vezes ele aparece na string mãe
}
