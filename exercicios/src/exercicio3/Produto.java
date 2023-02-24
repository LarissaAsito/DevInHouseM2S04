package exercicio3;

public class Produto implements Tributavel{
    private Double valor;
    private Double valorImposto;
    @Override
    public Double calculaValorImposto() {
        return valor + valorImposto;
    }
}
