/* Cyrus Jayson A. Pedere
   Bscpe 1-1 Programming Logic and Design
   FSw1 Module 2: Input, Processing, and Output

   **** 2. Ingredient Adjuster *****
        JAVA LANGUAGE
 */

import java.util.Scanner ;

public class IngredientAdjusterCyrus
{

    public static void main(String[] args)
    {

    Scanner keyboard = new Scanner(System.in);
    int cookies, classTotal;
    double sugar, flour, butter;

    System.out.println("How many cookies do you want to make?");
    cookies = keyboard.nextInt();

    classTotal = cookies;

    sugar = (1.5*cookies)/48;
    butter = (1*cookies)/48;
    flour = (2.75*cookies)/48;

    System.out.println("The total number of cookies you want to make is: " + classTotal + ". ");
    System.out.println("The number of cups of sugar needed is: " + sugar + ". ");
    System.out.println("The number of cups of butter needed is: " + butter + ". ");
    System.out.println("The number of cups of flour needed is: " + flour + ". " );

    }



}







