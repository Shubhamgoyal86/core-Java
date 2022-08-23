public class StringBuffers {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Shubham Goyal");

//        System.out.println(str);
//        System.out.println(str.charAt(5));
//
//        //Set and replace
//        str.setCharAt(1,'p');
//        System.out.println(str);
//
//        //insert
//        str.insert(4,"kgjf");
//        System.out.println(str);
//
//        //delete
//        str.delete(3,8);
//        System.out.println(str);
//
//        //append
//        str.append(" ");
//        str.append('g');
//        str.append('o');
//        str.append('y');
//        str.append('a');
//        str.append('l');
//        System.out.println(str);
//        str.setCharAt(1,'h');
//
//        str.insert(3,'b');
//        System.out.println(str);
//
//        //Find lENGTH
//        System.out.println(str.length());

        //Reverse String
        for (int i = 0; i < str.length()/2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char fronchar = str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt(front, backchar);
            str.setCharAt(back, fronchar);
        }
        System.out.println(str);


    }
    }


