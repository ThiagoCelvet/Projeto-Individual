public class Corretores {

    String nomeCorretor;
    String cpfCorretor;
    String emailCorretor;
    String senhaCorretor;
    int idadeCorretor;

    Corretores(String nomeCorretor, String cpfCorretor, String emailCorretor,
               String senhaCorretor, int idadeCorretor){

        this.nomeCorretor = nomeCorretor;
        this.cpfCorretor = cpfCorretor;
        this.emailCorretor = emailCorretor;
        this.senhaCorretor = senhaCorretor;
        this.idadeCorretor = idadeCorretor;

    }

    public void setNomeCorretor(String nomeCorretor) {
        this.nomeCorretor = nomeCorretor;
    }

    public void setCpfCorretor(String cpfCorretor) {
        this.cpfCorretor = cpfCorretor;
    }

    public void setEmailCorretor(String emailCorretor) {
        this.emailCorretor = emailCorretor;
    }

    public void setSenhaCorretor(String senhaCorretor) {
        this.senhaCorretor = senhaCorretor;
    }

    public void setIdadeCorretor(int idadeCorretor) {
        this.idadeCorretor = idadeCorretor;
    }

    public String getNomeCorretor() {
        return nomeCorretor;
    }

    public String getCpfCorretor() {
        return cpfCorretor;
    }

    public String getEmailCorretor() {
        return emailCorretor;
    }

    public String getSenhaCorretor() {
        return senhaCorretor;
    }

    public int getIdadeCorretor() {
        return idadeCorretor;
    }

    public String retonarCorretor(){

        return "\n" + this.nomeCorretor + "\n" + this.cpfCorretor + "\n" + this.emailCorretor + "\n" +
        this.senhaCorretor + "\n" + this.idadeCorretor;

    }
}
