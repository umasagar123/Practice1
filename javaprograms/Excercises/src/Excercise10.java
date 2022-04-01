import java.util.Scanner;
public class Excercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		if(x>10 && x<18) {
			System.out.println("TEENAGER");
		}
		else if(x>18 && x<45){
		    System.out.println("ADULT");
		}
		else if(x<10)
			System.out.println("KID");
		
}
}