class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            dayOfYear += 1;
        }

        return dayOfYear;
    }
}
