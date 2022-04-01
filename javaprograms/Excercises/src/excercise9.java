import java.util.Scanner;
public class excercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if(x>=z && x>=y) {
			System.out.println(x);			
		}
		else if(y>=z && y>=x) {
			System.out.println(y);
		}
		else if(z>=x && z>=y) {
			System.out.println(z);
		}
		
		
}
}