/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        // create a Restaurant
        Scanner input = new Scanner(System.in);

        System.out.println("Create your new Restsurant please write a name");
        String newRestaurant = input.nextLine();



        Restaurant newResaurant = new Restaurant(newRestaurant);

        newResaurant.setPriceCategory("Shawerma",2);
        newResaurant.setPriceCategory("Potato",1);

        System.out.println("Add review");
        System.out.println("Please Enter Your Name");
        String userName = input.nextLine();

        System.out.println("Please Enter Your Review");
        String theReview = input.nextLine();

        System.out.println("Please Enter Your Rate from 0 to 5");
        int userRatting = input.nextInt();
        while (userRatting > 5){
            System.out.println("Should be from 0 to 5");
            userRatting = input.nextInt();
        }

        newResaurant.addReview(userName,theReview,userRatting);

        newResaurant.addReview("mansoor","nice",5);
        newResaurant.addReview("mohammad","cool",4);

        System.out.println( newResaurant.getPriceCategory());
        System.out.println(newResaurant.toString());


    }
}
