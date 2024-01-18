import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionwithSorting {
    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int activity[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble((int[] o) -> o[2]));

        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activity[0][0]);
        int lastend = activity[0][2];

        for (int i = 1; i < start.length; i++) {
            if (activity[i][1] >= lastend) {
                maxAct++;
                ans.add(activity[i][0]);
                lastend = activity[i][2];
            }
        }

        System.out.println("max activity " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
