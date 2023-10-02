package pattern2;

public class Pattern1 {
    public static void hollow_rectange(int totRows, int totCols){
        // outer loop
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectange(10,7);
    }
}
