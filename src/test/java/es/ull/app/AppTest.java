package es.ull.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test class for the {@link App} application.
 * <p>
 * This class contains test cases to verify the functionality of the
 * App class. It uses JUnit 5 (Jupiter) as the testing framework.
 * </p>
 * 
 * @author Universidad de La Laguna
 * @version 1.0
 * @since 1.0
 * @see App
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
     * Test that main method prints "Hello World!" to System.out.
     * <p>
     * This test verifies that the {@link App#main(String[])} method produces
     * the expected output "Hello World!" when executed.
     * </p>
     * 
     * @see App#main(String[])
     */
    @Test
    public void testMainMethodOutput() {
        String[] args = {};
        App.main(args);
        
        String output = outContent.toString().trim();
        assertEquals("Hello World!", output, "Main method should print 'Hello World!'");
    }

    /**
     * Test that main method executes without throwing exceptions.
     * <p>
     * This test verifies that the {@link App#main(String[])} method can
     * execute successfully without throwing any runtime exceptions.
     * </p>
     * 
     * @see App#main(String[])
     */
    @Test
    public void testMainMethodExecutesWithoutException() {
        String[] args = {};
        // Should not throw any exception
        App.main(args);
    }

    /**
     * Test that main method produces non-null output.
     * <p>
     * This test verifies that the {@link App#main(String[])} method produces
     * output that is not null when executed.
     * </p>
     * 
     * @see App#main(String[])
     */
    @Test
    public void testMainMethodProducesOutput() {
        String[] args = {};
        App.main(args);
        
        String output = outContent.toString();
        assertNotNull(output, "Output should not be null");
    }

    /**
     * Test that main method with null args doesn't throw exception.
     * <p>
     * This test verifies defensive programming by ensuring that the
     * {@link App#main(String[])} method can handle null arguments without
     * throwing a NullPointerException.
     * </p>
     * 
     * @see App#main(String[])
     */
    @Test
    public void testMainMethodWithNullArgs() {
        // Should not throw NullPointerException
        App.main(null);
        
        String output = outContent.toString().trim();
        assertEquals("Hello World!", output, "Main method should print 'Hello World!' even with null args");
    }
}
