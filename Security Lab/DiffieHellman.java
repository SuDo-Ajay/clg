public class DiffieHellman {
  public static void main(String[] args) {
    
    int p = 23;
    int g = 5;
    int alice = 3;
    int bob = 4;

    double aliceSends = (Math.pow(g,alice)%p);
    double BobCompute = (Math.pow(aliceSends,bob)%p);
    double BobSends = (Math.pow(g,bob)%p);
    double aliceCompute = (Math.pow(BobSends,alice)%p);
    double sharedSecret = (Math.pow(g,(alice*bob))%p);

    if(aliceCompute == sharedSecret && aliceCompute == BobCompute) {
      System.out.println("Accepted Shared Key" + sharedSecret);
    }
  }
}
