package exercicio3;

public class Produto implements Tributavel{
    double valor;
    double valorImposto;
    @Override
    public Double calculaValorImposto() {
        return valor + valorImposto;
    }
}
