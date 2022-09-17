package leetcode.array_and_string.add_binary;

public class Runner {
    public static void main(String[] args) {
        String a = "101010101";
        String b = "11111111111";
        new Solution().addBinary(a, b);
    }
}

//          1 1 1 0
//            1 1 1
//-----------------
//        1 0 1  0 1
