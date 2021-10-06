package Queue;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleQueueTest {

    SimpleQueue queue= new SimpleQueue(5);
    private final PrintStream out = System.out;
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @BeforeEach
    public void  set(){
        System.setOut(new PrintStream(outStream));
    }

    @Test
    void testEnqueueShouldNotPrintErrorWhenQueueIsEmpty() {

        queue.enqueue(10);
        assertEquals(outStream.toString(),"");
    }


    @Test
    void testEnqueueShouldPrintErrorWhenQueueIsFull() {

        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        assertEquals("Queue is full",outStream.toString().trim());
    }
}