import java.util.Scanner;
public class prg1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		// TODO Auto-generated method stub
		System.out.print("Enter the no of pizzas bought:");
		int x= sc.nextInt();
		System.out.print("Enter the no of puffs bought:");
		int y=sc.nextInt();
		System.out.print("Enter the no of Cool Drinks bought:");
		int z=sc.nextInt();
		System.out.println(" ");
		System.out.println("Bill  Details ");
		System.out.println("No of pizzas :" + x);
		System.out.println("No of puffs :" + y);
		System.out.println("No of Cool Drinks :" + z);
		int cost = (x*100) +(y *20) + (z*10);
		System.out.println("Total Price :" + cost);
		System.out.println("ENJOY THE SHOW!");
		
	
	}

}
