//1957 - Delete Characters to makw Fancy String
//very easy just we have to use Stringbuilder(why? - everytime we append to string
//it creates a new object , too much memory and time)
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        //take the count as 1
        int count = 1; 
        //this is the previous character
        char pre = s.charAt(0);
        //better than string concatination
        sb.append(pre);

        for (int i = 1; i < s.length(); i++) {
            //take the current char
            char current = s.charAt(i);
            // if they are equal count++
            if (current == pre) {
                count++;
                //if count is lesss than 2 we count
                if (count <= 2) { 
                    sb.append(current);
                }
            } else {
                //else we start again
                count = 1; 
                sb.append(current);
                pre = current;
            }
        }
        //stringbuilder is very efficient
        return sb.toString();
    }
}
