// FOR LOOPS
// It's like counting from one number to another. For example, if you want to count from 1 to 10, you start at 1 and keep adding 1 until you reach 10.

public class Main {
    public static void main(String[] args) {
        // Packing a backpack for a trip
        for (int i = 0; i < 10; i++) {
            int itemNumber = i + 1; // Adjust item number for human-friendly output
            System.out.println("Packing item number " + itemNumber);
            // Pack item number itemNumber into your backpack
        }
        System.out.println("Backpack is packed and ready to go!");
    }
}



// WHILE LOOPS
// It's like playing a game until you're tired. You keep playing as long as a condition is true. Once the condition becomes false, you stop playing.

public class Main {
    public static void main(String[] args) {
        // Playing a game of rolling a dice until you get a six
        int diceResult;
        do {
            diceResult = (int) (Math.random() * 6) + 1; // Simulate rolling a dice
            System.out.println("Rolled a " + diceResult);
        } while (diceResult != 6);
        System.out.println("You rolled a six! You win!");
    }
}


// DO-WHILE LOOP
// Let's say you're learning to ride a bike. You want to keep practicing until you can ride without falling. You start by riding the bike at least once. 
// Then, after each attempt, you check if you're still falling. If you're not falling, you keep riding; if you are falling, you try again.

public class Main {
    public static void main(String[] args) {
        // Learning to ride a bike
        boolean falling;
        do {
            falling = Math.random() < 0.5; // Simulate falling while riding
            if (falling) {
                System.out.println("Fell off the bike, try again...");
            } else {
                System.out.println("Riding the bike...");
            }
        } while (falling);
        System.out.println("You're riding the bike without falling! Keep going!");
    }
}
