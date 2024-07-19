import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=1;
        System.out.print("Üssü alınacak sayı: ");
        a = sc.nextInt();
        System.out.print("Kaçıncı üssü olacak: ");
        b = sc.nextInt();
        for(int i=1;i<=b;i++){
            c = c*a;
        }
        System.out.print("Üslü sayı: "+c);
    }
}