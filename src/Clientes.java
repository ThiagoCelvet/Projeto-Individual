public class Clientes {

    String nome;
    String cpf;
    String email;
    String senha;
    int idade;

Clientes(String nome, String cpf, String email, String senha, int idade){

    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.senha = senha;
    this.idade = idade;

}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getIdade() {
        return idade;
    }

    public String retornar(){

      return "\n" + this.nome + "\n" + this.cpf + "\n" + this.senha
              + "\n" + this.email + "\n" + this.idade;

    }



}
