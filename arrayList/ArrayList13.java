// Monotonic ArrayList  refrence : arraylist prcatice question 1 apna college

package arrayList;
import java.util.ArrayList;

public class ArrayList13 {
    public static boolean isMonotonic(ArrayList<Integer> A){
        boolean inc = true;
        boolean dec = true;

        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)>A.get(i+1))
                inc = false;
            if(A.get(i)<A.get(i+1))
                dec=false;
        }

        return inc || dec;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        System.out.println(isMonotonic(list));
    }
}
