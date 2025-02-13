public class problem1 {
    
    public static String stringCount(String input) {
        int aToM = 0;
        int nToZ = 0;
        int zeroTo4 = 0;
        int fiveTo9 = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'm') {
                aToM++;
            }
            if(input.charAt(i) >= 'n' && input.charAt(i) <= 'z') {
                nToZ++;
            }
            if(input.charAt(i) >= '0' && input.charAt(i) <= '4') {
                zeroTo4++;
            }
            if(input.charAt(i) >= '5' && input.charAt(i) <= '9') {
                fiveTo9++;
            }
        }

        String result = "a-m : " + aToM + "\nn-z : " + nToZ + "\n0-4 : " + zeroTo4 + "\n5-9 : " + fiveTo9;
        return result;
    }
    

    public static void main(String[] args) {
        System.out.println(stringCount("hello123world789"));
    }
}
