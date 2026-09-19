import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Pessoa> pessoas;
    private List<Endereco> enderecos;

    public Cadastro() {
        pessoas = new ArrayList<>();
        enderecos = new ArrayList<>();
    }

    public boolean adicionarPessoa(Pessoa pessoa) {
        // Regra 1: não permite pessoa nula
        if (pessoa == null) {
            return false;
        }

        // Regra 2: não permite duas pessoas com o mesmo CPF
        if (pessoas.stream()
                .anyMatch(p -> p.getCpf().equals(pessoa.getCpf()))) {
            return false;
        }
        return pessoas.add(pessoa);
    }

    public boolean adicionarEndereco(Endereco endereco) {
        // Regra 3: não permite endereço nulo
        if (endereco == null) {
            return false;
        }

        // Regra 4: não permite dois endereços iguais
        if (enderecos.stream()
                .anyMatch(e ->
                        e.getRua().equalsIgnoreCase(endereco.getRua())
                                && e.getCidade().equalsIgnoreCase(endereco.getCidade()))) {
            return false;
        }
        return enderecos.add(endereco);
    }

    public int quantidadePessoas() {
        return pessoas.size();
    }

    public int quantidadeEnderecos() {
        return enderecos.size();
    }

    public void exibirResumo() {
        System.out.println("\nPessoas cadastradas:");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);

            if (pessoa.getTelefones().isEmpty()) {
                System.out.println("  Telefones: nenhum");
            } else {
                System.out.println("  Telefones: " + pessoa.getTelefones());
            }
        }
        System.out.println("\nEndereços cadastrados:");

        for (Endereco endereco : enderecos) {
            System.out.println("  " + endereco);
        }

        System.out.println("\nTotal de pessoas: " + quantidadePessoas());
        System.out.println("Total de endereços: " + quantidadeEnderecos());
    }
}