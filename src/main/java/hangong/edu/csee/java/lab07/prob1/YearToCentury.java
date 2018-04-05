package hangong.edu.csee.java.lab07.prob1;
import java.util.Scanner; //import the Scanner 
/**
 * 
 * @author GiChul
 * @version 1
 * This class public class of this .java 
 * first we receive the data from keyboard 
 * and throwing Converter compute the result
 */
public class YearToCentury { //declare class name

	public static void main(String[] args) {  //declare main fuction
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);	//declare reference variable
		

		System.out.println("Input year : \n");  //print String
		int year=scan.nextInt();		//input the value of year
		
		Converter result=new Converter(year);  //declare reference variable
		result.yearConverter(year);  // input the value into constructor
		
	}

}

/**
 * This class is default class of this .java
 * first we initialize the data century to 0
 * we receive the number from main function
 * the yearConverter compute the result
 * after print the result on the console
 */

class Converter { 		//declare default class name
	int century=0;		//initialize the variable
	
	public Converter(int num) {		//decide name of constructor
		century=num;		//substitute num into century
		}
	
	public void yearConverter(int year) {		//yearConverter method
		
		century =(year/100)+1;			//calculate the century
		
		System.out.println(year+" is "+century+"th century"); 	//print the result on the console 
	}
	


}