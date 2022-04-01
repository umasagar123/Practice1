import java.util.Scanner;
public class excercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String x= sc.next();
		x=x.toLowerCase();
		System.out.println(x);
		if(x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")) {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Constant");
		}
}

}