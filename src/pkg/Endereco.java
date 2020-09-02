package pkg;

public class Endereco {
    private final String logradouro;
    private final int numero;
    private final String complemento;
    private final Cidade cidade;

    public Endereco(String logradouro, int numero, String complemento, Cidade cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;

    }
}
