import java.util.Random;

public class Viewer implements Runnable {
    @Override
    public void run() {
        int candidate = new Random().nextInt(3); // Pick a candidate to vote for
        synchronized (Competition.votes) { // Obtain the lock while voting
            Competition.votes[candidate]++; // Vote
        } // Release the lock
    }
}