import java.util.Iterator;

    public class minhaListaEncadeadaSimples<T> implements Iterable<T>{
        private static class Nó<T>{ // generics para receber qualquer tipo de objeto ou tipo primitivo
            T dados; // dado armazenado nesse nó
            Nó<T> prox; // Referencia para o proximo nó da lista
            public Nó(T dados){
                this.dados = dados; //Guarda os dados daquele nó
                this.prox = null; // inicialmente está apontando para o "vazio", nada
            }
        }
    
        private Nó<T> cabeça; // primeiro nó de qualquer lista encadeada
        private static int tamanho; // é um int para marcar o tamanho da lista encadeada, boa prática ao gerenciar listas encadeadas

        public minhaListaEncadeadaSimples(){ //Construtor para inicializar a Lista
            this.cabeça = null; // apontando para o "nada" inicialmente
            this.tamanho = 0; //a cabeça é o único elemento assim por se dizer então não há nada na lista, nem dados
        }

        public void adiciona(T dados){ // método para adicionar dados no FINAL da lista encadeada
        // aqui estamos delcarando que os novos nós serão de um tipo generics e terão generics como dados
            Nó<T> novoNó = new Nó<>(dados); 
        // Aqui estamos verificando se a cabeça está null, que isso quer dizer que a lista não há elementos além da cabeça
            if(cabeça == null){ 
            // Aqui está dizendo para o código: "Ó se caso a cabeça estiver vazia pode apontar para o novo nó" e assim inserir o novo nó no FINAL da Lista
                cabeça = novoNó; 
            }
            else{ // Aqui se percorre toda a lista para fazer a inserção no FINAL depois que sai do While, que quer dizer que ele percorreu até o ultimo elemento da lista
                Nó<T> atual = cabeça;
                while(atual.prox != null){
                    atual = atual.prox;
                }
                atual.prox = novoNó; // aqui após chegar no ultimo nó aponta para o novo nó
            }
            tamanho++; // para o contador tamanho atualizar o size da Lista, após ocorrer todas as inserções/chamadas
        }

        public void adicionaNoInicio(T dados){ // Aqui estamos adicionando os novos nós no INICIO da lista
            Nó<T> novoNó = new Nó<>(dados);
        //Aqui estamos fazendo o seguinte: a cada nó novo que for inserido ele passa a ser a nova cabeça da lista e atualizamos o tamanho da lista
            novoNó.prox = cabeça;
            cabeça = novoNó;
            tamanho++;
        }

        public Boolean removeNó(T dados){ //Aqui removemos os nós que estão no fianl ou na cabeça da lista e retornamos um booleano
            if(cabeça == null){
                System.out.println("Não há elementos nessa Lista a não ser a cabeça!\nPor favor insira elementos para poder removê-los");
                return false;
            }
            if(cabeça.dados.equals(dados)){
            //Se caso o elemento que vai ser removido seja a cabeça, faz a cabeça ser o próximo e diminui o tamanho em uma unidade
                cabeça = cabeça.prox;
                tamanho--;
                return true;
            }

            Nó<T> nóAtual = cabeça; 
            Nó<T> nóAnterior = null;

             // Aqui percorremos até o final a lista e pegamos o ultimo elemento e fazemos ele apontar para null, depois diminuimos um no tamanho
            while(nóAtual != null && !nóAtual.dados.equals(dados)){
                nóAnterior = nóAtual;
                nóAtual = nóAtual.prox;
            }
            if(nóAtual == null){ // se seu código chegou aqui quer dizer que há elementos na lista
                //mas que o nó que você quer remover não foi encontrado, por isso ele retorna null
                return false;
            }
            //Agora a remoção acontece "desviando" o ponteiro do anterior para o próximo do nó atual, de forma que ele "PULA" o nó atual e assim removendo ele da lista
            nóAnterior.prox = nóAtual.prox;
            tamanho--;
            return true;
        }

        public T getOn(int indice){ // para pegar os dados mas com a complexidade em O(n)
            if(indice < 0 || indice >= tamanho){
                throw new IndexOutOfBoundsException("Índice fora dos Limites: "+ indice);
            }
            Nó<T> nóAtual = cabeça;
            for(int i = 0; i < indice; i++){
                nóAtual = nóAtual.prox;
            }
            return nóAtual.dados;
        }
    
        @Override
        public String toString(){
            if(cabeça == null){
                return "[]";
            }
            StringBuilder construtorString = new StringBuilder("[");
            Nó<T> atual = cabeça;
            while(atual != null){
                construtorString.append(atual.dados);
                if(atual.prox != null){
                    construtorString.append(", ");
                }
                atual = atual.prox;
            }
            construtorString.append("]");
            return construtorString.toString();
        }

        @Override
        public Iterator<T> iterator(){
            return new ListIterator();
        }
        
        private class ListIterator implements Iterator<T>{
            private Nó<T> atual = cabeça;

            @Override
            public boolean hasNext(){
                return atual != null;
            }

            @Override
            public T next(){
                if(!hasNext()){
                    throw new java.util.NoSuchElementException();
                }
                T dados = atual.dados;
                atual = atual.prox;
                return dados;
            }

            @Override
            public void remove(){
                throw new UnsupportedOperationException("Remoção não suportada por este Iterador!");
            }
        }

        public int tamanho(){
            return tamanho;
        }
    
        public Boolean estaVazio(){
            return tamanho == 0;
        }
    

    public static void main(String[] args){
        minhaListaEncadeadaSimples<Integer> lista = new minhaListaEncadeadaSimples<>();

        lista.adiciona(5);
        lista.adiciona(3);
        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);

        System.out.println("Lista antiga: " + lista);

        for(int i = tamanho - 1; i >= 0; i--){
            lista.adiciona(lista.getOn(i));
        }
        for(int j = 0; j < tamanho -1 /2; j++){
            lista.removeNó(lista.getOn(j));
        }
        System.out.println(lista);
    }

}

