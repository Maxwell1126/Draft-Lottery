import java.util.Comparator;

public class ComparatorTeams implements Comparator<LotteryTeam> {
    public int compare(LotteryTeam self, LotteryTeam other) {
        // I'm assuming your Employee.id is an Integer not an int.
        // If you'd like to use int, create an Integer before calling compareTo.
        return self.getId().compareTo(other.getId());
    }
}