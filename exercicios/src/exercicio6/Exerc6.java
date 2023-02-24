package exercicio6;

public class Exerc6 {
    public void validar(String valorCampo, Integer valorMaximoCampo) throws TamanhoInvalidoException {
        if (valorCampo == null || valorMaximoCampo == null || valorMaximoCampo < 0){
            throw new IllegalArgumentException();
        }
        if (valorCampo.length() > valorMaximoCampo){
            throw new TamanhoInvalidoException();
        }
    }

    public static void main(String[] args) {
        Exerc6 exerc6 = new Exerc6();
        try {
            exerc6.validar(null,null);
        } catch (TamanhoInvalidoException e) {
            System.out.println("Deu problema!");
        }

    }
}
