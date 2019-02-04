package share.codes.railFenceCipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RailCipherTest {
        private RailCipher railCipher = new RailCipher();
//    RailFenceCipher railFenceCipher = new RailFenceCipher();

    @Test
    void encode() {
        Character[][] result = railCipher.encode("HOSAMDIBAPAULIUS",3);
//        Character[][] result = railFenceCipher.encode("123456789",3);
    }
}