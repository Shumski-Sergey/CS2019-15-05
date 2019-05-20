package gabrusev.lesson2;
/*тут
/
 */
import java.util.Scanner;

public class Home_work_c_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Ввод: ");
        int number1 = sc.nextInt() ;
        int number2 = sc.nextInt() ;
        int sum = number1 + number2 ;
        System.out.println("DEC: " + number1 + "+" + number2 + "=" + sum) ;

        String bin1 = Integer.toBinaryString(number1) ;
        String bin2 = Integer.toBinaryString(number2) ;
        String bin3 = Integer.toBinaryString(sum) ;
        System.out.println("BIN: " + bin1 + "+" + bin2 + "=" + bin3);

        String hex1 = Integer.toHexString(number1) ;
        String hex2 = Integer.toHexString(number2) ;
        String hex3 = Integer.toHexString(sum) ;
        System.out.println("HEX: " + hex1 + "+" + hex2 + "=" + hex3);

        String oct1 = Integer.toOctalString(number1) ;
        String oct2 = Integer.toOctalString(number2) ;
        String oct3 = Integer.toOctalString(sum) ;
        System.out.println("OCT: " + oct1 + "+" + oct2 + "=" + oct3);

    }
}
