public class Imoveis {

    String imovel;
    float valor;
    int parcelas;
    float valorEntrada;


    Imoveis(String imovel, float valor, int parcelas, float valorEntrada){

        this.imovel = imovel;
        this.valor = valor;
        this.parcelas = parcelas;
        this.valorEntrada = valorEntrada;

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

    public void setValorEntrada(float valorEntrada) {
        this.valorEntrada = valorEntrada;
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

    public float getValorEntrada() {
        return valorEntrada;
    }

    public String retonarImoveis(){

        return "\n" + this.imovel + "\n" + this.valor + "\n"
                + this.parcelas + "\n" + this.valorEntrada;

    }
    public void compraEfetuada(){
        System.out.println("Compra efetuada");
    }

     static class Compra extends Imoveis{
        public Compra(String imovel, float valor, int parcelas, float valorEntrada){
            super(imovel, valor, parcelas, valorEntrada);
        }

        @Override
        public void compraEfetuada(){
            System.out.println("O Cliente Efetuou uma Compra");
        }
    }
}
