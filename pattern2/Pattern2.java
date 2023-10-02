package pattern2;

public class Pattern2 {
    public static void invertedRotatedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            // spacing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        invertedRotatedHalfPyramid(4);
    }
}
