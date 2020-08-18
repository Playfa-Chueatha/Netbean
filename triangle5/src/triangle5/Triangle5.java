/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle5;
public class Triangle5 {
    public static void main(String[] args) {
        int num=4,m,n,o,p,x,y;
        for (m=1;m<=4;m++){
            for(n=4;n>m;n--)
                System.out.print(" ");
            for(x=1;x<m;x++)
                System.out.print("*");
            for(y=1;y<=m;y++)
                System.out.print("*");
             System.out.print("\n");
            }
        for (m=1;m<=4;m++){
            for(n=1;n<m;n++)
                System.out.print(" ");
            for(o=4;o>n;o--)
                System.out.print("*");
            for(p=4;p>=m;p--)
                System.out.print("*");  
            System.out.print("\n");
            }
}

