import java.security.*;
import java.util.*;

public class DigitalSignatureStandard {
    public static void main(String[] args) throws Exception {
      
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a message");
    String msg = sc.nextLine();

    KeyPairGenerator keygen = KeyPairGenerator.getInstance("DSA");
    keygen.initialize(2048);
    
    KeyPair kp = keygen.generateKeyPair();
    PrivateKey priv = kp.getPrivate();

    Signature sign = Signature.getInstance("SHA256withDSA");
    sign.initSign(priv);

    byte[] bytes = "msg".getBytes();

    sign.update(bytes);

    byte[] signature = sign.sign();

    System.out.println("Digital Signature for message:" + new String(signature,"UTF8"));
      }
  }
