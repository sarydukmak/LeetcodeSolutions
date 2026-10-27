class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1 = getDay(arriveAlice);
        int a2 = getDay(leaveAlice);
        int b1 = getDay(arriveBob);
        int b2 = getDay(leaveBob);
        return Math.max(0, Math.min(a2, b2) - Math.max(a1, b1) + 1);
    }
     public int getDay(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}
