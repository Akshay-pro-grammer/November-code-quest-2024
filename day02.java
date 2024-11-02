//2490 Circular Sentence
//very straight forward solution 
//split the sentence into words
//as per constraints , the words have no trailling or leading spaces 
//and only one space so everything should be fine
class Solution {
    public boolean isCircularSentence(String sentence) {
        //sentence to words
        String words[]=sentence.split(" ");
        for(int i=0;i<words.length-1;i++){
            //if the current word's last character is not equal to first character of the next word
            //then return false
            if(words[i].charAt(words[i].length()-1)!=words[i+1].charAt(0)){
                return false;
            }
        }
        //if the last character is not ewual to the first chracter return false
        if(sentence.charAt(sentence.length()-1)!=sentence.charAt(0)){
            return false;
        }
        //if none match
        return true;
    }
}
