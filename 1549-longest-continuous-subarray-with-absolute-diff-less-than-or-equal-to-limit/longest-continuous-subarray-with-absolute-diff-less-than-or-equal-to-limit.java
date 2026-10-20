import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();

        int left = 0;
        int maxlength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Maximum maintain karna
            while (!maxDeque.isEmpty() &&
                   nums[maxDeque.peekLast()] <= nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(right);

            // Minimum maintain karna
            while (!minDeque.isEmpty() &&
                   nums[minDeque.peekLast()] >= nums[right]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(right);

            // Window invalid ho toh shrink karo
            while (nums[maxDeque.peekFirst()] -
                   nums[minDeque.peekFirst()] > limit) {

                if (maxDeque.peekFirst() == left) {
                    maxDeque.pollFirst();
                }

                if (minDeque.peekFirst() == left) {
                    minDeque.pollFirst();
                }

                left++;
            }

            // Longest valid window
            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;
    }
}