import java.util.Scanner;
public class excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		int y=sc.nextInt();
		int x1= sc.nextInt();
		int y1=sc.nextInt();
		int x3= sc.nextInt();
		float sum = x+y+x1+y1+x3;
		float average= sum/5;
		System.out.println(sum);
		System.out.println(average);
	}

}

