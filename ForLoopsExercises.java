import java.util.*;

public class ForLoopsExercises {

    public static void main(String [] args) {

      //declaring my Scanner
      Scanner console = new Scanner(System.in); 
      
      //prompt the user for input
      System.out.print("Please enter a width followed by a height separated by a space: ");

      //capturing the entered value
      int width = console.nextInt();
      int height = console.nextInt(); 

    
      //ExerciseOne();
      //ExerciseTwo();

      //passing the entered values to be used in ExerciseThree()
      ExerciseThree(width, height);
      //ExerciseFour();
    
    }
    
    //Exercise 1
    public static void ExerciseOne() {

        for(int line = 1; line <= 5; line++) {
            for(int j = 1; j <= 5 - line; j++){
                System.out.print(".");
            } 
            for(int k = 1; k <= line; k++){
                System.out.print(line);
            }
            System.out.println();
        }
    }
    //Exercise 2
    public static void ExerciseTwo() {

        for(int line = 1; line <= 5; line++) {
            for(int j = 1; j <= 5 - line; j++){
                System.out.print(".");
            } 
            System.out.print(line); 
            for(int k = 0; k < line - 1; k++){
                System.out.print(".");
            }
            System.out.println(); 
        }
    }
    
     //Exercise 3
    public static void ExerciseThree(int width, int height) {
        
        //top row
        for(int i = 1; i <= width; i++){
            System.out.print("*");
        }
        System.out.println(); 

        //middle section
        for(int j = 1; j <= height - 2; j++){
            System.out.print("*");
            for(int k = 1 ; k <= width - 2; k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //bottom section
        for(int i = 1; i <= width; i++){
            System.out.print("*");
        }
        System.out.println(); 
      

    }
    
     //Exercise 4
    public static void ExerciseFour() {
    
        int size = 5; 

        //top line
        System.out.print("+");
        for(int i = 1; i <= 2 * size; i++){
            System.out.print("/\\");
        }
        System.out.println("+");

        //middle
        for(int i = 1; i <= size; i++){
            System.out.print("|");
            for(int j = 1; j <= 4 * size; j++){
                System.out.print(" ");
            }
            System.out.println("|");
        }

        //bottom 
         System.out.print("+");
        for(int i = 1; i <= 2 * size; i++){
            System.out.print("/\\");
        }
        System.out.println("+");
    }

}
