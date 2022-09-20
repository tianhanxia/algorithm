package DFS;

public class RecruitingEventSchedules {
    public void allSchedule(String input) {
        if (input == null || input.length() == 0) {
            return;
        }
        StringBuilder cur = new StringBuilder();
        helper(cur, 0, input);
    }

    private void helper(StringBuilder cur, int index, String input) {
        if (index == input.length() - 1) {
            cur.append(input.charAt(index));
            print(cur);
            cur.deleteCharAt(cur.length() - 1);
            return;
        }
        //add
        cur.append(input.charAt(index));
        cur.append("x");

        helper(cur, index + 1, input);

        cur.deleteCharAt(cur.length() - 1);
        cur.deleteCharAt(cur.length() - 1);
        //not add
        helper(cur, index + 1, input);
        cur.deleteCharAt(cur.length() - 1);
    }

    private void print(StringBuilder cur) {
        System.out.println(cur.toString());
    }

    public static void main(String[] args) {
        RecruitingEventSchedules test = new RecruitingEventSchedules();
        String input = "Hello";
        //String s = new String("World");
        test.allSchedule(input);

    }
}
