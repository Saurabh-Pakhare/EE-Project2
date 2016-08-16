import java.util.Scanner;

/**
 * Created by saurabh on 14/8/16.
 */
public class Driver {
    public static void main(String args [])
    {
        int lBound, uBound;
        Scanner CONSOLE = new Scanner(System.in);

        MetricConversion metricConversion = new MetricConversion();

        System.out.println("Enter range for Kg to Pound conversion table:");

        System.out.print("From- ");
        lBound = CONSOLE.nextInt();

        System.out.print("To- ");
        uBound = CONSOLE.nextInt();

        metricConversion.setLowerBound(lBound);
        metricConversion.setUpperBound(uBound);

        metricConversion.ConvertKgToPound();

        System.out.println("Conversion from Feet and Inches to Meters\n");
        metricConversion.FeetInchToMeter();

    }
}
