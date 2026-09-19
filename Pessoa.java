import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private Genero genero;
    private List<Telefone> telefones;

    public Pessoa(String nome, String cpf, Genero genero) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF não pode ser vazio");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Genero getGenero() {
        return genero;
    }

    public boolean adicionarTelefone(Telefone telefone) {
        // Regra: uma pessoa pode ter no máximo 3 telefones.
        if (telefones.size() >= 3) {
            return false;
        }

        // Regra: não permite telefone nulo.
        if (telefone == null) {
            return false;
        }

        // Regra: não permite telefone duplicado.
        if (telefones.stream()
                .anyMatch(t -> t.getNumero().equals(telefone.getNumero()))) {
            return false;
        }
        return telefones.add(telefone);
    }

    public List<Telefone> getTelefones() {
        return new ArrayList<>(telefones);
    }

    @Override
    public String toString() {
        return nome + " - CPF: " + cpf + " - Gênero: " + genero;
    }
}