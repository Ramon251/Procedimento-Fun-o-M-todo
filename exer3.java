
public class exer3 {

	public static void main(String[] args) {
		 System.out.println(nota(3,4,5,6));
    }
    
    public static int  nota(int n1, int n2, int n3, int n4){
        
       int media = (n1+n2+n3+n4)/4;
        
        if(media >= 7){
            System.out.println("Aprovado");
            
        }else{
            System.out.println("Reprovado");
        }
        
        return media;
        
       
    }

	}


