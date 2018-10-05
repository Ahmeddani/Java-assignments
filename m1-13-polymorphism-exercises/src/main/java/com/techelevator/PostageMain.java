package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageMain {

	public static void main(String[] args) {
	
		 Scanner in = new Scanner(System.in);
         List<DeliveryDriver> deliveryServices = new ArrayList<DeliveryDriver>();
         
         deliveryServices.add(new PostalService(1));
         deliveryServices.add(new PostalService(2));
         deliveryServices.add(new PostalService(3));
         deliveryServices.add(new FexEd());
         deliveryServices.add(new SPU("4"));
         deliveryServices.add(new SPU("2"));
         deliveryServices.add(new SPU("next day"));
         
         System.out.println("Please Enter the weight of the package? >>>>>>>");
         double packageWeight = in.nextDouble();
         in.nextLine();
         System.out.println("(P) ounds or (O) unces ? >>>>>>>>");
         String weightChoice = in.nextLine();
         if(weightChoice == "P") {
        	 packageWeight = packageWeight * 16;
         }
         if(!(weightChoice.equals("P") || weightChoice.equals("O"))){
        	 System.out.println("Please Enter correct type of weight!! (P) ound or (O) unce ???");
         }
 
         in.nextLine();
         System.out.println("What distance will it be traveling to?>>>>>>> ");
         int distance = in.nextInt();
         
         System.out.println("Delivery Method" + "\t\t\t" + "Cost");
         System.out.println("--------------------------------------");
         
         for (DeliveryDriver service:  deliveryServices) {
        	 
        	 System.out.println(service.getClass().getSimpleName() + "\t\t\t" + "$"+service.CalculateRate(distance, packageWeight));
             continue;
         }
	}

}
