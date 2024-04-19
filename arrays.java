// WHAT ARE ARRAYS IN JAVA? 
// In this example:
// * int[] declares an array of integers.
// * numbers is the name of the array.
// * [5] specifies the size of the array, meaning it can hold 5 integers.
// * numbers[0], numbers[1], and so on, are called array elements. Each element can hold a single integer value.
// * We access array elements using square brackets [], with the index inside indicating which element we want to access. Arrays in Java are zero-indexed, meaning the first element is at index 0, the second at index 1, and so on.
// That's the basic idea of arrays in Java - a convenient way to store and access multiple values of the same type in one place.

// Declare an array of integers named "numbers" that can hold 5 values
int[] numbers = new int[5];

// Put some numbers into the array
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

// Now you can access these numbers using their positions (or indexes) in the array
System.out.println("The first number is: " + numbers[0]); // Outputs: The first number is: 10
System.out.println("The third number is: " + numbers[2]); // Outputs: The third number is: 30
