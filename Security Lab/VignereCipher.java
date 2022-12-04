public class VignereCipher {
  
  public static String encode(String text, final String key) {
    StringBuffer key_len = new StringBuffer();
    StringBuilder cipher = new StringBuilder();
    
    char[] charKey = key.toCharArray();
    
    int j=0;
    for(int i=0 ; i < text.length() ; i++) {
      key_len.append(charKey[j]);
      if(j > key.length()) {
        j = 0;
      }
    }
    
    String k = key_len.toString();
    char[] key_final = k.toCharArray();

    for(int i=0 ; i<text.length() ; i++) {
      cipher.append((char)(((text.toCharArray()[i] + key_final[i]) % 26) + 65));
    }
    return cipher.toString();
  }
  
  public static void main(String[] args) {
    String text = "JAVATPOINT";
    String key = "BEST";

    System.out.println(encode(text, key));
  }
}
