package handong.edu.csee.java.lab07.prob3;	//package name
		
/**
 * @param Attendance
 * @param get_name
 * @param get_year
 * @param get_id
 * @param get_missed
 * @param set_name
 * @param set_year
 * @param set_id
 * @param set_missed
 * @return name
 * @return year
 * @return student_id
 * @return missed
 */

public class Attendance {
	private String name = "";  //declare private String name
	private int year = 0;		//declare private year
	private String student_id = "";		//declare private student
	private int missed = 0;		//declare private missed

	

	public Attendance()		//declare the constructor to initialize
	{
		this.name = "Null"; //input Null data
		this.year = 0;		//input 0
		this.student_id = "Null";	//input Null data
		this.missed = 0;	//input 0
	}


	public Attendance(String name, int year, String student_id, int missed)  //declare the constructor to initialize
	{
		this.name = name; 	//input the data into the name instance variable
		this.year = year;	//input the data into the year instance variable
		this.student_id = student_id; //input the data into the student_id instance variable
		this.missed = missed; //input the data into the missed instance variable
	}

	

	public String get_name()	//	getName to establish
	{
		return name; //return the name
	}

	public int get_year() //	getYear to establish
	{
		return year;	//return year
	}

	public String get_id()	//	getString-id to establish
	{
		return student_id;	//return student_id
	}

	public int get_missed()		//	getMissed to establish
	{
		return missed;	//return missed
	}

	//Setters

	public void set_name(String name) //	setName to establish
	{
		this.name = name;	//return name
	}

	public void set_year(int year)	//	set_year to establish
	{
		this.year = year;	//return year
	}

	public void set_id(String student_id)	//	set_id to establish
	{
		this.student_id = student_id;	//return student_id
	}

	public void set_missed(int missed)	//	set_missed to establish
	{
		this.missed = missed;	//return missed
	}

}


