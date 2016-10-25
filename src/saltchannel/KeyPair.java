package saltchannel;

import saltchannel.util.Hex;

/**
 * Simple key pair class. Stores two byte array keys of any size.
 * 
 * @author Frans Lundberg
 */
public class KeyPair {
    private final byte[] sec;
    private final byte[] pub;

    /**
     * Creates a new key pair.
     * 
     * @param sec  Secret key.
     * @param pub  Public key.
     */
    public KeyPair(byte[] sec, byte[] pub) {
        if (sec == null) throw new IllegalArgumentException("sec == null not allowed");
        if (pub == null) throw new IllegalArgumentException("pub == null not allowed");
        
        this.sec = sec;
        this.pub = pub;
    }
    
    /**
     * Creates and returns a KeyPair from two hex strings.
     * 
     * @param sec  Hex string of secret key.
     * @param pub  Hex string of public key.
     */
    public static KeyPair fromHex(String sec, String pub) {
        return new KeyPair(Hex.toBytes(sec), Hex.toBytes(pub));
    }
    
    public byte[] pub() {
        return pub;
    }
    
    public byte[] sec() {
        return sec;
    }
    
    public String toString() {
        return "sec:xx, pub:" + Hex.create(pub);
    }
}
