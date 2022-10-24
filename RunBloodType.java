import java.util.Scanner;
public class RunBloodType{
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter blood type of patient: ");
		String input1 = sc.nextLine();
		System.out.print("Enter the rh factor (+ or -):");
			String input2=sc.nextLine();
			BloodData bd = new BloodData();
		if(input1.isEmpty()){
			if(input2.isEmpty()){
		
			bd.display();
		
		}	else {
			System.out.print("Error");
		}
		}
		else if(input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
				bd.setBloodType(input1);
				bd.setRhFactor(input2);
				bd.display(); 
			} else {
				System.out.print("Invalid");
			}
		}
} 
}