import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//1)
        double n = scanner.nextDouble();
        double k = 0;
        for (int i = 0; i <= n; i++) {
            k += i;

        }
        System.out.println(k / n);
//2)
//        int t=0;
//
//        double num = scanner.nextDouble();
//        for(int i=0;i<num;i++){
//
//            while (num != 1) {
//                if (num / 2 == (int) num / 2) {
//                    t++;
//                } else {
//                    num -= i;
//                }
//            }
//        }
//        double p=Math.pow(2, t);;
//
//        while (num>0) {
//
//            num-=p;
//            System.out.println(" " + t);
//            t--;
//
//        }

        //}
//3)
        int q = 15;
        for (int i = 0; i < q; i++) {
            if (i == 5 || i == 7 || i == 11) {
                continue;
            }
            System.out.println(i);
        }
//4)
        int j = scanner.nextInt();
        int o = 0;
        for (int z = 0; z < j; z++) {
            if (j % 2 == 1) {
                o += o * z + 1;
            } else {
                o += o * z;
                j /= 10;
            }
            System.out.println(o);
        }
//5)
        int a = scanner.nextInt();
        String l = " ";
        for (int i = 0; i < a; a /= 2) {
            if (a % 2 == 1) {
                l += "1";
            } else {
                l += "0";
            }


        }
        System.out.println(l);

//6)

        Random random = new Random();
        int x = random.nextInt(100) + 1;
        int h = scanner.nextInt();
        while (h!=x) {
            if (h == x) {
                System.out.println("tqven gamoicanit");
                break;}
            else if (h > x) {
                System.out.println("metia");
                continue;

                }

            else if (h < x) {
                System.out.println("naklebia");
                continue;



            }

        }
    }
}




