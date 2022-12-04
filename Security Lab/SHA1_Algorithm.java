import java.security.*;

public class SHA1_Algorithm {
  public static void main(String[] args) {

    try {
      MessageDigest md = MessageDigest.getInstance("SHA1");
      System.out.println(md.getAlgorithm());
      
      String input = "ajay";
      md.update(input.getBytes());
      byte[] output = md.digest();
            
      char HexDigit[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
      
      StringBuffer buf = new StringBuffer();

      for(byte aB : output) {
        buf.append(HexDigit[(aB >> 4) & 0x0f]);
        buf.append(HexDigit[aB & 0x0f]);
      }
      System.out.println(buf.toString());
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}


