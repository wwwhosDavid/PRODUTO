public class Main {
    public static void main(String [] args)  {
    
        //Criando o objeto produto
        Produto p1 = new Produto("Anel", "Dior", 3000.00, 4500.00);
        Produto p2 = new Produto("Pulseira", "Vivara", 1000.00, 1400.00);
        Produto p3 = new Produto("Colar", "Tiffany", 5000.00, 6000.00);
        Produto p4 = new Produto("Brinco", "Calvin Klein", 700.00, 1000.00);
        Produto p5 = new Produto("Chapéu", "Zara", 500.00, 760.00);

        //Calculo do lucro para exibir de cada produto
        System.out.println("Valor referente ao lucro do " + p1.nome + " " + p1.marca + ": " + p1.calcularLucro());
        System.out.println("Valor referente ao lucro do " + p2.nome + " " + p2.marca + ": " + p2.calcularLucro());
        System.out.println("Valor referente ao lucro do " + p3.nome + " " + p3.marca + ": " + p3.calcularLucro());
        System.out.println("Valor referente ao lucro do " + p4.nome + " " + p4.marca + ": " + p4.calcularLucro());
        System.out.println("Valor referente ao lucro do " + p5.nome + " " + p5.marca + ": " + p5.calcularLucro());
    } 
}
    class Produto { 
        String nome, marca;
        double precoCusto, precoVenda;

    //Construtor da classe do produto
    Produto(String nome, String marca, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.marca = marca;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    //Metodo de lucro
    double calcularLucro() {
        return this.precoVenda - this.precoCusto;
    }
}
