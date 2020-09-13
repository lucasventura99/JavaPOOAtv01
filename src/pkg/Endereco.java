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

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
