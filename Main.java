import java.lang.*;
import java.util.*;

class Array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][]x=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                 x[i][j]=sc.nextInt();
            }
        }
        int y=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++) {
                if (x[i][j] == y) {
                    System.out.println("x found at location(" + i + ", " + j + ")");
                }
            }
        }
    }
}