import java.text.DecimalFormat;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int weeklyWorkHours = 5 * 6;
        System.out.println("Attendee working hours in a semester is: " + weeklyWorkHours * 17);
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        // ??
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.print("Percentage of working vs. non working hours in a week in the semester is: ");
        System.out.print(df.format(52 / (24. * 7) * 100));
        System.out.println("% given that the attendees work 52 hours in a week");
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}
