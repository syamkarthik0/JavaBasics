import java.util.Scanner;
public class Car {
    public void Horn() {
        System.out.println("Beep");
    }
    public void Regno() {
        String regNo="AZXD46";
        System.out.println("Reg number: "+regNo);
    }
    public void Noplate() {
        Scanner sc = new Scanner(System.in);
        int noPlate=sc.nextInt();
        System.out.println("car no: " +noPlate);
    }
}
