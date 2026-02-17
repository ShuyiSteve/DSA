import java.util.Arrays;

public class ContainsDuplicate_LC217 {
    public static boolean Solution(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i <= nums.length; i++) {
            if(nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
}
