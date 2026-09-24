//Questão 01

    public class Produto {       
        public String nome;
        private static double preco;
        final int codigo;
        public Produto(String nome) {
            codigo = "A100";  // Não é possivel converter string para inteiro automaticamente.
            nome = nome;      // O atributo que está recebendo a atribuição, deveria ter "this." antes dele para referenciar o atributo da classe.
        }     
            public static void aplicarDesconto(double porcentagem) {
                preco = preco - (preco * (porcentagem / 100));
                System.out.println("Produto: " + nome); // Atributo nome não pode ser acessado pois não é estático.
            }
            public void setCodigo(int novoCodigo) { 
                this.codigo = novoCodigo; // Já foi inicializado no construtor, logo não pode mudar de valor por ser do tipo "final".
            }
            public void getPreco() {
                return preco; // Tenta retornar um valor mesmo tendo sido declarado como 'void'.
            }      
            public static void main(String[] args) { 
                Produto p1 = new Produto("Teclado"); 
                p1.preco = 150.0; // O atributo "preco" pertence à classe, não à instancia. Logo, não pode ser chamado dessa forma. Além disso, é do 'private', o que permite ser acessado diretamente pela main. Deveria ter metodos get ou set.
                p1.codigo = 500; // Novamente já foi inicializado com um valor, logo não pode ser mudado.
                double valor = p1.getPreco(); // Método retorna void.
                System.out.println("Valor: " + valor);
                Produto.aplicarDesconto(10); 
            } 
    }