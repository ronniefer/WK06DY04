import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealerMakeModel {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
	    HashMap<String, String> carModelMake = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    carModelMake.put("Civic", "Honda");
	    carModelMake.put("Corolla", "Toyota");
	    carModelMake.put("Sentra", "Nissan");
	    carModelMake.put("Elantra", "Hyundai");
	    
	    /*
	    for(Map.Entry<String, String> entry: carModelMake.entrySet())
	    {
	    	System.out.println(entry.getKey());
	    	System.out.println(entry.getValue());
	    }
	    */
		System.out.println("What car model are you looking for?");
		String carModelLookup = input.nextLine();
		//String carMakeLookup = carModelMake.get(carModelLookup);
		
		System.out.println("Oh, you're looking for a " +carModelLookup+"?");
		System.out.println("Our " +carModelMake.get(carModelLookup)+ " selection is right over here..."); 
	}
}



