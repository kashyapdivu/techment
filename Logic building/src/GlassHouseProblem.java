import java.util.Scanner;

public class GlassHouseProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int door1, door2 ;
           Scanner scanner = new Scanner(System.in);
   		System.out.println("Enter first door :");
   		door1 = scanner.nextInt();
   		System.out.println("Enter second door :");
   		door2 = scanner.nextInt();
//           door1= 8;
//           door2 = 53;
          findDoor(door1,door2); 
	}

	private static void findDoor(int door1, int door2) {
		// TODO Auto-generated method stub
	if(door1>= 1 && door1<= 18 && door2>= 1 && door2 <= 18) {
		System.out.println(door1+door2);
	 }else {
		 System.out.println("Invalid Number");
	 }
	}

}
