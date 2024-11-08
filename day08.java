//1829 Maximum XOR for aEach Query
/*
the problem is worded very bad but the problem is very easy
the problem is that we have to xor all the elements upto n then n-1 then n-2 and so on
but before we need to know how xor works:-
i) a^a=0
ii) a^0=a
now to maximize the answer we notice that the xor always results to a number which is 2**maxbit-1
 so what we can do is we will xor all the elements as they say and xor this 2**mxbit-1
 which will give us the k
 more clearly
 lets say 0 1 1 3
 0^1^1^3^k = 2**maxbit-1
 xor both sides with k
 0^1^1^3^0 = (2**maxbit-1)^k
 xor both sides with 2**maxbit-1
 0^1^1^3^0^(2**maxbit-1)=k^0
 thats how we get the answer
 */
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        //we will calculate the prefix sum in the same array instead of taking another array to save space
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]^nums[i];
        }
        //debugging purpose
        // System.out.println(Arrays.toString(nums));
        int []res=new int[nums.length];
        int bitmask = (1 << maximumBit) - 1; 
        for (int i = nums.length - 1; i >= 0; i--) {
            res[nums.length - 1 - i] = bitmask ^ nums[i];
        }
        return res;
    }
}
