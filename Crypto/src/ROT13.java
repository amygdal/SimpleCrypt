package src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    public static void main(String[] args) {
        System.out.println("0384");
    }

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
//        int charIndex = 0;

//       char[] charArray = s.toCharArray();
//       for(int x = 0; x < charArray.length; x++){
//           if (charArray[x] == c){
//               charIndex = x;
//           }
//       }
        int charIndex = s.indexOf(c);
       String rightHalf = s.substring(charIndex);
       String leftHalf = s.substring(0,charIndex);

        return rightHalf + leftHalf;
    }




}
