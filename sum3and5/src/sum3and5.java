public class sum3and5 {

    public static void main(String[] args) {

        System.out.println(sum3n5());
    }


    public static int sum3n5() {
        int answer = 0;
        int counter = 0;

        for (int x=0; x<=1000; x++) {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                    answer = answer + x;
                    counter++;
                }
            if (counter == 5) {
                break;
            }
            }

        return answer;
    }
}
