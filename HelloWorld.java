import java.util.function.ToIntFunction;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        // array containing names of technologies I am experienced with.
        String[] technologies = { "React", "JavaScript", "Node.JS", "MySQL", "PotgreSQL", "Express", "Git", "npm" };
        boolean shouldPrint = true;
        if (shouldPrint) {
            for (int i = 0; i < technologies.length; i++) {
                System.out.println(technologies[i]);
            }
        }

        double x = (int) (Math.random() * ((12 - 1) + 1)) + 1;
        System.out.println(x);
        if (x == (1) | x == (2) | x == (3)){
            System.out.println("Team Blue wins.");
        } else if (x == (4) | x == (5) | x == (6)){
            System.out.println("Team Red wins.");
        } else if (x == (7) | x == (8) | x == (9)){
            System.out.println("Team Turquoise wins.");
        } else{
            System.out.println("Team Tan wins.");
        }
        
    }

}