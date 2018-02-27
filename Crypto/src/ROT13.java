package src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    private String myCipher;
    private String myAlphabet;

    public static void main(String[] args) {

        System.out.println("0384");
    }

    ROT13(Character cs, Character cf) {
        myAlphabet = "abcdefghijklmnopqrstuvwxyz";
        myCipher = rotate(myAlphabet,cf);
        myAlphabet += myAlphabet.toUpperCase();
        myCipher += myCipher.toUpperCase();

    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return encrypt(decrypt(text));
    }

    public String encrypt(String text) {

        String encyrptedMessage = "";

        for (int i = 0; i < text.length(); i++){
            char charToRotate = text.charAt(i);
            int indexOfCurrentStringLetter  = myAlphabet.indexOf(charToRotate);
            if (indexOfCurrentStringLetter == -1){
                encyrptedMessage+=charToRotate;
            } else {
                encyrptedMessage += Character.toString(myCipher.charAt(indexOfCurrentStringLetter));
            }

        }

        return encyrptedMessage;
    }

    public String decrypt(String text) {

        String decryptedMessage = "";

        for (int i = 0; i < text.length(); i++){
            char charToRotate = text.charAt(i);
            int indexOfCurrentStringLetter  = myCipher.indexOf(charToRotate);
            if (indexOfCurrentStringLetter == -1){
                decryptedMessage+=charToRotate;
            } else {
                decryptedMessage += Character.toString(myAlphabet.charAt(indexOfCurrentStringLetter));
            }


        }

        return decryptedMessage;
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
