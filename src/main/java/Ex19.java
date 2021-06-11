public class Ex19 {
    public String covertToRoman(int decimal) {
        String result = new String();
        int times = 0;
        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I"};
        int[] ints = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5,
                4, 1};
        for (int i = 0; i < ints.length; i++) {
            int currentNum = decimal / ints[i];
            if (currentNum == 0) {
                continue;
            }
            for (int j = 0; j < currentNum; j++) {
                result += romans[i];
            }
            decimal = decimal % ints[i];
        }
        return result;
    }
}
