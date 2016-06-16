/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.nvi.tckimlik;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bamasyali
 */
public class TCKimlikServiceTest {

    public TCKimlikServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldSuccess() {
        Boolean result = TCKimlikService.validate(19652549102l, "Mustafa Burak", "Amasyalı", 1988);
        assertTrue(result);
    }

    @Test
    public void shouldFail() {
        Boolean result = TCKimlikService.validate(19652549102l, "Mustafa Burak", "Amasyalı", 1989);
        assertFalse(result);
    }
}
