package LeetCode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        int lastWordLength = s.length() - lastSpaceIndex - 1;
        return lastWordLength;
    }
}
