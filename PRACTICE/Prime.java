package PRACTICE;

public class Prime {
    public static void main(String[] args){
        
        int count=0;
        for(int i=2;i<=100;i++){
            
            for(int j=2;j<i+1;j++){
                if(i==j){

                    count++;
                    System.out.println(i);
                }
                if(i%j==0){
                    
                    break;
                }
                
            }
        }
        System.out.println(count);
    }
}
