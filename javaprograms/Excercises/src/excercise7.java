import java.util.Scanner;
public class excercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		int y=sc.nextInt();
		float distance=x*1000;
		float speed= y;
		float time= distance/speed;
		System.out.println("time taken " + (time));
}

}