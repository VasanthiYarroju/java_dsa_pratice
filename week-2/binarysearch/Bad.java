class VersionControl {
    private int badVersion;

    // Constructor to set the first bad version
    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    // Simulated API to check if a version is bad
    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

// Solution class that extends VersionControl
public class Bad extends VersionControl {

    public Bad(int badVersion) {
        super(badVersion);
    }

    
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;  // potential first bad version
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static void main(String[] args) {
        int n = 10;
        int bad = 5;

        Bad solution = new Bad(bad);
        int firstBad = solution.firstBadVersion(n);
        System.out.println("First bad version is: " + firstBad);
    }
}
