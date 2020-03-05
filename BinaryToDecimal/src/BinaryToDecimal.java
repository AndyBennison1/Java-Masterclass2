import java.util.Scanner;

public class BinaryToDecimal {

    static Scanner sc = new Scanner(System.in);
    public static void converter2(String binaryValue2) {
        int result = 0;
        int firstNibble = 0;
        int secondNibble = 0;
        char[] hexValues = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if (binaryValue2.length() != 8)
            System.out.println(-1);

            //
            for (int i = 0; i < binaryValue2.length(); i++) {
                if ((binaryValue2.charAt(i) != '1') && (binaryValue2.charAt(i) != '0')) {
                    System.out.println(-1);
                }
                result+= Character.getNumericValue(binaryValue2.charAt(i)) * Math.pow(2, 8 - (i + 1));
            }

            // First Nibble
            for (int j = 0; j < binaryValue2.length() /2; j++) {
                firstNibble += Character.getNumericValue(binaryValue2.charAt(j)) * Math.pow(2, 4 - (j + 1));
            }
                System.out.println("first nibble = " + firstNibble);

            //Second Nibble
            for (int k = 4; k < binaryValue2.length(); k++) {
                secondNibble += Character.getNumericValue(binaryValue2.charAt(k)) * Math.pow(2, 4 - ((k -4) + 1));
            }
                System.out.println("second nibble = " + secondNibble);

            System.out.println("Your Hex value = " + hexValues[firstNibble] + hexValues[secondNibble]);
            System.out.println("Your decimal number is " + result);
            System.out.println("Your ascii character is " + (char) result);
    }

    public static void main(String[] args) {
        System.out.println("Enter a binary number");
        String bin = sc.nextLine();
        converter2(bin);
        }
}
/*
public static double converter(String binaryValue) {
        long answer = 0;
        char[] bits = binaryValue.toCharArray();
            answer += (Character.getNumericValue(bits[0]) * 128);
            answer += (Character.getNumericValue((bits[1]) * 64));
            answer += (Character.getNumericValue((bits[2]) * 32));
            answer += (Character.getNumericValue((bits[3]) * 16));
            answer += (Character.getNumericValue((bits[4]) * 8));
            answer += (Character.getNumericValue((bits[5]) * 4));
            answer += (Character.getNumericValue((bits[6]) * 2));
            answer += (Character.getNumericValue((bits[7]) * 1));
        return answer;
    }
 */