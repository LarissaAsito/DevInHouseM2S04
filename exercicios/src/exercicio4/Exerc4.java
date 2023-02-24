package exercicio4;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Exerc4 exerc = new Exerc4();
        Integer idade = null;
        while (idade == null){
            try {
                idade = exerc.perguntarIdade();
            } catch (IdadeInvalidaException e) {
                System.out.println("Idade inválida!");;
            }
        }
        System.out.printf("Olá, você tem %d anos de idade", idade);
    }

    private Integer perguntarIdade() throws IdadeInvalidaException{
        System.out.println("Qual a sua idade? ");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        if (idade <= 0 || idade > 100){
            throw new IdadeInvalidaException();
        }
        return idade;
    }
}
