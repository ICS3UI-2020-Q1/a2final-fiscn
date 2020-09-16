import java.util.Scanner; 

/**
 * This is a code for Conditional Pizza's tills. It will ask the user what the diameter of the pizza they are purchasing (in cm). Once these values are entered, the program will then calculate the subtotal of the order based on a number of factors, the taxes incurred (13% tax), and the final total. It will also output a little message.
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a Scanner for user input 
     Scanner input = new Scanner(System.in); 

    // prompt the user to enter the size of their pizza 
    System.out.println("What is the size of the pizza (in cm):"); 

    // create a variable for pizza size 
    double Pizza_Size = input.nextInt();  

    // create variables for the charges on the pizza 
    double labour_ch = 0.75;
    double oven_ch = 0.99;
    double per_cm_ch = Pizza_Size*0.50;  

    // create variable for the Subtotal,taxes, and total 
    double Sub_total = per_cm_ch + oven_ch + labour_ch; 
    double tax_total = (Sub_total/100)*13;
    double TOTAL = Sub_total + tax_total;

    // create an "if statement" to give the user the total price, tax, and message bassed on the size of their pizza 
    if (Pizza_Size >= 1 && Pizza_Size <= 20) { 
    System.out.println("Subtotal:$" + Sub_total); 
    System.out.println("Taxes:$" + tax_total); 
    System.out.println("Total:$" + TOTAL); 
    System.out.println("We are going to make you a cute little pizza!");
    } else if (Pizza_Size >= 21 && Pizza_Size <= 40) {
      System.out.println("Subtotal:$" + Sub_total); 
      System.out.println("Taxes:$" + tax_total); 
      System.out.println("Total:$" + TOTAL); 
      System.out.println("This will be delicious!");
    } else if (Pizza_Size >= 41) { 
      System.out.println("Subtotal:$" + Sub_total); 
      System.out.println("Taxes:$" + tax_total); 
      System.out.println("Total:$" + TOTAL); 
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    } 




    
  }
}
