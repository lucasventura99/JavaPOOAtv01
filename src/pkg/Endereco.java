package pkg;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private Cidade cidade;

    public Endereco(String logradouro, int numero, String complemento, Cidade cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;

    }
}
