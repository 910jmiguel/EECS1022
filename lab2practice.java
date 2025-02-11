public class lab2practice {
    
    public static int digitCountinString(String str) {
        int digitCount = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                digitCount++;
            }
        }
        return digitCount;
    }

    //int randomNum = min + (int)(Math.random() * ((max – min) + 1));
    //random numbers between x and y, assuming n is positive and x <= y
    // n - # of random integers
    // x - int input of lower limit
    // y - int input of upper limit
    public static String stringOfRandomInt(int n, int x, int y) {
        String output = "";
        for (int i = 0; i < n; i++) {
            int randomNum = x + (int)(Math.random() * ((y - x) + 1));
            output += "<" +randomNum+ ">";
        }
        
        return output;
    }

    public static int lengthofMaxConsecutiveZeros(String str) {
        
        return 999;
    }

    public static void main(String[] args) {
        System.out.println(digitCountinString("mystring123"));
        System.out.println(digitCountinString("123mystring123"));
        System.out.println(digitCountinString("123my25str047ing123"));

        System.out.println(stringOfRandomInt(5, 5, 10));
        System.out.println(stringOfRandomInt(2, 2, 7));
    }
}
