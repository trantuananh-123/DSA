import java.util.*;

public class JobSequence {

    public static class Job {
        private int id;
        private int deadline;
        private int profit;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Job> jobList = new ArrayList<>();
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            Job job = new Job();
            job.id = sc.nextInt();
            job.deadline = sc.nextInt();
            job.profit = sc.nextInt();
            if (maxDeadline < job.deadline) {
                maxDeadline = job.deadline;
            }
            jobList.add(job);
        }

        jobList.sort((o1, o2) -> o2.profit - o1.profit);

        int count = 0;
        int total = 0;
        boolean[] isUsed = new boolean[maxDeadline + 1];
        for (int i = 0; i < maxDeadline; i++) {
            isUsed[i + 1] = false;
        }
        for (Job job : jobList) {
            if (!isUsed[job.deadline]) {
                count++;
                total += job.profit;
                isUsed[job.deadline] = true;
            } else {
                int deadline = job.deadline;
                while (deadline > 0) {
                    deadline--;
                    if (!isUsed[deadline] && deadline > 0) {
                        count++;
                        total += job.profit;
                        isUsed[deadline] = true;
                        break;
                    }
                }
            }
        }
//        for (Job job : jobList) {
//            System.out.print(job.id + " " + job.deadline + " " + job.profit);
//            System.out.println();
//        }
        System.out.println(count + " " + total);
    }
}
