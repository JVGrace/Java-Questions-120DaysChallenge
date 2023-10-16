import java.util.HashSet;


public class UnionOfArray {
    static int union(int[] a,int[] b,int aSize,int bSize){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < aSize; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < bSize; i++) {
            set.add(b[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] a = {15,20,5,15};
        int[] b = {15,15,15,20,10};
        System.out.println("Distinct Size of Union of array is: "+union(a,b,a.length,b.length));
    }
}
/**
 * @author Pradumn Patel */