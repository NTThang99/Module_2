package LeetCode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        s = s.trim(); // Loại bỏ các khoảng trắng thừa ở đầu và cuối chuỗi
        int lastSpaceIndex = s.lastIndexOf(' '); // Tìm vị trí của khoảng trắng cuối cùng trong chuỗi đã được loại bỏ khoảng trắng thừa
        int lastWordLength = s.length() - lastSpaceIndex - 1; // Độ dài của từ cuối cùng
        return lastWordLength;
    }

    public static void main(String[] args) {
        String input1 = "Hello World";
        String input2 = "   Hello  ";
        String input3 = "Hi";

        int length1 = LengthOfLastWord.lengthOfLastWord(input1);
        int length2 = LengthOfLastWord.lengthOfLastWord(input2);
        int length3 = LengthOfLastWord.lengthOfLastWord(input3);

        System.out.println("Độ dài của từ cuối cùng trong \"" + input1 + "\" là: " + length1);
        System.out.println("Độ dài của từ cuối cùng trong \"" + input2 + "\" là: " + length2);
        System.out.println("Độ dài của từ cuối cùng trong \"" + input3 + "\" là: " + length3);
    }
}
