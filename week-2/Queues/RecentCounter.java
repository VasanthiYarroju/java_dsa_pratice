import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the new request time
        queue.add(t);

        // Remove requests that are older than t - 3000
        while (queue.peek() < t - 3000) {
            queue.poll(); // remove from front of the queue
        }

        // Return the number of requests in the last 3000ms
        return queue.size();
    }
        public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));    
        System.out.println(recentCounter.ping(100));  
        System.out.println(recentCounter.ping(3001)); 
        System.out.println(recentCounter.ping(3002)); 
    }
}
