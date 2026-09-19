public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        Pessoa pessoa1 = new Pessoa(
                "Isabellaa",
                "600.400.590-54",
                Genero.FEMININO
        );

        Pessoa pessoa2 = new Pessoa(
                "João",
                "222.222.222-22",
                Genero.MASCULINO
        );

        Telefone telefone1 = new Telefone("9999999-9999");
        Telefone telefone2 = new Telefone("9999999-9999");

        pessoa1.adicionarTelefone(telefone1);
        pessoa1.adicionarTelefone(telefone2);

        cadastro.adicionarPessoa(pessoa1);
        cadastro.adicionarPessoa(pessoa2);

        Endereco endereco1 = new Endereco(
                "Rua Principal",
                "Rolante"
        );

        Endereco endereco2 = new Endereco(
                "Rua Central",
                "Taquara"
        );

        cadastro.adicionarEndereco(endereco1);
        cadastro.adicionarEndereco(endereco2);

        // Tenta cadastrar CPF duplicado
        Pessoa pessoaDuplicada = new Pessoa(
                "Maria",
                "111.111.111-11",
                Genero.FEMININO
        );

        boolean adicionou = cadastro.adicionarPessoa(pessoaDuplicada);
        System.out.println("Pessoa com CPF duplicado cadastrada? " + adicionou);
        cadastro.exibirResumo();
    }
}