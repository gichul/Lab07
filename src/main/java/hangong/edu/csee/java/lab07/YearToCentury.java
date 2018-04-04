package hangong.edu.csee.java.lab07;
import java.util.Scanner;

public class YearToCentury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		

		System.out.println("Input year : \n");
		int year=scan.nextInt();
		
		Convertor result=new Convertor(year);
		result.yearConvertor(year);
		
	}

}



class Convertor {
	int century=0;
	
	public Convertor(int num) {
		century=num;
		}
	
	public void yearConvertor(int year) {
		
		century =(year/100)+1;
		
		System.out.println(year+" is "+century+"th century");
	}
	


}