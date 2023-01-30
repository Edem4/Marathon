package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] num = {2,2,2,2,2,2};
        System.out.println(recursionSum(num,0));
    }
    public static int recursionSum(int[] n, int i){
        if(i == n.length){
            return 0;
        }
        return n[i] + recursionSum(n,i+1);
    }
}
