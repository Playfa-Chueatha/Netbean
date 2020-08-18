package st2;

import java.util.Scanner;
public class St2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String name ;
        System.err.print("กรุณากรอกเลขฐาน");
        name = sn.next();
        
         String number ;
         System.out.print("กรุณากรอกจำนวนเลขที่จะเปลี่ยน");
         number = sn.next();
         System.out.print(number.length());
         for (int m = 0;m<number.length();m++){ 
            System.out.print(number.charAt(m)+String.valueOf(number.length()-m-1));
            
            int baes=sn.nextInt();
            
        
        
    }
    
}
