public class Triangle{
	public static void main(String[]args){
		//placeholder
		triangle(3,4,7);
	}
	public static void triangle(int a, int b, int c){
		if(a==0||b==0||c==0){
			System.out.println("Values can not be zero.");
		} else if (a<0||b<0||c<0){
			System.out.println("Values can not be negative.");
		} else if (a>=b+c||b>=a+c||c>=a+b){
			System.out.println("A triangle can not be formed.");
		} else {
			System.out.println("A triangle can be formed.");
		}
	}
}
