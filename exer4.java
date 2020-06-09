import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
		  simbo();
    }
     public static void  simbo(){
       Scanner leitor = new Scanner(System.in);
       int a,b,res;
       String fun;
         System.out.println("Digite 2 Valores e a função aritimética( +, -, / , * ).");
         
          System.out.print("1N:");
          a = leitor.nextInt();
          System.out.print("Função:");
          fun = leitor.next();
          System.out.print("2N:");
          b = leitor.nextInt();
          if(fun == "+"){
             res = a + b;
          }else if(fun == "-"){
              res = a - b;
          }else if(fun =="*"){
            res = a * b;
          }else if(fun =="/"){
            res = a / b;
          }else{
              System.out.println("Simbolo errado");
          }
     }
	}


