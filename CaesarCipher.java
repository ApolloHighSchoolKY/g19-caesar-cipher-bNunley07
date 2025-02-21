/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet;
	private char[] shifted;
	private int shift;

    public CaesarCipher() {
            alphabet[0] = 'A';
            alphabet[1] = 'B';
            alphabet[2] = 'C';
            alphabet[3] = 'D';
            alphabet[4] = 'E';
            alphabet[5] = 'F';
            alphabet[6] = 'G';
            alphabet[7] = 'H';
            alphabet[8] = 'I';
            alphabet[9] = 'J';
            alphabet[10] = 'K';
            alphabet[11] = 'L';
            alphabet[12] = 'M';
            alphabet[13] = 'N';
            alphabet[14] = 'O';
            alphabet[15] = 'P';
            alphabet[16] = 'Q';
            alphabet[17] = 'R';
            alphabet[18] = 'S';
            alphabet[19] = 'T';
            alphabet[20] = 'U';
            alphabet[21] = 'V';
            alphabet[22] = 'W';
            alphabet[23] = 'X';
            alphabet[24] = 'Y';
            alphabet[25] = 'Z';
    }

    public CaesarCipher(int num){
           alphabet = new char[26];
           shifted = new char[26];
           for(int i =0; i<alphabet.length;i++){
            if(shifted[i] + num %26 == shifted[i])
            shifted[i] = alphabet[i+num];

            shifted[i] = alphabet[shifted[i]+num % 26];
           }
    }

    public String encrypt(String message){
        int sum = 0;
        String encrypted = "";
        boolean start = false;
        for(int i = 0; i<message.length();i++){
            for(int x = 0;x<alphabet.length;x++){
                if(alphabet[x] == message.charAt(i)){
                    encrypted += shifted[x];
                }
                if(message.charAt(i) != alphabet[x]){
                    for(int y =0; y < alphabet.length;y++){
                        sum ++;
                        if(sum>= 26){
                            start = true;
                            if(start == true){
                                encrypted += message.charAt(i);
                                sum = 0;
                            }

                        }

                    }

                }

            }


        }
        return "";
    }

    public String decrypt(String message){
        int sum = 0;
        String decrypted = "";
        boolean start = false;
        for(int i = 0; i<message.length();i++){
            for(int x = 0;x<alphabet.length;x++){
                if(alphabet[x] == message.charAt(i)){
                    decrypted crypted += shifted[x];
                }
                if(message.charAt(i) != alphabet[x]){
                    for(int y =0; y < alphabet.length;y++){
                        sum ++;
                        if(sum>= 26){
                            start = true;
                            if(start == true){
                                decrypted += message.charAt(i);
                                sum = 0;
                            }

                        }

                    }

                }

            }


        }
    }

    public void shifter(int num){
        char [] after = new char[alphabet.length];
    for(int i= 0; i<alphabet.length;i++)
    {
       after[i] = alphabet[i + num % 26];


    }
    }


}