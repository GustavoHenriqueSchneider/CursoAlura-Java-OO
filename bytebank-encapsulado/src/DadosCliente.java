public class DadosCliente {
    private String nome, cpf, profissao;
    private EnderecoCliente endereco = new EnderecoCliente();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public EnderecoCliente getEndereco() {
        return this.endereco;
    }
}
