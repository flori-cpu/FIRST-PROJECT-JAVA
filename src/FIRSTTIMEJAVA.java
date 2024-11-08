
public class FirstTimeJava {

    public static void main(String[] args) {
        // Print statements
        System.out.println("Hello World");
        
        // Primitive types
        // Four integer types
        // Two floating-point types
        // For characters: 'char'
        // In addition to char, Java also has the String class for strings

        boolean isThursday = true;
        boolean isHungry = false;

        int age = 27;
        byte aByte = 127;
        short aShort = 4000;
        long aLong = 123456789L;

        // Floats
        double pie = 3.14;
        float morePie = 3.14f;

        // Char uses single quotes
        char c = 'c';

        // Double quotes for String
        String comment = "Today's a nice day";
        comment = "I wanna fly";
        System.out.println(comment);

        // In Java, creating a variable without a type is an "illegal operation"

        // Final makes the variable a constant
        final String favoriteFood = "paella";
        // favoriteFood = "pizza"; // Uncommenting this line will cause a compilation error

        System.out.println(comment + " and I want " + favoriteFood);

        double weight = 150;
        double venusWeight = weight * 0.91;
        System.out.println("Object's weight on Venus is " + venusWeight);

        // In Java, creating a variable without a type is an "illegal operation"

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("y is greater than x");
        }

        age = 17; // Re-assigning the age variable
        if (age > 20) {
            System.out.println("You can have a drink");
        } else if (age > 17 && age < 21) {
            System.out.println("Not old enough, too young");
        } else {
            System.out.println("Go home, way too young!");
        }
    }
}
