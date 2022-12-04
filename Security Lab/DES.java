import java.security.*;
import javax.crypto.*;
import javax.crypto.Cipher;

public class DES {
  public static void main(String[] args) {

    try {
      KeyGenerator keygen = KeyGenerator.getInstance("DES");
      SecretKey key = keygen.generateKey();

      Cipher ciph;
      ciph = Cipher.getInstance("DES/ECB/PKCS5Padding");
      ciph.init(Cipher.ENCRYPT_MODE, key);
      
      byte[] msg = "message".getBytes();
      System.out.println(new String(msg));
      byte[] encrypted = ciph.doFinal(msg);
      System.out.println(encrypted);
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}
