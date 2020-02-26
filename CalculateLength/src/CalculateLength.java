public class CalculateLength {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double Centimeters = 0;
        if (feet >= 0) {
            if (inches >=0 && inches <= 12) {
             Centimeters = (feet * 12 * 2.54) + (inches * 2.54);

                return Centimeters;
            }
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet;
        double leftoverInches;
        if (inches >= 0) {
            feet = Math.floor(inches / 12);
            leftoverInches = (inches % 12);
            return calcFeetAndInchesToCentimeters(feet, leftoverInches);
            } else
            return -1;
    }



    public static void main(String[] args) {


        System.out.println(calcFeetAndInchesToCentimeters(176,22));
        System.out.println(calcFeetAndInchesToCentimeters(-1,2));
        System.out.println(calcFeetAndInchesToCentimeters(0,0));
        System.out.println(calcFeetAndInchesToCentimeters(12.5,8));
        System.out.println(calcFeetAndInchesToCentimeters(176,3));
        System.out.println(calcFeetAndInchesToCentimeters(1,0.2));
        System.out.println(calcFeetAndInchesToCentimeters(16));


    }


}
