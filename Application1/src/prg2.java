import java.util.Scanner;
public class prg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month :");
		int x= sc.nextInt();
		if(x==3 || x==4 || x==5) {
			System.out.println("Season : Spring");
		}
		else if(x==6 || x==7 || x==8) {
			System.out.println("Season : Summer");
		
		}
		else if(x==9 || x==10 || x==11) {
			System.out.println("Season : Autumn");
		
		}
		else if(x==12 || x==1 || x==2) {
			System.out.println("Season : Winter");
		
		}
		else {
				System.out.println("Invalid Input");
			
			}
		
		// TODO Auto-generated method stub

	}

}
