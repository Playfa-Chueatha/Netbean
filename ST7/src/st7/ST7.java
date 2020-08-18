package st7;
import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
public class ST7 {
    public static void main(String[] args) {
       int m,n;
       int sum=0;       
       int j=' ';
       char ch=' ';
       int x=ch;
       Scanner input = new Scanner(System.in);      
       System.out.print("กรุณากรอกตัวเลข: ");
        String num = input.next();              
            do{
                System.out.print("กรุณากรอกเลขฐาน: ");
                m = input.nextInt();
                if(m!=2&&m!=8&&m!=16)
                    System.out.print("คุณกรอกเลขฐานไม่ถูกต้อง");
                else if (m==2||m==8||m==16)
                  break;
           }while (m!=2&&m!=8&&m!=16);
            
            for(n=0;n<num.length();n++){
               int i = num.charAt(n);
               switch(i){
                    case'0':j = 0;break;
                    case'1':j = 1;break;
                    case'2':j = 2;break;
                    case'3':j = 3;break;
                    case'4':j = 4;break;
                    case'5':j = 5;break;
                    case'6':j = 6;break;
                    case'7':j = 7;break;
                    case'8':j = 8;break;
                    case'9':j = 9;break;
                    case'A':j = 10;break;
                    case'a':j = 10;break;
                    case'B':j = 11;break;
                    case'b':j = 11;break;
                    case'C':j = 12;break;
                    case'c':j = 12;break;
                    case'D':j = 13;break;
                    case'd':j = 13;break;
                    case'E':j = 14;break;
                    case'e':j = 14;break;
                    case'F':j = 15;break;
                    case'f':j = 15;break;
                } 
                 sum+=j*(int)Math.pow(m,num.length()-1-n);
            }
            System.out.print("เลขฐาน10: "+sum);
            System.out.print("\n");
        }
    }
    









       