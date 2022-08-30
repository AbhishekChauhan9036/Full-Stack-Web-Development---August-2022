import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
            if(j<=i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }

        System.out.println();
    }
    }
}