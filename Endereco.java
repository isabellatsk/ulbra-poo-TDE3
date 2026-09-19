public class Endereco {
    private String rua;
    private String cidade;

    public Endereco(String rua, String cidade) {
        if (rua == null || rua.isBlank()) {
            throw new IllegalArgumentException("Rua não pode ser vazia");
        }

        if (cidade == null || cidade.isBlank()) {
            throw new IllegalArgumentException("Cidade não pode ser vazia");
        }
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return rua + ", " + cidade;
    }
}