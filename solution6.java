public class solution6 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else if (i != 0) {
                digits[i] = 0;
            } else {
                digits = new int[digits.length+1];
                digits[0] =1 ;
            }
        }
        return digits;
    }
}


