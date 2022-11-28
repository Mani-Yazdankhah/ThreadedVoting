import java.util.Arrays;

public class Competition {
    public static int[] votes = new int[]{0, 0, 0}; //Voting box

    public static void main(String[] args) {
        long timeToVote = 3000; //How long can people vote for (in mS)
        long start = System.currentTimeMillis();
        while ((System.currentTimeMillis() - start) < timeToVote) { // Keep receiving votes while there is time
            new Thread(new Viewer()).start();
        }
        System.out.println(Arrays.toString(votes)); // Print out the results
    }
}