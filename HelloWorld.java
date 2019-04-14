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

        while (sixthPlace.length() == 0) {
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

                // determine second place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() == 0)) {
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2) && (firstPlace != "Blue")) {
                    secondPlace = "Blue";
                    System.out.println("Second place is " + secondPlace);
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4) && (firstPlace != "Gray")) {
                    secondPlace = "Gray";
                    System.out.println("Second place is " + secondPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2) && (firstPlace != "Red")) {
                    secondPlace = "Red";
                    System.out.println("Second place is " + secondPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4) && (firstPlace != "Purple")) {
                    secondPlace = "Purple";
                    System.out.println("Second place is " + secondPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2) && (firstPlace != "Turquoise")) {
                    secondPlace = "Turquoise";
                    System.out.println("Second place is " + secondPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4) && (firstPlace != "Green")) {
                    secondPlace = "Green";
                    System.out.println("Second place is " + secondPlace);
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2) && (firstPlace != "Tan")) {
                    secondPlace = "Tan";
                    System.out.println("Second place is " + secondPlace);
                } else if (firstPlace != "Orange") {
                    secondPlace = "Orange";
                    System.out.println("Second place is " + secondPlace);
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);

                // determine third place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() == 0)) {
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2)
                        && ((firstPlace != "Blue") && (secondPlace != "Blue"))) {
                    thirdPlace = "Blue";
                    System.out.println("Third place is " + thirdPlace);
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4)
                        && ((firstPlace != "Gray") && (secondPlace != "Gray"))) {
                    thirdPlace = "Gray";
                    System.out.println("Third place is " + thirdPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2)
                        && ((firstPlace != "Red") && (secondPlace != "Red"))) {
                    thirdPlace = "Red";
                    System.out.println("Third place is " + thirdPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4)
                        && ((firstPlace != "Purple") && (secondPlace != "Purple"))) {
                    thirdPlace = "Purple";
                    System.out.println("Third place is " + thirdPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2)
                        && ((firstPlace != "Turquoise") && (secondPlace != "Turquoise"))) {
                    thirdPlace = "Turquoise";
                    System.out.println("Third place is " + thirdPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4)
                        && ((firstPlace != "Green") && (secondPlace != "Green"))) {
                    thirdPlace = "Green";
                    System.out.println("Third place is " + thirdPlace);
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2)
                        && ((firstPlace != "Tan") && (secondPlace != "Tan"))) {
                    thirdPlace = "Tan";
                    System.out.println("Third place is " + thirdPlace);
                } else if ((firstPlace != "Orange") && (secondPlace != "Orange")) {
                    thirdPlace = "Orange";
                    System.out.println("Third place is " + thirdPlace);
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);

                // determine fourth place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() > 0)
                    && (fourthPlace.length() == 0)) {
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2)
                        && ((firstPlace != "Blue") && (secondPlace != "Blue") && (thirdPlace != "Blue"))) {
                    fourthPlace = "Blue";
                    System.out.println("Fourth place is " + fourthPlace);
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4)
                        && ((firstPlace != "Gray") && (secondPlace != "Gray") && (thirdPlace != "Gray"))) {
                    fourthPlace = "Gray";
                    System.out.println("Fourth place is " + fourthPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2)
                        && ((firstPlace != "Red") && (secondPlace != "Red") && (thirdPlace != "Red"))) {
                    fourthPlace = "Red";
                    System.out.println("Fourth place is " + fourthPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4)
                        && ((firstPlace != "Purple") && (secondPlace != "Purple") && (thirdPlace != "Purple"))) {
                    fourthPlace = "Purple";
                    System.out.println("Fourth place is " + fourthPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2)
                        && ((firstPlace != "Turquoise") && (secondPlace != "Turquoise"))
                        && (thirdPlace != "Turquoise")) {
                    fourthPlace = "Turquoise";
                    System.out.println("Fourth place is " + fourthPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4)
                        && ((firstPlace != "Green") && (secondPlace != "Green") && (thirdPlace != "Green"))) {
                    fourthPlace = "Green";
                    System.out.println("Fourth place is " + fourthPlace);
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2)
                        && ((firstPlace != "Tan") && (secondPlace != "Tan") && (thirdPlace != "Tan"))) {
                    fourthPlace = "Tan";
                    System.out.println("Fourth place is " + fourthPlace);
                } else if ((firstPlace != "Orange") && (secondPlace != "Orange") && (thirdPlace != "Orange")) {
                    fourthPlace = "Orange";
                    System.out.println("Fourth place is " + fourthPlace);
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);

                // determine fifth place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() > 0)
                    && (fourthPlace.length() > 0) && (fifthPlace.length() == 0)) {
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2) && ((firstPlace != "Blue")
                        && (secondPlace != "Blue") && (thirdPlace != "Blue") && (fourthPlace != "Blue"))) {
                    fifthPlace = "Blue";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4) && ((firstPlace != "Gray")
                        && (secondPlace != "Gray") && (thirdPlace != "Gray") && (fourthPlace != "Gray"))) {
                    fifthPlace = "Gray";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2) && ((firstPlace != "Red")
                        && (secondPlace != "Red") && (thirdPlace != "Red") && (fourthPlace != "Red"))) {
                    fifthPlace = "Red";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4) && ((firstPlace != "Purple")
                        && (secondPlace != "Purple") && (thirdPlace != "Purple") && (fourthPlace != "Purple"))) {
                    fifthPlace = "Purple";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2)
                        && ((firstPlace != "Turquoise") && (secondPlace != "Turquoise") && (thirdPlace != "Turquoise")
                                && (fourthPlace != "Turquoise"))) {
                    fifthPlace = "Turquoise";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4) && ((firstPlace != "Green")
                        && (secondPlace != "Green") && (thirdPlace != "Green") && (fourthPlace != "Green"))) {
                    fifthPlace = "Green";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2) && ((firstPlace != "Tan")
                        && (secondPlace != "Tan") && (thirdPlace != "Tan") && (fourthPlace != "Tan"))) {
                    fifthPlace = "Tan";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if ((firstPlace != "Orange") && (secondPlace != "Orange") && (thirdPlace != "Orange")
                        && (fourthPlace != "Orange")) {
                    fifthPlace = "Orange";
                    System.out.println("Fifth place is " + fifthPlace);
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
            }

            // determine sixth place.
            else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() > 0)
                    && (fourthPlace.length() > 0) && (fifthPlace.length() > 0) && (sixthPlace.length() == 0)) {
                if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2) && ((firstPlace != "Blue")
                        && (secondPlace != "Blue") && (thirdPlace != "Blue") && (fourthPlace != "Blue"))) {
                    sixthPlace = "Blue";
                    System.out.println("Sixth place is " + sixthPlace);
                } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4) && ((firstPlace != "Gray")
                        && (secondPlace != "Gray") && (thirdPlace != "Gray") && (fourthPlace != "Gray"))) {
                    sixthPlace = "Gray";
                    System.out.println("Sixth place is " + sixthPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2) && ((firstPlace != "Red")
                        && (secondPlace != "Red") && (thirdPlace != "Red") && (fourthPlace != "Red"))) {
                    sixthPlace = "Red";
                    System.out.println("Sixth place is " + sixthPlace);
                } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4) && ((firstPlace != "Purple")
                        && (secondPlace != "Purple") && (thirdPlace != "Purple") && (fourthPlace != "Purple"))) {
                    sixthPlace = "Purple";
                    System.out.println("Sixth place is " + sixthPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2)
                        && ((firstPlace != "Turquoise") && (secondPlace != "Turquoise") && (thirdPlace != "Turquoise")
                                && (fourthPlace != "Turquoise"))) {
                    sixthPlace = "Turquoise";
                    System.out.println("Sixth place is " + sixthPlace);
                } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4) && ((firstPlace != "Green")
                        && (secondPlace != "Green") && (thirdPlace != "Green") && (fourthPlace != "Green"))) {
                    sixthPlace = "Green";
                    System.out.println("Sixth place is " + sixthPlace);
                } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2) && ((firstPlace != "Tan")
                        && (secondPlace != "Tan") && (thirdPlace != "Tan") && (fourthPlace != "Tan"))) {
                    sixthPlace = "Tan";
                    System.out.println("Fifth place is " + fifthPlace);
                } else if ((firstPlace != "Orange") && (secondPlace != "Orange") && (thirdPlace != "Orange")
                        && (fourthPlace != "Orange")) {
                    sixthPlace = "Orange";
                    System.out.println("Sixth place is " + sixthPlace);
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
            }
        }

    }
}