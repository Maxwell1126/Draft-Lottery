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

        String firstPlace = "";
        String secondPlace = "";
        String thirdPlace = "";
        String fourthPlace = "";
        String fifthPlace = "";
        String sixthPlace = "";
        String seventhPlace = "";
        String eightPlace = "";
        while (thirdPlace.length()==0) {
            double x = (int) (Math.random() * ((12 - 1) + 1)) + 1;
            double y = (int) (Math.random() * ((4 - 1) + 1)) + 1;
            // determine first place.
            if (firstPlace.length() == 0) {
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2)) {
                    firstPlace = "Blue";
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4)) {
                    firstPlace = "Gray";
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2)) {
                    firstPlace = "Red";
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4)) {
                    firstPlace = "Purple";
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2)) {
                    firstPlace = "Turquoise";
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4)) {
                    firstPlace = "Green";
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2)) {
                    firstPlace = "Tan";
                } else {
                    firstPlace = "Orange";
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
                System.out.println("First place is " + firstPlace);

            //determine second place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() == 0)){
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2)
                    && (firstPlace != "Blue")) {
                    secondPlace = "Blue";
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4)
                    && (firstPlace != "Gray")) {
                    secondPlace = "Gray";
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2)
                          && (firstPlace != "Red")) {
                    secondPlace = "Red";
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4)
                            && (firstPlace != "Purple")){
                    secondPlace = "Purple";
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2)
                            && (firstPlace != "Turquoise")) {
                    secondPlace = "Turquoise";
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4) 
                    && (firstPlace != "Green")) {
                    secondPlace = "Green";
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2)
                            && (firstPlace != "Tan")) {
                    secondPlace = "Tan";
                } else if(firstPlace != "Orange"){
                    secondPlace = "Orange";
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
                System.out.println("Second place is "+secondPlace);
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length()==0)) {
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2) && 
                        ((firstPlace != "Blue") && (secondPlace != "Blue"))) {
                    thirdPlace = "Blue";
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4) && 
                        ((firstPlace != "Gray") && (secondPlace != "Gray"))) {
                    thirdPlace = "Gray";
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2) &&
                        ((firstPlace != "Red") && (secondPlace != "Red"))) {
                    thirdPlace = "Red";
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4) &&
                        ((firstPlace != "Purple") && (secondPlace != "Purple"))) {
                    thirdPlace = "Purple";
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2) && 
                        ((firstPlace != "Turquoise") && (secondPlace != "Turquoise"))) {
                    thirdPlace = "Turquoise";
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4) && 
                ((firstPlace != "Green") && (secondPlace != "Green"))) {
                    thirdPlace = "Green";
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2) &&
                        ((firstPlace != "Tan") && (secondPlace != "Tan"))) {
                    thirdPlace = "Tan";
                } else if ((firstPlace != "Orange") && (secondPlace != "Orange")) {
                    thirdPlace = "Orange";
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
                System.out.println("Third place is " + thirdPlace);
            }
        }

    }

}