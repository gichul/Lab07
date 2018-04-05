package hangong.edu.csee.java.lab07.prob2;
/**
 * @author GiChul
 * @param main
 * @param menu1
 * @param menu2
 * @param menu3
 * 
 */
public class FriedChichenMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);  //declare constructor menu1 
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5);	//declare constructor menu2
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);	//declare constructor menu3


		menu1.set_stars(3);		//set the stars number
		menu2.set_stars(4);		//set the stars number
		menu3.set_stars(1);		//set the stars number


		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars());		//print result on the console 
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());		//print result on the console
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());		//print result on the console

	}

}

/**
 * @param Chicken
 * @param get_name
 * @param get_price
 * @param get_stars
 * @param set_name
 * @param set_price
 * @param set_stars
 * @return name
 * @return price
 * @return stars
 */

class Chicken{					//declare class Chicken
	
	
	private String name;		//declare private variable
	private double price;		//declare private variable
	private int stars;			//declare private variable
	


	public Chicken(String name, double price, int stars) //constructor 	
	{
		this.name = name; 		//initialize the name 
		this.price = price;		//initialize the price
		this.stars = stars;		//initialize the stars 
	}


	

	public String get_name()		//	getName to establish
	{
		return this.name;	//return the String
	}

	public double get_price()		// getPrice to establish
	{
		return this.price;		//return the price
	}

	public int get_stars()			//	getStars to establish
	{
		return this.stars;  	////return the stars
	}


	public void set_name(String name)		//setName to establish
	{
		this.name = name;			//make the name instance and substitute 
	}

	public void set_price(double price)		//setName to establish
	{
		this.price = price;		//make the price instance and substitute 
	}

	public void set_stars(int stars)		//setName to establish
	{
		this.stars = stars;		//make the stars instance and substitute 
	}
}


	
	
