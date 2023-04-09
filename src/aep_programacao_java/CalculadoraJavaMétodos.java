// Criando o pacote
package aep_programacao_java;

// Criando a classe CalculadoraJavaMétodos, contendo todos os métodos
public class CalculadoraJavaMétodos {
	
	// Método que realiza a adição, esperando dois números (do tipo Double - números 
	// com vírgula) como parâmetro 
	public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

	// Método que realiza a subtração, esperando dois números (do tipo Double - números 
	// com vírgula) como parâmetro 
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    // Método que realiza a multiplicação, esperando dois números (do tipo Double - números 
 	// com vírgula) como parâmetro 
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Método que realiza a divisão, esperando dois números (do tipo Double - números 
 	// com vírgula) como parâmetro 
    public static double divisao(double num1, double num2) {
    	
    	// Se o segundo número informado pelo usuário for = a 0, ele imprime a mensagem 
    	// "Não é possível dividir por zero"
        if (num2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero");
        }
        return num1 / num2;
    }

    // Método que realiza a porcentagem, esperando dois números (do tipo Double - números 
 	// com vírgula) como parâmetro 	
    public static double porcentagem(double num1, double porcentagem) {
        return (num1 * porcentagem) / 100.0;
    }

    // Método que realiza a raíz Quadrada, esperando um número (do tipo Double - números 
 	// com vírgula) como parâmetro 
    public static double raizQuadrada(double num1) {
    	
    	// Se o número informado pelo usuário for menor que 0, ele imprime a mensagem 
    	// "Não é possível calcular a raiz quadrada de um número negativo"
        if (num1 < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo");
        }
        
        // Aqui ele está utilizando a função Math.sqrt, função específica para realizar a raíz quadrada
        return Math.sqrt(num1);
    }

    // Método que realiza o mínimo (menor número dentre os dois números fornecidos pelo 
    // usuário, do tipo Double - números com vírgula) como parâmetro 
    public static double minimo(double num1, double num2) {
    	
    	// Aqui ele está utilizando a função Math.min, função específica para retornar o menor número
        return Math.min(num1, num2);
    }

    // Método que realiza o máximo (maior número dentre os dois números fornecidos pelo 
    // usuário, do tipo Double - números com vírgula) como parâmetro 
    public static double maximo(double num1, double num2) {
    	
    	// Aqui ele está utilizando a função Math.max, função específica para retornar o maior número
        return Math.max(num1, num2);
    }

    // Método que realiza a exponenciação, esperando dois números (do tipo Double - números 
 	// com vírgula) como parâmetro 
    public static double exponenciacao(double base, double expoente) {
    	
    	// Aqui ele está utilizando a função Math.pow, função específica para realizar a exponenciação 
    	// de um número
        return Math.pow(base, expoente);
    }
}
