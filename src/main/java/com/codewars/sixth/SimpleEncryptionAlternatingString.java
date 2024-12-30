package main.java.com.codewars.sixth;

public class SimpleEncryptionAlternatingString {
    /*
    Implement a pseudo-encryption algorithm which given a string S and an integer N
    concatenates all the odd-indexed characters of S with all the even-indexed characters of S,
    this process should be repeated N times.
     */

    public static String encrypt(final String text, final int n) {
        if(text == null || text.isEmpty() || n<=0){
            return text;
        }
        if(text.isEmpty()){
            return "";
        }
        if(n==0){
            return text;
        }
        String encryptionString = text;
        String odd = "", even = "";
        for(int i = 0; i<n;i++){
            even = ""; odd = "";
            for (int x = 0; x<encryptionString.length();x++){
                if(x%2==0){
                    even = even.concat(String.valueOf(encryptionString.charAt(x)));
                }
                else{
                    odd = odd.concat(String.valueOf(encryptionString.charAt(x)));
                }
            }
            encryptionString = odd.concat(even);
        }
        return encryptionString;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if(encryptedText==null || encryptedText.isEmpty()||n<=0){
            return encryptedText;
        }

        int oddCount = encryptedText.length()/2;
        Boolean oddNum = false;

        if(encryptedText.length()%2!=0){
            oddNum = true;
        }

        String evenString = encryptedText.substring(0,oddCount);
        String oddString = encryptedText.substring(oddCount,encryptedText.length());
        String encryptionString = "";

        for(int i = 0; i < n; i++) {
            encryptionString="";
            for (int x = 0; x <= encryptedText.length()/2; x++) {
                if(x != encryptedText.length()/2||oddNum){
                encryptionString = encryptionString.concat(String.valueOf(oddString.charAt(x)));}
                if( x != encryptedText.length()/2){
                    encryptionString = encryptionString.concat(String.valueOf(evenString.charAt(x)));
                }
            }
            evenString = encryptionString.substring(0,oddCount);
            oddString = encryptionString.substring(oddCount,encryptedText.length());
        }
        return encryptionString;
    }

}
