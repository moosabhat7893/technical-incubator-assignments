

import java.util.*;


public class StreamingMax {

    public static List<Integer> slidingWindowMax(int[] nums, int k) {

        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0; i < nums.length; i++) {

            // Remove indices outside window
            while(!dq.isEmpty() && dq.peekFirst() <= i-k)
                dq.pollFirst();

            // Remove smaller elements
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.offerLast(i);

            if(i >= k-1)
                result.add(nums[dq.peekFirst()]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {5,3,8,2,7,9,1};
        int k = 3;

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + slidingWindowMax(nums, k));
    }
}
