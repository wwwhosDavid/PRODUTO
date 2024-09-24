import java.time.LocalDate; // Importação para manipulação de datas

public class Main {

    public static void main(String[] args) {
        try {
            // Criando objetos da classe Pessoa
            Pessoa p1 = new Pessoa("David Rodrigues", 1.86, LocalDate.of(2006, 2, 24));
            Pessoa p2 = new Pessoa("Edson Cruz", 1.76, LocalDate.of(1966, 3, 20));
            Pessoa p3 = new Pessoa("Elza Luz", 1.67, LocalDate.of(1974, 2, 20));
            Pessoa p4 = new Pessoa("Giovanni Cruz", 1.80, LocalDate.of(2007, 12, 17));
            Pessoa p5 = new Pessoa("Daniele Rodrigues", 1.67, LocalDate.of(1998, 7, 23));      

            // Exibindo informações de cada pessoa
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
            System.out.println(p5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class Pessoa {
    private String nomeSobrenome;
    private double altura;
    private LocalDate dataNascimento;
    private String email;

    // Construtor da classe Pessoa    
    public Pessoa(String nomeSobrenome, double altura, LocalDate dataNascimento) {
        if (dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Sua data de nascimento não pode ser posterior à data atual.");
        }

        this.nomeSobrenome = nomeSobrenome;
        this.altura = altura;
        this.dataNascimento = dataNascimento;
        this.email = gerarEmail(nomeSobrenome);
    }
    
    // Método para gerar o email
    private String gerarEmail(String nomeSobrenome) {
        String[] partes = nomeSobrenome.split(" ");
        String nome = partes[0].toLowerCase();
        String sobrenome = partes[partes.length - 1].toLowerCase();
        String dominio = "email.com";  
        return nome + "." + sobrenome + "@" + dominio;
    }

    // Aqui eu precisei de ajuda do chatGPT para conseguir concluir essa parte :( 
    @Override
    public String toString() {
        return "Nome: " + nomeSobrenome + ", Altura: " + altura + "m, Data de Nascimento: " + dataNascimento + ", Email: " + email;
    }
}
