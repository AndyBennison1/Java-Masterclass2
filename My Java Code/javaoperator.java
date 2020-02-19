class javaoperator {

    public static void main(String[] args) {
        double firstnum = 20.00;
        double secondnum = 80.00;

        double result = firstnum + secondnum * 100;

        double remainder = result % 40;

        System.out.println("(20.00 + 80.00 * 100) = " + result);
        System.out.println("The remainder when devided by 40 is " + remainder);

        boolean equalsZero = remainder == 0 ? true : false; 

        System.out.println("true if 0, false if not =  " + equalsZero);

        if (equalsZero == false) {
            System.out.println("remainder = " + remainder);
        }
        else System.out.println("There is no remainder");
        


}
}


