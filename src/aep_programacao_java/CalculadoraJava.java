// Criando o pacote
package aep_programacao_java;

// Importando a Biblioteca Scanner que é uma classe que permite a leitura e armazenamento
// de dados do usuário
import java.util.Scanner;

// Criando uma classe que será inserido todo o código
public class CalculadoraJava {

	// Crindo a classe main (principal) - a primeira que será executada
	public static void main(String[] args) {
		
		// Crindo objeto Scanner do tipo Scanner 
		Scanner scanner = new Scanner(System.in);
		
		// Definindo variável continuar para ser utilizado no loop while 
		boolean continuar = true;

		// Loop while (enquanto) principal da calculadora
		while (continuar) {
			
	    // Printando o menu principal com as opções que aparecerão para o usuário escolher 
        System.out.println("=========================================");
        System.out.println("|               JAVA CALC               |");
        System.out.println("-----------------------------------------");
        System.out.println("1 Adição");
        System.out.println("2 Subtração");
        System.out.println("3 Multiplicação");
        System.out.println("4 Divisão");
        System.out.println("5 Porcentagem");
        System.out.println("6 Raiz Quadrada");
        System.out.println("7 Mínimo e Máximo entre x e y");
        System.out.println("8 Exponenciação");
        System.out.println("-----------------------------------------");
        System.out.println("Qual sua opção: ");

        // Definindo a variável opção para ser utilizada no switch case
        int opcao = scanner.nextInt();

        // Criando switch case com as opções. Ele é usado quando se deseja executar diferentes
        // ações dependendo do valor de uma variável ou de uma expressão.
        switch (opcao) {
            case 1:
                System.out.println("Opção selecionada: Adição");
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                double resultado = CalculadoraJavaMétodos.adicao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                System.out.println("Opção selecionada: Subtração");
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                resultado = CalculadoraJavaMétodos.subtracao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                System.out.println("Opção selecionada: Multiplicação");
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                resultado = CalculadoraJavaMétodos.multiplicacao(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.println("Opção selecionada: Divisão");
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    resultado = CalculadoraJavaMétodos.divisao(num1, num2);
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 5:
                System.out.println("Opção selecionada: Porcentagem");
                System.out.print("Digite o número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite a porcentagem: ");
                num2 = scanner.nextDouble();
                resultado = CalculadoraJavaMétodos.porcentagem(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;

            case 6:
                System.out.println("Opção selecionada: Raiz Quadrada");
                System.out.print("Digite o número: ");
                num1 = scanner.nextDouble();
                if (num1 < 0) {
                    System.out.println("Não é possível calcular a raiz quadrada de um número negativo");
                } else {
                    resultado = CalculadoraJavaMétodos.raizQuadrada(num1);
                    System.out.println("Resultado: " + resultado);
                }
                break;
                
            case 7:
                System.out.println("Opção selecionada: Mínimo e Máximo entre x e y");
                System.out.print("Digite o valor de x: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o valor de y: ");
                num2 = scanner.nextDouble();
                double min = CalculadoraJavaMétodos.minimo(num1, num2);
                double max = CalculadoraJavaMétodos.maximo(num1, num2);
                System.out.println("Mínimo: " + min);
                System.out.println("Máximo: " + max);
                break;
                
            case 8:
            	System.out.println("Opção selecionada: Exponenciação");
            	System.out.print("Digite a base: ");
            	num1 = scanner.nextDouble();
            	System.out.print("Digite o expoente: ");
            	num2 = scanner.nextDouble();
            	resultado = CalculadoraJavaMétodos.exponenciacao(num1, num2);
            	System.out.println("Resultado: " + resultado);
            	break;
                
            // Default é outro padrão, caso o usuário digite outras opções que não são as 
            // fornecidas, cairá dentro do default (padrão)	
        	default:
				System.out.println("Opção inválida!");
		}

        // Perguntando ao usuário se ele deseja continuar, se a resposta for "N" maiúsculo ou minúsculo
        // ele sai do programa.
		System.out.print("Deseja continuar? (S/N) ");
		String resposta = scanner.next();
		if (resposta.equalsIgnoreCase("N")) {
			continuar = false;
		}
	}

	// Printando a mensagem após ele selecionar a opção de sair do programa
	System.out.println("Obrigado por usar a CalculadoraJava!");
	
	// Fechando o método scanner
	scanner.close();
	}
}





