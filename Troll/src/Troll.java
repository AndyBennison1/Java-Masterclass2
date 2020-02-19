public class Troll {

    public static String disemvowel(String str) {
        // Code away...
        String result = str.replaceAll("(?i)[aeiou](?-i)", "");
// OR //         String result = str.replaceAll("[aeiouAEIOU]", "");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
    }
}
