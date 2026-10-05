public class Quadratic{
	public static void main(String[]args){
		//placeholders
		quadplus(4,56,3);
		quadmin(4,56,3);
	}
	public static void quadplus(int a, int b, int c){
		if(a==0){
			System.out.println("You can not divide by zero.");
		} else if (Math.pow(b,2)-4*a*c<0){
			System.out.println("You can not take the root of a negative number.");
		} else {
			System.out.println((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
		}
	}
	public static void quadmin(int a, int b, int c){
		if(a==0){
			System.out.println("You can not divide by zero.");
		} else if (Math.pow(b,2)-4*a*c<0){
			System.out.println("You can not take the root of a negative number.");
		} else {
			System.out.println((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a));
		}
	}	
}
