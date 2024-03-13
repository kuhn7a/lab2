package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        String test = "compiille";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("c", "o", "m", "p", "i", "l", "e"));
        ArrayList<String> actual = task3.removeDuplicates(test);

        assertNotNull(actual); // Ensure that the actual output isn't null
        Collections.sort(expected); // Sort the expected and actual lists so results aren't affected
        Collections.sort(actual);
        assertEquals(expected, actual); // Ensure the expected and actual lists match
    }

    @Test
    public void test_removeDuplicates_average(){
        String test = null;
        ArrayList<String> check = task3.removeDuplicates(test);

        assertNotNull(check); // Ensure that the check output for task3 isn't null;
        assertEquals("String should return as empty", new ArrayList<>(), check); // Ensure the list equals the check
    }

    @Test
    public void test_removeDuplicates_worst(){
        String test = "";
        ArrayList<String> check = task3.removeDuplicates(test);

        assertNotNull(check); // Ensure check output isn't null
        assertEquals("String should return as empty", new ArrayList<>(), check); // Ensure the list equals the check
    }

    @Test
    public void test_areTheseAnagrams_best(){
        String test1 = "one";
        String test2 = "eon";
        boolean checkAnagrams = task3.areTheseAnagrams(test1, test2);

        assertTrue("These should be anagrams", checkAnagrams); // Anagrams are True
    }

    @Test
    public void test_areTheseAnagrams_average(){
        String test1 = null;
        String test2 = null;
        boolean checkAnagrams = task3.areTheseAnagrams(test1, test2);

        assertFalse("These should not be anagrams", checkAnagrams); // Anagrams are false (both null)
    }

    @Test
    public void test_areTheseAnagrams_worst(){
        String test1 = "one";
        String test2 = "none";
        boolean checkAnagrams = task3.areTheseAnagrams(test1, test2);

        assertFalse("These should not be anagrams", checkAnagrams); // Anagrams are false
    }

}
