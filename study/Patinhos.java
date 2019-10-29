import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n, nf;
	    
		System.out.println("Música da Xuxa");
		System.out.println("Digite quantos patinhos:");
		n = in.nextInt();
		nf = n;
		
		System.out.println("************* Música *************");
		while(n > 0){
		    System.out.println(n + " patinhos foram passear");
		    System.out.println("Além das montanhas");
		    System.out.println("Para brincar");
		    if(n == 1){
		        System.out.println("A mamãe gritou: Quá, quá, quá, quá Mas nenhum patinho voltou");
		    }else{
		        System.out.println("A mamãe gritou: Quá, quá, quá, quá Mas só " + (n - 1) + " patinhos voltaram");
		    }
		    System.out.println("de lá.");
		    n--;
		}
		System.out.println("A mamãe patinha foi procurar");
		System.out.println("Além das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mamãe gritou: Quá, quá, quá, quá");
		System.out.println("E os " + nf + " patinhos voltaram de lá.");
	}
}
