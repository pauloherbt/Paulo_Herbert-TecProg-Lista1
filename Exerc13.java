//Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
//verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
//Caso as afirmações não sejam verdadeiras, imprima: "números não
//válidos".
package Exercicios;

public class Exerc13 {

	public static void main(String[] args) {
		int A=10, B=9;
		if(A>10) {
			System.out.println("A>10");
		}
		if(A+B==20) {
			System.out.println("A+B==20");
		}
		if(!(A>10 || A+B==20)) {
			System.out.println("numeros nao validos");
		}
	}

}
