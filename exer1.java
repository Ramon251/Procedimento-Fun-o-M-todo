import java.util.Scanner;

public class exer1 {

	public static void main(String[] args) {
		int x = 0, y = 0;
		
		 Scanner leitor = new Scanner(System.in);
	        System.out.print("Digite primeiro número:");
	        x = leitor.nextInt();
	        System.out.print("Digite segundo número:");
	        y = leitor.nextInt();
	        System.out.println(soma(x,y));
	        
	    }
	    public static int soma(int x  , int y){
	        int s = x * y;
	        return s;
	        
	    }
	    
	

	}


