import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("Entre com o modelo do "+(i+1)+"� carro:");
			String modelo = sc.next();
			
			System.out.println("Entre com a cor do "+(i+1)+"� carro:");
			String cor = sc.next();
			
			System.out.println("Entre com o valor do "+(i+1)+"� carro:");
			double valorTabela = sc.nextDouble();
			
			System.out.println("Entre com o valor do combust�vel do "+(i+1)+"� carro");
			double combustivel = sc.nextDouble();
			
			Carro carro = new Carro(modelo, cor, valorTabela, combustivel);
			carro.calculaIPVA();
			carro.imprimirFicha();
			System.out.println("-------------------");
		}
		

		for(int i=0; i<2; i++) {
			System.out.println("Entre com o modelo da "+(i+1)+"� moto:");
			String modelo = sc.next();
			
			System.out.println("Entre com a cor da "+(i+1)+"� moto:");
			String cor = sc.next();
			
			System.out.println("Entre com o valor da "+(i+1)+"� moto:");
			double valorTabela = sc.nextDouble();
			
			System.out.println("Entre com o valor do combust�vel da "+(i+1)+"� moto");
			double combustivel = sc.nextDouble();
			
			Moto moto = new Moto(modelo, cor, valorTabela, combustivel);
			moto.calculaIPVA();
			moto.imprimirFicha();
			System.out.println("-------------------");
		}
	}

}
