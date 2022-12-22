import java.util. Scanner;
public class Pol
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the selling price");
	int sp=sc.nextInt();
	 System.out.println("enter the  cost price");
	int cp=sc.nextInt();
	if(sp>=cp){
	    int profit=sp-cp;
	    System.out.println("profit"+"  "+(profit));
	    
	    
	}
	else{
	    int loss=cp-sp;
	    System.out.println("loss"+(loss));
	}
	
	
	    
	   
	    
	
	}
}
