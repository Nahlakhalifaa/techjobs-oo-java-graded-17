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
        Job job1 = new Job("Data analyst", new Employer("Antic"), new Location("NY"), new PositionType("Full-time"), new CoreCompetency("Java"));
        Job job2 = new Job("Data analyst", new Employer("Antic"), new Location("NY"), new PositionType("Full-time"), new CoreCompetency("Java"));
        assertFalse(job1.equals(job2));
    }
}



