import java.util.Scanner;

class Vowel{
  	 public static void main(String args[])
 {
  	char no;
 	Scanner scin=new Scanner(System.in);
	System.out.println("Enter Character");
	no=scin.next().charAt(1);

	if(no=='A' || no=='E' || no=='I' || no=='O' || no=='U' || no=='a' || no=='e' || no=='i' || no=='o' || no=='u' )
	{
		System.out.println("It is Vowel");
	}
	else
	{
		System.out.println("It is Consonant");
	}


}
}