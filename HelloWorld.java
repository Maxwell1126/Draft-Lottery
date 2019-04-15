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
            String winner = "";
            if ((x == (1) | x == (2) | x == (3)) && (y == 1) | (y == 2)) {
                winner = "Blue";
            } else if (((x == 1) | (x == 2) | (x == 3)) && (y == 3) | (y == 4)) {
                winner = "Gray";
            } else if (x == (4) | x == (5) | x == (6) && (y == 1) | (y == 2)) {
                winner = "Red";
            } else if (x == (4) | x == (5) | x == (6) && (y == 3) | (y == 4)) {
                winner = "Purple";
            } else if (x == (7) | x == (8) | x == (9) && (y == 1) | (y == 2)) {
                winner = "Turquoise";
            } else if (x == (7) | x == (8) | x == (9) && (y == 3) | (y == 4)) {
                winner = "Green";
            } else if (x == (10) | x == (11) | x == (12) && (y == 1) | (y == 2)) {
                winner = "Tan";
            } else {
                winner = "Orange";
            }
            // determine first place.
            if (firstPlace.length() == 0) {
                if(winner != ""){
                    firstPlace = winner;
                    System.out.println("First place is " + firstPlace);
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
                // determine second place.
            //determine second place or check to see that it has been fulfilled. 
            } else if ((firstPlace.length() > 0) && (secondPlace.length() == 0)) {
                // determine if the winner has already won a higher place. Re-roll if that
                // happens.
                if(firstPlace != winner){
                    secondPlace = winner;
                    System.out.println("Second place is " + secondPlace);
                }
                System.out.println("number x " + x);
                System.out.println("number y " + y);

                // determine third place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() == 0)) {
                // determine if the winner has already won a higher place. Re-roll if that
                // happens.
                if((firstPlace != winner) && (secondPlace != winner)){
                    thirdPlace = winner;
                    System.out.println("Third place is " + thirdPlace);
                } 
                System.out.println("number x " + x);
                System.out.println("number y " + y);

                // determine fourth place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() > 0)
                    && (fourthPlace.length() == 0)) {
                        // determine if the winner has already won a higher place. Re-roll if that
                // happens.
                        if((firstPlace != winner) && (secondPlace != winner) && (thirdPlace != winner)){
                            fourthPlace = winner;
                            System.out.println("Fourth place is " + fourthPlace);
                        }
                System.out.println("number x " + x);
                System.out.println("number y " + y);

                // determine fifth place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() > 0)
                    && (fourthPlace.length() > 0) && (fifthPlace.length() == 0)) {
                        // determine if the winner has already won a higher place. Re-roll if that
                // happens.
                        if((firstPlace != winner) && (secondPlace != winner) && (thirdPlace != winner)
                        && (fourthPlace != winner)){
                            fifthPlace = winner;
                            System.out.println("Fifth place is " + fifthPlace);
                        }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
            }

            // determine if sixth place is unfulfilled.
            else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() > 0)
                    && (fourthPlace.length() > 0) && (fifthPlace.length() > 0) && (sixthPlace.length() == 0)) {
                        //determine if the winner has already won a higher place. Re-roll if that happens.
                        if((firstPlace != winner) && (secondPlace != winner) && (thirdPlace != winner)
                        && (fourthPlace != winner ) && (fifthPlace != winner)){
                            sixthPlace = winner;
                            System.out.println("Sixth place is " + winner);
                        }
                System.out.println("number x " + x);
                System.out.println("number y " + y);
            }
        }

    }
}