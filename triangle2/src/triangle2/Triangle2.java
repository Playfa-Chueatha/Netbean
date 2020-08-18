/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle2;
public class Triangle2 {
    public static void main(String[] args) {
        int num=4,m,n;
        for (m=1;m<=4;m++){           
            for (n=1;n<=4-m;n++)
                System.out.print("*");            
            for(n=1;n<=m;n++)
                System.out.print(" ");
            System.out.print("\n");
        }
    }  
}

