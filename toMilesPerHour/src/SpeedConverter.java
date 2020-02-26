public class SpeedConverter {
    static long milesPerHour;
    static double exactMPH;

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            exactMPH= kilometersPerHour / 1.609;
            milesPerHour = Math.round(exactMPH);
            return milesPerHour;
        }

    return -1;

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            exactMPH= kilometersPerHour / 1.609;
            milesPerHour = Math.round(exactMPH);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
        else System.out.println("Invalid Value");


    }

    public static void main(String[] args) {

        printConversion(0.0);
        System.out.println(toMilesPerHour(15));

    }

}
