package hangong.edu.csee.java.lab07.prob1;
import java.util.Scanner; //import the Scanner 
/**
 * 
 * @author GiChul
 * @version 1
 * @param main
 */
public class YearToCentury { //declare class name

	public static void main(String[] args) {  //declare main fuction
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);	//declare reference variable
		

		System.out.println("Input year : \n");  //print String
		int year=scan.nextInt();		//input the value of year
		
		Convertor result=new Convertor(year);  //declare reference variable
		result.yearConvertor(year);  // input the value into constructor
		
	}

}

/**
 * @param Convertor
 * @param yearConvertor
 * @return void
 */

class Convertor { 		//declare default class name
	int century=0;		//initialize the variable
	
	public Convertor(int num) {		//decide name of constructor
		century=num;		//substitute num into century
		}
	
	public void yearConvertor(int year) {		//yearConvertor method
		
		century =(year/100)+1;			//calculate the century
		
		System.out.println(year+" is "+century+"th century"); 	//print the result on the console 
	}
	


}