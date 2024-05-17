import java.util.*;
public class Exercicio1_3 {

	public static void main(String[] args) {
		// 1 - variaveis
		float vlrAplicacao;
		float taxaJuros;
		float rendimento;
		float vlrTotal;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o valor da aplicacao: ");
		vlrAplicacao = leia.nextFloat();
		
		System.out.print("Digite a taxa de juros (%): ");
		taxaJuros = leia.nextFloat();
		
		// 3 - calculos
		rendimento = vlrAplicacao * taxaJuros / 100;
		vlrTotal = rendimento + vlrAplicacao;
		
		// 4 - saida de dados
		System.out.println("Valor do rendimento: " + rendimento);
		System.out.println("Valor total apos rendimento: " + vlrTotal);

	}

}
