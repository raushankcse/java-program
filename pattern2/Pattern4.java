package pattern2;

public class Pattern4 {
    public static void floydsTriangle(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floydsTriangle(5);
    }
}
