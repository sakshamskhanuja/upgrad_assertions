import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void assertEqualsMethod() {
        // The assertEquals assertion verifies that the expected and actual values are equal.
        String expected = "Monty";
        String actual = "Monty";
        assertEquals(expected, actual);

        // It is also possible to specify a message that displays when the assertions fail.
        actual += " Singh";
        // assertEquals(expected, actual, "FAILURE - strings are not equal.");
    }

    @Test
    void assertArrayEqualsMethod() {
        // If we want to assert that two arrays are equal, we can use the assertArrayEquals method.
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();
        assertArrayEquals(expected, actual);

        // If both arrays are null, the assertion will consider them as equal.
        expected = actual = null;
        assertArrayEquals(expected, actual);
    }

    @Test
    void assertNotNullAndAssertNull() {
        // assertNull asserts that the Object is null, and if it isn't null, a message is shown.
        Object car = null;
        assertNull(car, "The car should be null.");

        car = new Object();
        // assertNull(car, "The car should be null.");

        // assertNotNull asserts that the Object is not null, and if it is null, a message is shown.
        assertNotNull(car, "The car shouldn't be null.");

        car = null;
        // assertNotNull(car, "The car shouldn't be null.");
    }

    @Test
    void assertNotSameAndAssertSame() {
        // assertNotSame asserts that two variables don't refer the same object, if they are, a message is displayed.
        Object dog = new Object();
        Object cat = new Object();
        assertNotSame(dog, cat, "Objects should be different.");

        dog = cat;
        // assertNotSame(dog, cat, "Objects should be different.");

        // assertSame asserts that two variables refers the same object, if they are not, a message is displayed.
        assertSame(dog, cat, "Objects should be same.");

        cat = new Object();
        // assertSame(dog, cat, "Objects should be same.");
    }

    @Test
    void assertTrueAndAssertFalse() {
        // If you want to verify that a certain condition is true or false, we can use the assertTrue or assertFalse.
        assertTrue(5 > 4, "5 is greater than 4");

        // assertTrue(false, "Condition should not be false.");

        assertFalse(5 > 6, "5 is not greater than 6");

        // assertFalse(true, "Condition should not be true.");
    }

    @Test
    void assertThatMethod() {
        // The assertThat method checks for Matcher object in the actual value.
        assertThat(Arrays.asList("Java", "Kotlin", "Scala"), hasItems("Java", "Kotlin"));
    }

    @Test
    void assertThrowsMethod() {
        // assertThrows checks whether a particular exception is thrown in a piece of code.
        assertThrows(IllegalArgumentException.class,
                () -> {
                    Main main = new Main();
                    main.methodThrowsIllegalArgumentException();
                });
    }
}