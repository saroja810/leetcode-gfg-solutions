class Solution {
    public String getDayOfWeek(int[] date) {

        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        int[] t = {
            0, 3, 2, 5, 0, 3,
            5, 1, 4, 6, 2, 4
        };

        // January and February belong to the previous year
        int year = date[2];
        if (date[1] < 3) {
            year--;
        }

        int dayIndex = (
            year + year / 4 - year / 100 + year / 400
            + t[date[1] - 1] + date[0]
        ) % 7;

        return days[dayIndex];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna