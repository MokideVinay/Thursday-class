import java.util.Scanner;
public class Si
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int amount=sc.nextInt();// ampunt
	    int rate=sc.nextInt(); //interst for year
	    int time=sc.nextInt(); // in yeras
	    float si=(amount*rate*time)/100;
		System.out.println(si);
	}
}
