package handong.edu.csee.java.lab07.prob3; //package name

import java.util.Random;  //import Random java util

/**
 * @author GiChul
 * @param main
 * @param s_1
 * @param s_2
 * @param s_3
 * @param s_4
 * 
 */
public class Attendance_main {  //name of public class


	public static void main(String[] args) {

		Attendance s_1 = new Attendance();  //make the instance
		Attendance s_2 = new Attendance();	//make the instance
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0); //make the constructor adn input data
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0); //make the constructor and input data

		s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0); // input the data
		s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);// input the data

		Random randomGenerator = new Random();	//make the Random instance

		s_1.set_missed(randomGenerator.nextInt(10));	//input the missed Random number
		s_2.set_missed(randomGenerator.nextInt(10));	//input the missed Random number
		s_3.set_missed(randomGenerator.nextInt(10));	//input the missed Random number
		s_4.set_missed(randomGenerator.nextInt(10));	//input the missed Random number


		if(s_1.get_missed() > 6)	//declare to print the result on console by using if statement 

		{
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); //print the result on console
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed()); //print the result on console
		}

		else		//if the absence numbers exceed 6 then execute thin statement
			System.out.println("We'll see about the grade, " + s_1.get_name());	//print the result on console
	
		if(s_2.get_missed() > 6)	//declare to print the result on console by using if statement 
		{
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course");//print the result on console
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());//print the result on console
		}
		else	//if the absence numbers exceed 6 then execute thin statement
			System.out.println("We'll see about the grade, " + s_2.get_name());//print the result on console
		if(s_3.get_missed() > 6)	//declare to print the result on console by using if statement 
		{
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");//print the result on console
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());//print the result on console
		}

		else	//if the absence numbers exceed 6 then execute thin statement
			System.out.println("We'll see about the grade, " + s_3.get_name());//print the result on console
		if(s_4.get_missed() > 6)	//if the absence numbers exceed 6 then execute thin statement

		{
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//print the result on console
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());//print the result on console
		}
		else	//if the absence numbers exceed 6 then execute thin statement
			System.out.println("We'll see about the grade, " + s_4.get_name());//print the result on console
	}


}

