import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SillyTest {
        @Test
        public void SillyTest24(){
            Silly sillyTest = new Silly();
            boolean result = sillyTest.guessGame(24);
            Assertions.assertTrue(result);
        }


        @Test
        public void SillyTest28(){
            Silly sillyTest = new Silly();
            boolean result = sillyTest.guessGame(28);
            Assertions.assertFalse(result);
        }


        @Test
        public void SillyTest42(){
            Silly sillyTest = new Silly();
            boolean result = sillyTest.guessGame(42);
            Assertions.assertFalse(result);
        }

}