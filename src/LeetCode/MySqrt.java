package LeetCode;

public class MySqrt {
    public int mySqrt(int x) {
        double results = Math.sqrt(x);
        int sqrt = (int)Math.floor(results) ;
        return sqrt;
    }
}
