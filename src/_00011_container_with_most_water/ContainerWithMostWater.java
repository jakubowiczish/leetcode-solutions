package _00011_container_with_most_water;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int area = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(area);
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right])
                ++left;
            else --right;
        }

        return maxArea;
    }

    public static int maxAreaON2Solution(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int max = Math.min(height[j], height[i]);
                int curr = (j - i) * max;
                maxArea = Math.max(curr, maxArea);
            }
        }

        return maxArea;
    }
}
