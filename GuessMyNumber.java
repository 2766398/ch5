import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
		public static void main (String[] args){
			Scanner in = new Scanner(System.in);
			Random random = new Random();
			int a = random.nextInt(101);
			int b;
			int d = 0;
			System.out.print("I'm thinking of a number between 1 and 100 \n(including both). Can you guess what it is? \nType a number: ");
			b = in.nextInt();
			while (b!=a && d<3){
				if (b<a){
					System.out.println("Higher.");
					d++;
					in.nextLine();
					b = in.nextInt();
				} else {
					System.out.println("Lower.");
					d++;
					in.nextLine();
					b = in.nextInt();
				}
			} if (b==a){
				System.out.print("You Win!");
			} else {
			int c = a - b;
			if (c < 0){
				c = -c;
			}
			System.out.print("Your last guess was: " + b + " \nThe number I was thinking of is: " + a + " \nYou were off by: " + c);
		}
	}
}
