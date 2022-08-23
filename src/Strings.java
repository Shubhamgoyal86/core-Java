import java.util.*;
public class Strings {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Your Name is :" + name);


       //Concatenation
//        String a = "Shubham";
//        String b = "Goyal";
//        String c = a + " " + b;
//        System.out.println(c.length());
//
//        //Printing Character char at
//        for (int i = 0 ; i<c.length();i++){
//            System.out.println(c.charAt(i) + " ");
//        }
//        System.out.println();
        //COmparing Two Strings

//        String name1 = "Shubham";
//        String name2 = "Shubham";
//
//        if (name1.compareTo(name2)>0){
//            System.out.println("shubham is greater");
//        } else if (name1.compareTo(name2)==0) {
//            System.out.println("shubham is equal");
//
//        }else {
//            System.out.println("shubham is lesser");
//        }
//
        String name = "My Self Shubham Goyal And My Friend Name is Ankit";
        System.out.println(name.indexOf("Shubham"));

        System.out.println(name.substring(8 ,16));

    }
}
