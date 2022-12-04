public class CaesarCipher {
  public static String encode(String msg, int offset) {

    offset = offset % 26 + 26;
    StringBuilder enc = new StringBuilder();

    for(char i : msg.toCharArray()) {
      if(Character.isLetter(i)) {
        if(Character.isUpperCase(i)) {
          enc.append((char)('A' + (i - 'A' + offset) % 26));
        }
        else {
          enc.append((char)('a' + (i - 'a' + offset) % 26));
        }
      }
      else {
        enc.append(i);
      }
    }
    return enc.toString();
  }

  public static String decode(String cipher, int offset) {
    return encode(cipher, 26 - offset);
  }

  public static void main(String[] args) throws Exception {

    String msg = "Ajay Kannan";
    System.out.println("Message : " + msg);
    System.out.println("Cipher : " + CaesarCipher.encode(msg,3));
    System.out.println("Decryption : " + CaesarCipher.decode(encode(msg, 3),3));
  }
}
