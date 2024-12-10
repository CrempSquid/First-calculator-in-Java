import java.util.Scanner;

public class Operadores {
	
	public static void main(String[] args) {
		
		//LÓGICA DA CALCULADORA
		
		String opc = "S";
		
		while (opc.equals("s") || opc.equals("S")){
			
		//capturar o valor digitado pelo usuário:
		
		Scanner captura = new Scanner (System.in);
			
		System.out.println("Digite o operador (+,-,x,/): ");
		String operador = captura.nextLine();
		
		System.out.println("Digite o operando: ");
		double operando = captura.nextDouble();
		captura.nextLine();
		
		System.out.println("Digite o operado: ");
		double operado = captura.nextDouble();
		captura.nextLine();
		
		// Estrutura if else para comparar as operações
		
		double Soma = operando + operado;
		double Sub = operando - operado;
		double Mult = operando * operado;
		double Div = operando / operado;

		
		switch(operador) {
			/*Soma*/ case "+": System.out.println("O resultado da operação é: " + Soma);
			break;
			/*Subtração*/ case "-": System.out.println("O resultado da operação é: " + Sub);
			break;
			/*Multiplicação*/ case "x": System.out.println("O resultado da operação é: " + Mult);
			break;
			/*Divisão*/ case "/": System.out.println("O resultado da operação é: " + Div);
			break;
			default: System.out.println("Você digitou não digitou um operador válido, tente novamente.");
			break; 
		}
		
		//Quer continuar a execução do programa?
		
		System.out.println("\nDeseja efetuar outra operação? (s/n): ");
		String resposta = captura.nextLine();
		
		int encerrar = 1;
		int loop = 1; 
		
		do{
		if(resposta.equals("s") || resposta.equals("S")){
			break;
		}else if(resposta.equals("n") || resposta.equals("N")){
			encerrar = encerrar - 1; 
		}else{
			do {
			System.out.println("\nO caractere não corresponde a seleção, selecione (s/n)");
			resposta = captura.nextLine();
			if(resposta.equals("s") || resposta.equals("S")){
				break;
			}else if(resposta.equals("n") || resposta.equals("N")){
				System.exit(0);
			}else{
				loop = loop + 2;
			}
			}while(loop > 2);
			}
		}while(encerrar < 1);
		}
	}
}
		
		



