package ListasExercicios;

public class Exercicio7 {

	public static void main(String[] args) {

		// 7- Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A
		// média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

		double media1 = (8 + 9 + 7) / 3.0;
		System.out.println("Média dos números 8, 9 e 7: " + media1);

		double media2 = (4 + 5 + 6) / 3.0;
		System.out.println("Média dos números 4, 5 e 6: " + media2);

		double somaDasMedias = media1 + media2;
		System.out.println("Soma das duas médias: " + somaDasMedias);

		double mediaDasMedias = somaDasMedias / 2.0;
		System.out.println("Média das médias: " + mediaDasMedias);
	}

}
