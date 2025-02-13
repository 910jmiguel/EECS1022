public class decimaltooctal {
    
    public static String toOctal(int value){
        String octal = "";
        int val = value;
        while(value > 0) {
            int remainder = val % 8;
            octal = remainder + octal;
            val = val / 8;
        }
        return octal;
    }

    public static void main(String[] args) {
        System.out.println(toOctal(65));
        System.out.println("test");
    }
}
