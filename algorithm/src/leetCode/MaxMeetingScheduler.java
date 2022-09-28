package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Meeting Scheduler: Goal is to attend max number of meetings
// Input : [[11,12],[12,13],[13,14],[11,13]]
// Output : [[11,12],[12,13],[13,14]]
// [1-10][2-3][3-5][5-8]
// [2-3][3-5][5-8]
//  Input : [[11,12],[11,12],[11,12]]
// Output : [[11,12]]

public class MaxMeetingScheduler {
    public static List<List<Integer>> maxMeetings (List<List<Integer>> input) {

        Collections.sort(input, (a, b) -> a.get(1) - b.get(1));

        List<List<Integer>> res = new ArrayList<>();
        int currEndTime = input.get(0).get(1);
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i).get(0) >= currEndTime) {
                currEndTime = input.get(i).get(1);
                List<Integer> currMeeting = new ArrayList<>();
                currMeeting.add(input.get(i-1).get(0));
                currMeeting.add(input.get(i-1).get(1));
                res.add(currMeeting);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> meeting1 = new ArrayList<>();
        meeting1.add(11);
        meeting1.add(12);
        input.add(meeting1);
        List<Integer> meeting4 = new ArrayList<>();
        meeting4.add(11);
        meeting4.add(13);
        input.add(meeting4);
        List<Integer> meeting2 = new ArrayList<>();
        meeting2.add(12);
        meeting2.add(13);
        input.add(meeting2);
        List<Integer> meeting3 = new ArrayList<>();
        meeting3.add(13);
        meeting3.add(14);
        input.add(meeting3);
//        List<Integer> meeting4 = new ArrayList<>();
//        meeting4.add(11);
//        meeting4.add(13);
//        input.add(meeting4);
        System.out.println(maxMeetings(input));
    }
}