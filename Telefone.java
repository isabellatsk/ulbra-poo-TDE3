public class Telefone {
    private String numero;

    public Telefone(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número do telefone não pode ser vazio");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}