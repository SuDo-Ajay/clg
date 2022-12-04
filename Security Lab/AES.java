import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.*;

public class AES {
  public static void main(String[] args) throws Exception{
    MessageDigest md = MessageDigest.getInstance("SHA1");
    String key = "annaUniversity";
    
    byte[] key_bytes = key.getBytes();
    key_bytes = md.digest(key_bytes);
    key_bytes = Arrays.copyOf(key_bytes, 16);
    SecretKeySpec sk = new SecretKeySpec(key_bytes, "AES");

    Cipher ciph = Cipher.getInstance("AES/ECB/PKCS5Padding");
    ciph.init(Cipher.ENCRYPT_MODE, sk);

    String msg = "www.annauniv.edu";
    System.out.println(Base64.getEncoder().encodeToString(ciph.doFinal(msg.getBytes())));
  }
}
