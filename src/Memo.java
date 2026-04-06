import java.util.Arrays;

public class Memo {
    static int [][] memory;
    public static int helper(int [] nums, int prevIndex, int currIndex){
        if(currIndex == nums.length) return 0;

        int take = 0;
        if(prevIndex == -1 || nums[currIndex] > nums[prevIndex]) {
            take = 1+ helper(nums, currIndex,currIndex+1);
        }
        int nottake = helper(nums, prevIndex, currIndex+1);
        return memory[prevIndex+1][currIndex] = Math.max(take, nottake);
    }
    public static int lengthoffind(int [] nums){
        int n = nums.length;
        memory = new int [n+1][n];
        for(int [] row : memory)
            Arrays.fill(row, -1);
        return helper(nums, -1,0);
    }
    public static void main (String [] args){
        int [] nums = {0,1,0,3,2,3};
        System.out.println(lengthoffind(nums));
    }
}
