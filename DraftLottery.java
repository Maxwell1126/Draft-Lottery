import java.util.function.ToIntFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//create team objects with names, original seedings, and final placements.
class LotteryTeam {
    public String teamName;
    public Integer teamSeed;
    public Integer finalPlace;

    //method that gets the original seed of teams.
    public int getSeed(){
        return this.teamSeed;
    }

    //method that gets the final placement of teams.
    public int getPlace() {
        return this.finalPlace;
    }

}

//Used to organize teams 5-14 by their seeding.
class SeedComparator implements Comparator<LotteryTeam> {

    @Override
    public int compare(LotteryTeam team1, LotteryTeam team2) {
        int team1Seed = team1.getSeed();
        int team2Seed = team2.getSeed();

        if (team1Seed > team2Seed) {
            return 1;
        } else if (team1Seed < team2Seed) {
            return -1;
        } else {
            return 0;
        }
    }
}

//used to organize teams 1-14 based on thier final placement.
class PlaceComparator implements Comparator<LotteryTeam> {

    @Override
    public int compare(LotteryTeam team1, LotteryTeam team2) {
        int team1Place = team1.getPlace();
        int team2Place = team2.getPlace();

        if (team1Place > team2Place) {
            return 1;
        } else if (team1Place < team2Place) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class DraftLottery {

    public static void main(String[] args) {

        //Values to be assigned to a winning team.
        String firstPlace = "";
        String secondPlace = "";
        String thirdPlace = "";
        String fourthPlace = "";

        //array list with all the lottery teams and their seeding going into the lottery.
        //final placement is set to 1 as a placeholder.
        ArrayList<LotteryTeam> lotteryTeams = new ArrayList<LotteryTeam>();
        LotteryTeam newYork = new LotteryTeam();
        newYork.teamName = "New York";
        newYork.teamSeed = 1;
        newYork.finalPlace = 1;
        lotteryTeams.add(newYork);
        LotteryTeam cleveland = new LotteryTeam();
        cleveland.teamName = "Cleveland";
        cleveland.teamSeed = 2;
        cleveland.finalPlace = 1;
        lotteryTeams.add(cleveland);
        LotteryTeam phoenix = new LotteryTeam();
        phoenix.teamName = "Phoenix";
        phoenix.teamSeed = 3;
        phoenix.finalPlace = 1;
        lotteryTeams.add(phoenix);
        LotteryTeam chicago = new LotteryTeam();
        chicago.teamName = "Chicago";
        chicago.teamSeed = 4;
        chicago.finalPlace = 1;
        lotteryTeams.add(chicago);
        LotteryTeam atlanta = new LotteryTeam();
        atlanta.teamName = "Atlanta";
        atlanta.teamSeed = 5;
        atlanta.finalPlace = 1;
        lotteryTeams.add(atlanta);
        LotteryTeam washington = new LotteryTeam();
        washington.teamName = "Washington";
        washington.teamSeed = 6;
        washington.finalPlace = 1;
        lotteryTeams.add(washington);
        LotteryTeam newOrleans = new LotteryTeam();
        newOrleans.teamName = "New Orleans";
        newOrleans.teamSeed = 7;
        newOrleans.finalPlace = 1;
        lotteryTeams.add(newOrleans);
        LotteryTeam dallas = new LotteryTeam();
        dallas.teamName = "Dallas";
        dallas.teamSeed = 8;
        dallas.finalPlace = 1;
        lotteryTeams.add(dallas);
        LotteryTeam memphis = new LotteryTeam();
        memphis.teamName = "Memphis";
        memphis.teamSeed = 9;
        memphis.finalPlace = 1;
        lotteryTeams.add(memphis);
        LotteryTeam minnesota = new LotteryTeam();
        minnesota.teamName = "Minnesota";
        minnesota.teamSeed = 10;
        minnesota.finalPlace = 1;
        lotteryTeams.add(minnesota);
        LotteryTeam losAngeles = new LotteryTeam();
        losAngeles.teamName = "Los Angeles";
        losAngeles.teamSeed = 11;
        losAngeles.finalPlace = 1;
        lotteryTeams.add(losAngeles);
        LotteryTeam sacramento = new LotteryTeam();
        sacramento.teamName = "Sacramento";
        sacramento.teamSeed = 12;
        sacramento.finalPlace = 1;
        lotteryTeams.add(sacramento);
        LotteryTeam miami = new LotteryTeam();
        miami.teamName = "Miami";
        miami.teamSeed = 13;
        miami.finalPlace = 1;
        lotteryTeams.add(miami);
        LotteryTeam charlotte = new LotteryTeam();
        charlotte.teamName = "Charlotte";
        charlotte.teamSeed = 14;
        charlotte.finalPlace = 1;
        lotteryTeams.add(charlotte);

        
        //botttomTwelve array is used to hold the losing twelve teams.
        //It is later organized by seed and teams are given a final placement
        ArrayList<LotteryTeam> bottomTwelve = new ArrayList<LotteryTeam>();
        //finalOrder array is used to hold all the teams later organized by final placement.
        ArrayList<LotteryTeam> finalOrder = new ArrayList<LotteryTeam>();

        //This loop creates a number between 1-1000 and determines the winning team for picks
        //1-4. It does not move on to the next pick until the current pick it is on has its own
        //unique team.
        while (fourthPlace.length() == 0) {
            //our random number to determine winners
            double winningNumber = (int) (Math.random() * ((1000 - 1) + 1)) + 1;
            //our variable to assign team names to picks 1-4.
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

        //This loop adds the losing teams to the bottomTwelve array.
        for (int i = 0; lotteryTeams.size() > i; i++) {
            if (lotteryTeams.get(i).teamName != firstPlace && lotteryTeams.get(i).teamName != secondPlace
                    && lotteryTeams.get(i).teamName != thirdPlace && lotteryTeams.get(i).teamName != fourthPlace) {
                bottomTwelve.add(lotteryTeams.get(i));
            }
        }

        //This loop adds the winning teams to the finalOrder and assigns them a final placement.
        while(finalOrder.size()<4){
            if(finalOrder.size()== 0 ){
                for (int i = 0; lotteryTeams.size() > i; i++){
                    if (lotteryTeams.get(i).teamName == firstPlace){
                        lotteryTeams.get(i).finalPlace = 1;
                        finalOrder.add(lotteryTeams.get(i));
                    }
                }
            }else if (finalOrder.size()==1) {
                for (int i = 0; lotteryTeams.size() > i; i++) {
                    if (lotteryTeams.get(i).teamName == secondPlace) {
                        lotteryTeams.get(i).finalPlace = 2;
                        finalOrder.add(lotteryTeams.get(i));
                    }
                }
            }else if (finalOrder.size() == 2){
                for (int i = 0; lotteryTeams.size() > i; i++) {
                    if (lotteryTeams.get(i).teamName == thirdPlace) {
                        lotteryTeams.get(i).finalPlace = 3;
                        finalOrder.add(lotteryTeams.get(i));
                    }
                }
            } else if (finalOrder.size() == 3) {
                for (int i = 0; lotteryTeams.size() > i; i++) {
                    if (lotteryTeams.get(i).teamName == fourthPlace) {
                        lotteryTeams.get(i).finalPlace = 4;
                        finalOrder.add(lotteryTeams.get(i));
                    }
                }
            }
        }

        //This sorts the losing twelve teams by original seed. It then gives the teams their placement 
        // and add thems to the finalOrder array.
        Collections.sort(bottomTwelve, new SeedComparator());
        Integer placeCounter = 5;
        for (LotteryTeam team : bottomTwelve) {
            team.finalPlace = placeCounter;
            finalOrder.add(team);
            placeCounter++;
        }

        //This sorts all the teams in the finalOrder array by their final placement.
        Collections.sort(finalOrder, new PlaceComparator());
        for (LotteryTeam team : finalOrder) {
            System.out.println(team.teamName);
        }
    }
}


