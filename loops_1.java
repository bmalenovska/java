// WHIEL LOOPS

// while loop is more suitable for true or false conditions;  for loop is more for situations where you already know the exact amount
//NEVERENDING LOOP

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello!");

    while(true) {
      System.out.println("Duck");
    }
    
  }
}


//WHILE LOOP, 1-10

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello!");

    int amountOfTimesToDuck = 10;
    while(amountOfTimesToDuck != 0) {
      System.out.println("Duck");
      amountOfTimesToDuck = amountOfTimesToDuck -1;
    }
    
  }
}


// COUNTDOUN 10-1

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello!");

    int amountOfTimesToDuck = 10;
    while(amountOfTimesToDuck != 0) {
      System.out.println(amountOfTimesToDuck);
      amountOfTimesToDuck = amountOfTimesToDuck -1;
    }
    
  }
}


// COUNT 0-10

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello!");

    int i = 0;
    while(i < 10) {
      System.out.println(i);
      i = i + 1;
    }

    
  }
}


// COUNT 1-10 ODD EVEN

public class Main {
  public static void main(String[] args) {

    System.out.println("Hello!");

    int i = 1; //First no is always 1
    boolean isEven = false; // First no is always odd

    //counts from 0 to 10
    //provides whether or not the number is even or odd

    while(i <= 10) {
      String evenOrOdd = "";
      if(isEven == true){
        evenOrOdd = "even";
      }else{
        evenOrOdd = "odd";
      }
      System.out.println(i + " " + evenOrOdd);
      i = i + 1;
      isEven = !isEven;
    }

  }
}



// HOMEWORK 
// 1. Create a triangle that is made of "_" symbol

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines for the triangle: ");
        int numLines = scanner.nextInt();

        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        scanner.close();
    }
}



// ANOTHER EXAMPLE WITH TRIANGLE
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /*
        _ // 4 spaces and one underscore
       __ // 3 spaces and two underscores
      ___ // 2 spaces and three underscores
     ____ // 1 space and four underscores
    _____ // 0 spaces and five underscores
    // X = 5
    // spaces = X - i;
    // underscores = i;
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please write a number!");
    int number = scanner.nextInt();

    String space = " ";
    String underScore = "_";
    for (int i = 1; i <= number; i++) { 
      int spacesCount = number - i;
      String lineResult = space.repeat(spacesCount); // Just 4 spaces
      String underscoresResult = underScore.repeat(i); // Just 1 underscore
      lineResult = lineResult + underscoresResult; // Combining 4 spaces and 1 underscore
      System.out.println(lineResult);
    }

    scanner.close();
  }
}
