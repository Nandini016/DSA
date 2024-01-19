import java.util.*;

public class JobSequencing {
    public static class Job {
        int deadlines;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadlines = d;
            profit = p;
        }
    }

    public static void main(String args[]) {
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, Comparator.comparingInt(job -> job.profit));

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadlines);
        }

        int time = 0;
        ArrayList<Integer> seq = new ArrayList<>();

        for (int i = maxDeadline; i >= 1; i--) {
            for (Job job : jobs) {
                if (job.deadlines >= i && !seq.contains(job.id)) {
                    seq.add(job.id);
                    time++;
                    break;
                }
            }
        }

        System.out.println("Max jobs are " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
