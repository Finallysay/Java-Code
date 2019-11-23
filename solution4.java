public class solution4 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int index = m + n - 1;
        while (true) {
            if (p1 < 0) {
                for (int i = 0; i <= p2; i++) {
                    nums1[i] = nums2[i];
                }
                break;
            } else if (p2 < 0) {
                break;
            } else {
                nums1[index--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
            }

        }
        
    }

}
