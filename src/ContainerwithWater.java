public class ContainerwithWater {

    public static int maxArea(int [] heigh){
        int left = 0, right = heigh.length-1;
        int maxArea = 0;
        while(left <right){
            int width = right -left;
            int minHeight = Math.min(heigh[left], heigh[right]);
            int area = width* minHeight;
            maxArea = Math.max(maxArea, area);
            if(heigh[left] < heigh[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main (String [] args){
        int[] heigh = {1,1};
        System.out.println(maxArea(heigh));
    }
}
