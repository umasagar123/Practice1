package com.stackroute;
import java.util.*;
public class SortAscNumber {

    public static void main(String[] args) {
        new SortAscNumber().getNumbers();
    }

    //get the numbers from user through console
    public void getNumbers() {
		Scanner sc =new Scanner(System.in);
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		int thirdNumber=sc.nextInt();
		int fourthNumber=sc.nextInt();
		

    }

    //logic to sort the numbers
    public String numberSorter(int num1, int num2, int num3, int num4) {
    	if (num1 > num2 && num2 > num3){
            System.out.printf("%d,%d,%d",num1, num2, num3);
        } else if (num2 > num3){
            System.out.printf("%d,%d,%d",num2, num3,num1);
        } else {
            System.out.printf("%d,%d,%d",num3, num2, num1);
        }

        return "lsng";
    }
}