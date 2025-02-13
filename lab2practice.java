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
        int max = 0;
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                count++;
            } else {
                count = 0;
            }

            if(count > max) {
                max = count;
            } 
        }
        return max;
    }

    public static String mixStrings(String s1, String s2, String s3) {
        if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) {
            return "Invalid";
        }

        //s1
        int halfLength = (s1.length() + 1) / 2;
        String string1 = s1.substring(0, halfLength);

        //s2
        String str2;
        String string2 = "";
        if(s2.length() >= 2) {
            str2 = s2.substring(s2.length() - 2);
        } else {
            str2 = s2.substring(s2.length() - 1);
        }
        for(int i = 0; i < 3; i++) {
            string2 += str2;
        }

        //s3
        String str3;
        String string3 = "";
        if(s3.length() >= 2) {
            str3 = s3.substring(0, 2);
        } else {
            str3 = s3.substring(0);
        }
        for(int i = 0; i < 5; i++) {
            string3 += str3;
        }

        return string1 + string2 + string3;
    }

    public static String stringCompressor(String inputStr) {
        int count = 1;
        String compString = "";

        if(inputStr.length() == 0) {
            return "";
        }

        for(int i = 1; i < inputStr.length(); i++) {
            if(inputStr.charAt(i) == inputStr.charAt(i - 1)) {
                count++;
            } else {
                compString += inputStr.charAt(i - 1) + Integer.toString(count);
                count = 1;
            }
        }
        compString += inputStr.charAt(inputStr.length() - 1) + Integer.toString(count);
        return compString;
    }

    public static String binaryRepresentation(short value) {
        String binaryResult = "";
        int val = value;

        while(value > 0) {
            int remainder = val % 2;
            binaryResult = remainder + binaryResult;
            val = val / 2;
        }

        while(binaryResult.length() < 16) {
            binaryResult = "0" + binaryResult;
        }

        String result = "The decimal value (" + value + ") has binary representation [" + binaryResult + "]";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(digitCountinString("mystring123"));
        System.out.println(digitCountinString("123mystring123"));
        System.out.println(digitCountinString("123my25str047ing123"));

        System.out.println(stringOfRandomInt(5, 5, 10));
        System.out.println(stringOfRandomInt(2, 2, 7));

        System.out.println(lengthofMaxConsecutiveZeros("11101110001"));
        System.out.println(lengthofMaxConsecutiveZeros("10000001001"));
        System.out.println(lengthofMaxConsecutiveZeros("0000100111"));
        System.out.println(lengthofMaxConsecutiveZeros("01001010100111"));

        System.out.println(mixStrings("York", "Hello", "Time"));

        System.out.println(stringCompressor(""));
        System.out.println(stringCompressor("bbbcfreb$b"));
        System.out.println(stringCompressor("bbbrrraaaaaazzzz"));

        System.out.println(binaryRepresentation((short) 15));
    }
}
