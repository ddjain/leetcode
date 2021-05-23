public class containerWithMostWater {
    public static void main(String[] args) {
        int []arr={4,3,2,1,4};
        System.out.println(new containerWithMostWater().maxArea(arr));
    }
    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int maxArea=0;
        while (left < right) {
            int length=right-left;
            int area=Math.min(height[left],height[right])*length;
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right]) left++;
            else right--;
        }

        return maxArea;
    }
}
