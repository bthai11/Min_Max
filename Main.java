import java.util.Scanner;


//Do not run the code. Comment on each line of code and state what each section/line of code does
public class Main{
    static int max = Integer.MIN_VALUE;
    static int num =0;
    public static void main(String[] args) {
        
        askMax();

    }
    public static void askMax(){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a integer, type 962024 to end the loop");
            try{
                num = sc.nextInt();
            }
            catch(Exception e){
                System.out.println("That is not a valid input.");
            }

            if(num>max){
                max = num;
                System.out.println("The new max is "+max + "\n\n");
            }
            else{
                System.out.println(num + " is not larger than the old max of " + max + "\n\n");
            }
            
        }
       

    }

}




































OOOOOOgaaaBooogaBoooga Thou shau not run
