package test.java.com.codewars.sixth;
import main.java.com.codewars.sixth.SimpleEncryptionAlternatingString;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleEncryptionAlternatingStringTest {
    SimpleEncryptionAlternatingString kata = new SimpleEncryptionAlternatingString();
    @Test
    public void testEncrypt() {
            // assertEquals("expected", "actual");
            assertEquals("This is a test!", kata.encrypt("This is a test!", 0));
            assertEquals("hsi  etTi sats!", kata.encrypt("This is a test!", 1));
            assertEquals("s eT ashi tist!", kata.encrypt("This is a test!", 2));
            assertEquals(" Tah itse sits!", kata.encrypt("This is a test!", 3));
            assertEquals("This is a test!", kata.encrypt("This is a test!", 4));
            assertEquals("This is a test!", kata.encrypt("This is a test!", -1));
            assertEquals("hskt svr neetn!Ti aai eyitrsig", kata.encrypt("This kata is very interesting!", 1));
        }

        @Test
        public void testDecrypt() {
            // assertEquals("expected", "actual");
            assertEquals("This is a test!", kata.decrypt("This is a test!", 0));
            assertEquals("This is a test!", kata.decrypt("hsi  etTi sats!", 1));
            assertEquals("This is a test!", kata.decrypt("s eT ashi tist!", 2));
            assertEquals("This is a test!", kata.decrypt(" Tah itse sits!", 3));
            assertEquals("This is a test!", kata.decrypt("This is a test!", 4));
            assertEquals("This is a test!", kata.decrypt("This is a test!", -1));
        }

        @Test
        public void betterDecryptTest(){
            assertEquals("This kata is very interesting!", kata.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));

        }

        @Test
        public void testNullOrEmpty() {
            // assertEquals("expected", "actual");
            assertEquals("", kata.encrypt("", 0));
            assertEquals("", kata.decrypt("", 0));
            assertEquals(null, kata.encrypt(null, 0));
            assertEquals(null, kata.decrypt(null, 0));
        }

    }