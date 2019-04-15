import java.util.function.ToIntFunction;
import java.util.ArrayList;
import java.util.Collections;


public class DraftLottery {

    public static void main(String[] args) {

        String firstPlace = "";
        String secondPlace = "";
        String thirdPlace = "";
        String fourthPlace = "";
        String fifthPlace = "";
        String sixthPlace = "";
        String seventhPlace = "";
        String eightPlace = "";
        String ninthPlace = "";
        String tenthPlace = "";
        String eleventhPlace = "";
        String twelvthPlace = "";
        String thirteenthPlace = "";
        String fourteenthPlace = "";
        ArrayList<LotteryTeam> lotteryTeams = new ArrayList<LotteryTeam>();
        LotteryTeam newYork = new LotteryTeam();
        newYork.teamName = "New York";
        newYork.teamSeed = 1;
        lotteryTeams.add(newYork);
        System.out.println(lotteryTeams.get(0).teamName);
        // ArrayList<LotteryTeam> lotteryTeams= { ("New York", 1), "Cleveland", "Phoenix", "Chicago", "Atlanta", "Washington", "New Orleans",
        //                    "Dallas", "Memphis", "Minnesota", "Los Angeles", "Sacremento", "Miami", "Charlotte"  };
        ArrayList<LotteryTeam> bottomTwelve = new ArrayList<LotteryTeam>();


        while (fourthPlace.length() == 0) {
            double winningNumber = (int) (Math.random() * ((1000 - 1) + 1)) + 1;
            String winner = "";
            if (winningNumber < 141) {
                winner = "New York";
            } else if ((winningNumber >= 141) && (winningNumber <= 278)) {
                winner = "Cleveland";
            } else if ((winningNumber >= 281) && (winningNumber <= 420)) {
                winner = "Phoenix";
            } else if ((winningNumber >= 421) && (winningNumber <= 545)) {
                winner = "Chicago";
            } else if ((winningNumber >= 546) && (winningNumber <= 650)) {
                winner = "Atlanta";
            } else if ((winningNumber >= 651) && (winningNumber <= 740)) {
                winner = "Washington";
            } else if ((winningNumber >= 741) && (winningNumber <= 815)) {
                winner = "New Orleans";
            } else if((winningNumber >= 816) && (winningNumber <= 875)){
                winner = "Dallas";
            } else if((winningNumber >= 876) && (winningNumber <= 920)){
                winner = "Memphis";
            } else if ((winningNumber >= 921) && (winningNumber <= 950)){
                winner = "Minnesota";
            } else if ((winningNumber >= 951) && (winningNumber <= 970)){
                winner = "Los Angeles";
            } else if ((winningNumber >= 971) && (winningNumber <= 985)){
                winner = "Sacremento";
            } else if ((winningNumber >= 986) && (winningNumber <= 995)){
                winner = "Miami";
            } else if ((winningNumber >= 996) && (winningNumber <= 1000)){
                winner = "Charlotte";
            }
            // determine first place.
            if (firstPlace.length() == 0) {
                firstPlace = winner;
                System.out.println("First place is " + firstPlace);
                System.out.println("Winning Number: " + winningNumber);
                // determine second place.
            //determine second place or check to see that it has been fulfilled. 
            } 
            else if ((firstPlace.length() > 0) && (secondPlace.length() == 0)) {
                // determine if the winner has already won a higher place. Re-roll if that
                // happens.
                if(firstPlace != winner){
                    secondPlace = winner;
                    System.out.println("Second place is " + secondPlace);
                }
                System.out.println("Winning Number: " + winningNumber);

                // determine third place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() == 0)) {
                // determine if the winner has already won a higher place. Re-roll if that
                // happens.
                if((firstPlace != winner) && (secondPlace != winner)){
                    thirdPlace = winner;
                    System.out.println("Third place is " + thirdPlace);
                } 
                System.out.println("Winning Number: " + winningNumber);

                // determine fourth place.
            } else if ((firstPlace.length() > 0) && (secondPlace.length() > 0) && (thirdPlace.length() > 0)
                    && (fourthPlace.length() == 0)) {
                        // determine if the winner has already won a higher place. Re-roll if that
                // happens.
                        if((firstPlace != winner) && (secondPlace != winner) && (thirdPlace != winner)){
                            fourthPlace = winner;
                            System.out.println("Fourth place is " + fourthPlace);
                        }
                System.out.println("Winning Number: " + winningNumber);
            } 
        }
    }
}