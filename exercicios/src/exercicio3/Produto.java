package exercicio3;

public class Produto implements Tributavel{
    private Double valor;
    private Double valorImposto;
    @Override
    public Double calculaValorComImposto() {
        return valor + valorImposto;
    }
}
