package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job test_Job1 = new Job();
        Job test_Job2 = new Job();
        assertNotEquals(test_Job1.getId(), test_Job2.getId());
        ;
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType("Full-time"), new CoreCompetency("Java"));
        Job job2 = new Job("Data analyst", new Employer("Antic"), new Location("NY"), new PositionType("Full-time"), new CoreCompetency("Java"));
        assertFalse(job1.equals(job2));


    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job("Data analyst", new Employer("Antic"), new Location("NY"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: Data analyst" + System.lineSeparator() + "Employer: Antic" + System.lineSeparator() + "Location: NY" + System.lineSeparator() + "Position Type: Full-time" + System.lineSeparator() + "Core Competency: Java" + System.lineSeparator();
        assertEquals(expected, job.toString());

    }

    @Test
    public void testToStringContainsBlankLinesAndFieldLabelsWithData() {
        Job job = new Job("Data analyst", new Employer("Antic"), new Location("NY"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() + "Name: Data analyst" + System.lineSeparator() + "Employer: Antic" + System.lineSeparator() + "Location: NY" + System.lineSeparator() + "Position Type: Full-time" + System.lineSeparator() + "Core Competency: Java" + System.lineSeparator();
        assertEquals(expected, job.toString());
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Data analyst", new Employer("Antic"), new Location("NY"), new PositionType("Full-time"), new CoreCompetency("Java"));
        String expected= System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Data analyst" + System.lineSeparator() +
                "Employer: Antic" + System.lineSeparator() +
                "Location: NY" + System.lineSeparator() +
                "Position Type: Full-time" + System.lineSeparator() +
                "Core Competency: Java" + System.lineSeparator();

        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("Google"), new Location("ST.LOUIS"), new PositionType(""), new CoreCompetency("React"));
        String expected = System.lineSeparator() +
                "ID: " + job.getId() +System.lineSeparator() +
                "Name: Data not available"+System.lineSeparator() +
                "Employer: Google"+System.lineSeparator() +
                "Location: ST.LOUIS"+System.lineSeparator() +
                "Position Type: Data not available"+System.lineSeparator() +
                "Core Competency: React"+ System.lineSeparator();
        assertEquals(expected, job.toString());
    }
}




