package okaram.samples;

// slightly more complicated java program
public class Hello { // we always need a class 
    public static void main(String[] args) {   // main method. Program execution starts here   
        // we declare a variable of type Scanner called input, and initialize it  
    	java.util.Scanner input=new java.util.Scanner(System.in); // the Scanner class is useful for reading from keyboard
        

        System.out.println("Please enter your name"); // print instructions
        String name=input.nextLine(); // read 
        System.out.println( "Hello " + name ); // print message. + does string concatenation
    }
}
