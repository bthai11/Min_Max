import java.util.Scanner;


//Do not run the code. Comment on each line of code and state what each section/line of code does
public class Main{
    static int max = Integer.MIN_VALUE;
    static int num =0;
    public static void main(String[] args) {
        
        askMax();

    }
    public static void askMax(){
        while(num!=962024){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a integer, type 962024 to end the loop");
            try{
                num = sc.nextInt();
            }
            catch(Exception e){
                System.out.println("That is not a valid input.");
            } // To figure out what this try/catch does. Attempt to comment out lines all the lines between here and the "enter integer", except for the num = sc.nextInt()
            // Run the code and try a bunch of different inputs.

            if(num>max){
                max = num;
                System.out.println("The new max is "+max + "\n\n");
            }
            else{
                System.out.println(num + " is not larger than the old max of " + max + "\n\n");
                //once you get a chance to type here try to uncomment the line below and guess what happens
                //break;
            }
            
        }
       

    }

}




































OOOOOOgaaaBooogaBoooga Thou shau not run comment this out later to test code
//When you finally run the code try a bunch of inputs, such as strings, doubles, booleans and see what happens in the code.