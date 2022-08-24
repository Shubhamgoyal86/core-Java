import java.util.Scanner;

public class SwitchTatemeny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vaar = sc.nextLine();
        switch (vaar){
            case "Sunday":
                System.out.println("रविवार" +
                        "");
                break;
            default:
                System.out.println("fak");
        }

    }
}
