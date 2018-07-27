
import java.util.Arrays;
public class Main {

public static void printMultipleOfThreeUpTo(int n){
    for(int i = 0; i <= n; i++){
        if (i%3==0){
            System.out.println(i);
        }
    }
}


public static double toRadians(double angles){
    double radians;
    radians = Math.PI * angles / 180;
    return radians;
    }


	public static void main(String[] args){
		// write your own code here
		// these are comments
		
		/* this is a multi-line comment, enclosed by "/" and "*"
		   it's still a comment
		   this is the last line of it */
		
		// let's declare a variable x that has an integer type
		int x; /* remember to add semi-colon after each line of code */


		// now i'm assigning a value to x
		x = 3; 
		
		// add your practice code down below
		int k = x % 9;
		System.out.println(k);
		System.out.println("Hello World!");
		

		printMultipleOfThreeUpTo(20);

	} // don't add anything below or on this line
}