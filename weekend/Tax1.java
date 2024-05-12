public class Tax1 {
    public static int calculateAge(String dateOfBirth) {

        String[] parts = dateOfBirth.split("-");
        int birthYear = Integer.parseInt(parts[2]);
        int birthMonth = Integer.parseInt(parts[1]);
        int birthDay = Integer.parseInt(parts[0]);

        long currentMillis = System.currentTimeMillis();
        int currentYear = getYear(currentMillis);
        int currentMonth = getMonth(currentMillis);
        int currentDay = getDay(currentMillis);

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--; 
        }

        return age;
    }
    private static int getYear(long millis) {
        return 1970 + (int) (millis / (365.25 * 24 * 60 * 60 * 1000));
    }

    private static int getMonth(long millis) {
        int year = getYear(millis);
        long yearStartMillis = getMillisForYear(year);
        long remainingMillis = millis - yearStartMillis;
        return (int) (remainingMillis / (30.44 * 24 * 60 * 60 * 1000)) + 1;
    }

    private static int getDay(long millis) {
        int year = getYear(millis);
        int month = getMonth(millis);
        long monthStartMillis = getMillisForMonth(year, month);
        long remainingMillis = millis - monthStartMillis;
        return (int) (remainingMillis / (24 * 60 * 60 * 1000)) + 1;
    }

    private static long getMillisForYear(int year) {
        return (long) ((year - 1970) * 365.25 * 24 * 60 * 60 * 1000);
    }

    private static long getMillisForMonth(int year, int month) {
        long yearStartMillis = getMillisForYear(year);
        return yearStartMillis + (long) ((month - 1) * 30.44 * 24 * 60 * 60 * 1000);
    }
    public static void main(String[] args) {
        String dateOfBirth = "19-02-1992";
        int age = calculateAge(dateOfBirth);
        System.out.println("Age: " + age);
    }
}
