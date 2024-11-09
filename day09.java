//3133 Minimum Array End
// the solution is hard to come up with
//it is a two pointer approach
// teh first thing is to understand that the lower limit 
// if you and any random numbers , you will notice that the result of binary and is always the lower number
//so the lower limit it x
//we will start from x
//now in the bit level of x; we want to make sure that the bitswith 1 stays while the most significant 0 from the right ot left must be changed
//so we will use two ponter approach to hold xbit and nbit
//whenever x bit is 1 we skip , whenever we have xbit 0 we know we can fill it so we will fill it with the last bit found in n-1
//why n-1? the largest number we can have is n-1
//if we accomodate in x , we will get the answer
class Solution {
    public long minEnd(int n, int x) {
        long res = x;
        long bitx = 1;
        long bitn = 1;
        while (bitn <= n - 1) {
            if ((bitx & x) == 0) {
                if ((bitn & (n - 1)) != 0) {
                    res = res | bitx;
                }
                bitn = bitn << 1;
            }
            bitx = bitx << 1;
        }
        return res;
    }
}
