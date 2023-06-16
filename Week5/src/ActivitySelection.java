import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ActivitySelection {

    public static class Activity {
        public int start;
        public int end;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Activity> activityList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Activity activity = new Activity();
            activity.start = sc.nextInt();
            activity.end = sc.nextInt();
            activityList.add(activity);
        }

        activityList.sort(Comparator.comparingInt(o -> o.end));

        int count = 1;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (activityList.get(j).start > activityList.get(i).end) {
                count++;
                i = j;
            }
        }
        System.out.println(count);
    }
}
