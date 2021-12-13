
public class Factorial {
		public static void hacerFactorial (long num){
		
		long aux=1;
		for(int i=1;i<=num;i++) {
			aux = aux*i;
		}
		System.out.println(aux);
		
	}
		public static void main(String[] args) {
		
		System.out.println("Dame un número:");
		long num = Console.readInt();
		Factorial.hacerFactorial(num);
	}


}
