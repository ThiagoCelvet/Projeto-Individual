public class Imoveis {

    String imovel;
    float valor;
    int parcelas;
    float prestacao;


    Imoveis(String imovel, float valor, int parcelas, float prestacao){

        this.imovel = imovel;
        this.valor = valor;
        this.parcelas = parcelas;
        this.prestacao = prestacao;

    }

    public void setImovel(String imovel) {
        this.imovel = imovel;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void setPrestacao(float prestacao) {
        this.prestacao = prestacao;
    }

    public String getImovel() {
        return imovel;
    }

    public float getValor() {
        return valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public float getPrestacao() {
        return prestacao;
    }

    public String retonarImoveis(){

        return "\n" + this.imovel + "\n" + this.valor + "\n" + this.parcelas + "\n" + this.prestacao;

    }


}
