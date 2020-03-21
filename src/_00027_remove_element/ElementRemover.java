package _00027_remove_element;

public class ElementRemover {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int n : nums) {
            if (n != val) {
                nums[i++] = n;
            }
        }

        return i;
    }
}
