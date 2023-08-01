package week04.morning;

import java.util.Scanner;  // importing Scanner library

public class Task03 {
    /*
        Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"
     */
    public static void main(String[] args) {
        // to have user input
        Scanner input = new Scanner(System.in);  // creating a scanner object

        int age, weight;  // Declare
      //  age = 20; // hard coded way
      //  weight = 40;
        age = input.nextInt();
        weight = input.nextInt();


        // let's check precondition
        if(age>18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You are not eligible to donate blood");
            }
        }else{
            System.out.println("Age must be greater than 18");
        }

    }

}
