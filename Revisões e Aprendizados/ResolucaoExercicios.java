import java.util.Scanner;

/*Exercicios de Fundamentos de programação em Java(Looping e Condicionais, Vetores e Arrays)*/

public class ResolucaoExercicios{
    public static void main(String[] args) throws Exception {
        //Para o usuário digitar os dados para a resolução dos exercicios -> Scanner//
        Scanner scanner = new Scanner(System.in);

        //Aqui temos as chamadas dos métodos para serem testados e ver se estão corretas as soluções
        //Para verificar basta "descomentar" os métodos
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
        avançaElementos();
        //fechar a leitura de dados do teclado, boa prática de programação
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
}
