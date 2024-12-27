package CodeForces.BQueueAtTheSchool;

public class QueueAtTheSchool {
    public static String arrangeQueue(int n, int t, String s) {
        if (t == 0) return s;

        StringBuilder a = new StringBuilder();
        for(int i = 0; i < n; i++){
            if (s.charAt(i) == 'B' && i != n-1 && s.charAt(i+1) == 'G') {
                a.append("GB");
                i++;
            }
            else a.append(s.charAt(i));
        }

        return arrangeQueue( n,  t-1, a.toString());
    }
}
