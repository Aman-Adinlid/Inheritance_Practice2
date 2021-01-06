package Lexicon.se.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class SystemDeveloperTest {

    private SystemDeveloper testObject;

    @Before

    public void setup(){

        testObject = new SystemDeveloper();
        testObject.setName("test");
        testObject.addLanguage("java");
        testObject.addCertificate("Abc");
        testObject.setDateHired(LocalDate.parse("2018-02-01"));
        testObject.calculateSalary();
    }
    @Test

        public void Test_Name(){

        String expectedName = "test";
        String actualName = testObject.getName();
        assertEquals(expectedName,actualName);
    }
    @Test
    public void test_calculateSalary(){

        double expectedSalary = 31000.0;
        double actualSalary = testObject.getSalary();
        assertEquals(expectedSalary,actualSalary,0);

    }

    @Test

    public void test_addCert(){


    }

}
