package st3;
import java.util.Scanner;
public class St3 {
public static void main(String[] args) {
import java.util.Scanner;
public class Exchange {  
    public static void main(String [] args){
        int number, base;
        String basedNumber = "";
        int decNumber = 0;
        int iRemainder, c = ' ';
        char cRemainder = 0;
        Scanner key = new Scanner(System.in);
        // รับค่าตัวเลข และ ฐาน
        System.out.print("Enter number :");
        number=key.nextInt();
        do {
          System.out.print("Enter base (2-16): ");
          base =key.nextInt();
          if (base < 2 || base > 16)
              System.out.println("Invalid Base! Try again!");
        } while (base < 2 || base > 16);
        // แปลงเลขฐานสิบเป็นฐานใดๆ
        do {
          iRemainder = number % base; // หารเอาเศษ
          if (iRemainder >= 10) { // เศษมากกว่า 10 ต้องเปลี่ยนเป็น A,B,C,D,E,F
            switch (iRemainder) {
              case 10 : cRemainder = 'A'; break;
              case 11 : cRemainder = 'B'; break;
              case 12 : cRemainder = 'C'; break;
              case 13 : cRemainder = 'D'; break;
              case 14 : cRemainder = 'E'; break;
              case 15 : cRemainder = 'F'; break;
            }
            basedNumber = cRemainder + basedNumber; // ต่อสตริงจากหลังไปหน้า
          } else { // เศษ 0-9 เอามาต่อกับสตริงได้เลย เพราะ int จะถูกแปลงเป็น String อัตโนมัติ
            basedNumber = iRemainder + basedNumber; // ต่อสตริงจากหลังไปหน้า
          }
          number = number / base; // หารเลขด้วยฐาน
        } while (number > 0); // ทำไปจนกว่า number จะเป็น 0
        // แปลงเลขฐานใดๆ มาเป็นฐานสิบ
        c = 0;
        while (c < basedNumber.length()) {
          cRemainder = basedNumber.charAt(c);
          // เชคว่าเป็น Character ตัวใด แล้วเปลี่ยนให้เป็นตัวเลข
          switch (cRemainder) {
            case '0' : iRemainder = 0; break;
            case '1' : iRemainder = 1; break;
            case '2' : iRemainder = 2; break;
            case '3' : iRemainder = 3; break;
            case '4' : iRemainder = 4; break;
            case '5' : iRemainder = 5; break;
            case '6' : iRemainder = 6; break;
            case '7' : iRemainder = 7; break;
            case '8' : iRemainder = 8; break;
            case '9' : iRemainder = 9; break;
            case 'A' : iRemainder = 10; break;
            case 'B' : iRemainder = 11; break;
            case 'C' : iRemainder = 12; break;
            case 'D' : iRemainder = 13; break;
            case 'E' : iRemainder = 14; break;
            case 'F' : iRemainder = 15; break;
          }
          decNumber += iRemainder * (int) Math.pow(base, (basedNumber.length() - 1 - c)); // เอาเลขที่ได้คูณกับค่าประจำหลัก
          c++;
        }
        // แสดงผล
        System.out.println("Convert to base " + base + ": " + basedNumber);
        System.out.println("Convert back to base 10: " + decNumber);
       }
     }
   }
}

