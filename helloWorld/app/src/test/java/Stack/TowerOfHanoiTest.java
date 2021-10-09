package Stack;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import Queue.SimpleQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiTest {

    private final PrintStream out = System.out;
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @BeforeEach
    public void  set(){
        System.setOut(new PrintStream(outStream));
    }

    @Test
    void testTowerOfHanoiShouldPrint() {
        TowerOfHanoi t=new TowerOfHanoi();
        t.towerOfHanoi(3,1,2,3);
        assertNotEquals(outStream.toString(),"");
    }
}