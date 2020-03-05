import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Square {
    public static boolean isSquare(int n) {
        boolean answer = false;

        for (int x = 0; x < 29853719; x++) {
            if (x * x == n) {
                System.out.println(x);
                answer = true;

            }
            if (n > 29853719) {
                answer = false;
            }

        }
        return answer;


        // or

        public static boolean isSquare2(int m) {
            return Math.sqrt(m) % 1 == 0;
        }



    }

    public static void main(String[] args) {
        System.out.println(isSquare(229212736));
    }

}
class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   Square.isSquare(0));
        assertEquals("3 isn't a square number", false,  Square.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   Square.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   Square.isSquare(25));
        assertEquals("26 isn't a square number",false,  Square.isSquare(26));
    }


}