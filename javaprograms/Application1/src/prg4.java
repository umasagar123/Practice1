import java.util.Scanner;
public class prg4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Total marks :");
		int x= sc.nextInt();
		System.out.print("Marks Obtained :");
		int y=sc.nextInt();
		int percent = (x/y)*100;
		if(x>=70) {
			System.out.println("your grade - A");
		}
		else if(x<=70 && x>=50 ) {
			System.out.println(" your grade - B");
		
		}
		if(x<=50 && x>=40) {
			System.out.println(" your grade - pass");
		}
		else if(x<=40) {
			System.out.println(" your grade - fail");
		}
		// TODO Auto-generated method stub

	}

}
