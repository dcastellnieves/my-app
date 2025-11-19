package es.ull.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    /**
     * Test that main method prints "Hello World!" to System.out
     */
    @Test
    public void testMainMethodOutput() {
        String[] args = {};
        App.main(args);
        
        String output = outContent.toString().trim();
        assertEquals("Hello World!", output, "Main method should print 'Hello World!'");
    }

    /**
     * Test that main method executes without throwing exceptions
     */
    @Test
    public void testMainMethodExecutesWithoutException() {
        String[] args = {};
        // Should not throw any exception
        App.main(args);
    }

    /**
     * Test that main method produces non-null output
     */
    @Test
    public void testMainMethodProducesOutput() {
        String[] args = {};
        App.main(args);
        
        String output = outContent.toString();
        assertNotNull(output, "Output should not be null");
    }

    /**
     * Test that main method with null args doesn't throw exception
     * (tests defensive programming)
     */
    @Test
    public void testMainMethodWithNullArgs() {
        // Should not throw NullPointerException
        App.main(null);
        
        String output = outContent.toString().trim();
        assertEquals("Hello World!", output, "Main method should print 'Hello World!' even with null args");
    }
}
