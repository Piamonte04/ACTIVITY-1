/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity.pkg1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
                
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Your Last Name: ");
        String lName = scn.nextLine();
        
        System.out.println("Enter Your First Name: ");
        String fName = scn.nextLine();
        
        System.out.println("Enter Your Middile Initial: ");
        String mInitial = scn.nextLine();
        
        System.out.println("Enter Your Age: ");
        String Age = scn.nextLine();
        
        System.out.println("Enter Your Gender: ");
        String gender = scn.nextLine();
        
        System.out.println("Enter Your Birthdate: ");
        String bDate = scn.nextLine();
        
        System.out.println("Your Data: " + "\n" + "Last Name: " + lName + "\n" + "First Name: " + fName + "\n"
         + "Middle Initial: " + mInitial + "\n" + "Age: " + Age + "\n" + "Gender: "+ gender + "\n" + "Birthdate: "+ bDate);
         
       scn.close();
    }
   
}
