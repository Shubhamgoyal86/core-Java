package com.InnerClass.aanonymous;


class Popcorn {
    public void taste(){
        System.out.println("Salty");
    }
    public void price (){
        System.out.println("500 rs");
    }
}

public class annonymousinnerclass {
    public static void main(String[] args) {
        Popcorn p = new Popcorn(){
            public void taste()
            {
                System.out.println("spicy"); // overriding taste method

            }

        };

        p.taste();
        p.price();

        Popcorn p1 = new Popcorn();
        p1.taste();

        Popcorn p2 = new Popcorn(){
            public void price(){
                System.out.println("40rs");
            }
        };
        p2.price();
    }
}




