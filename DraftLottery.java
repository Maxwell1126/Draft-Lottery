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

        //array list with all the lottery teams and their seeding going into the lottery.
        ArrayList<LotteryTeam> lotteryTeams = new ArrayList<LotteryTeam>();
        LotteryTeam newYork = new LotteryTeam();
        newYork.teamName = "New York";
        newYork.teamSeed = 1;
        lotteryTeams.add(newYork);
        LotteryTeam cleveland = new LotteryTeam();
        cleveland.teamName = "Cleveland";
        cleveland.teamSeed = 2;
        lotteryTeams.add(cleveland);
        LotteryTeam phoenix = new LotteryTeam();
        phoenix.teamName = "Phoenix";
        phoenix.teamSeed = 3;
        lotteryTeams.add(phoenix);
        LotteryTeam chicago = new LotteryTeam();
        chicago.teamName = "Chicago";
        chicago.teamSeed = 4;
        lotteryTeams.add(chicago);
        LotteryTeam atlanta = new LotteryTeam();
        atlanta.teamName = "Atlantta";
        atlanta.teamSeed = 5;
        lotteryTeams.add(atlanta);
        LotteryTeam washington = new LotteryTeam();
        washington.teamName = "Washington";
        washington.teamSeed = 6;
        lotteryTeams.add(washington);
        LotteryTeam newOrleans = new LotteryTeam();
        newOrleans.teamName = "New Orleans";
        newOrleans.teamSeed = 7;
        lotteryTeams.add(newOrleans);
        LotteryTeam dallas = new LotteryTeam();
        dallas.teamName = "Dallas";
        dallas.teamSeed = 8;
        lotteryTeams.add(dallas);
        LotteryTeam memphis = new LotteryTeam();
        memphis.teamName = "Memphis";
        memphis.teamSeed = 9;
        lotteryTeams.add(memphis);
        LotteryTeam minnesota = new LotteryTeam();
        minnesota.teamName = "Minnesota";
        minnesota.teamSeed = 10;
        lotteryTeams.add(minnesota);
        LotteryTeam losAngeles = new LotteryTeam();
        losAngeles.teamName = "Los Angeles";
        losAngeles.teamSeed = 11;
        lotteryTeams.add(losAngeles);
        LotteryTeam sacramento = new LotteryTeam();
        sacramento.teamName = "Sacramento";
        sacramento.teamSeed = 12;
        lotteryTeams.add(sacramento);
        LotteryTeam miami = new LotteryTeam();
        miami.teamName = "Miami";
        miami.teamSeed = 13;
        lotteryTeams.add(miami);
        LotteryTeam charlotte = new LotteryTeam();
        charlotte.teamName = "Charlotte";
        charlotte.teamSeed = 14;
        lotteryTeams.add(charlotte);

        
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
                winner = "Sacramento";
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
        for (int i = 0; lotteryTeams.size() > i; i++) {
            if (lotteryTeams.get(i).teamName != firstPlace && lotteryTeams.get(i).teamName != secondPlace
                    && lotteryTeams.get(i).teamName != thirdPlace && lotteryTeams.get(i).teamName != fourthPlace) {
                bottomTwelve.add(lotteryTeams.get(i));
            }
        }

        for (int i = 0; bottomTwelve.size() > i; i++) {
            System.out.println(bottomTwelve.get(i).teamName);
        }
    }
}