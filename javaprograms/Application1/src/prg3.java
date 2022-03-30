import java.util.Scanner;
public class prg3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the no of students placed in CSE :");
		int x=sc.nextInt();
		System.out.print("Enter the no of students placed in ECE :");
		int y=sc.nextInt();
		System.out.print("Enter the no of students placed in Mech :");
		int z=sc.nextInt();
		if(x<0 || y<0 || z<0 ) {
			System.out.println("Invalid input");
		}
		else if( x == y && y==z) {
			System.out.println("None of the department has got the highest placement");
		}
		else if(x>y && x>z) {
			System.out.println("Highest placement : CSE");
		}
		else if(y>z && y>x) {
			System.out.println("Highest placement : ECE");
		}
		else if(y<z && x<z) {
			System.out.println("Highest placement : MECH");
		}
		else if(x==y && x>z) {
			System.out.println("Highest placement : CSE and ECE");
		}
		else if(y<x && x==z) {
			System.out.println("Highest placement : CSE and MECH");
		}
		else if(z==y && z>x) {
			System.out.println("Highest placement : ECE and MECH");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
