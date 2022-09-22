package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        Assert.assertNotEquals(job1,job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertTrue(testJob.getName().toString() instanceof  String);
        Assert.assertEquals(testJob.getEmployer().getValue(),"ACME");
        Assert.assertEquals(testJob.getLocation().getValue(),"Desert");
        Assert.assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");
        Assert.assertEquals(testJob.getPositionType().getValue(),"Quality control");
        Assert.assertEquals(testJob.getName().toString(),"Product tester");
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job();
        Assert.assertEquals(testJob.toString().charAt(0),'\n');
        int length = testJob.toString().length() - 1;
        Assert.assertEquals(testJob.toString().charAt(length), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Assert.assertEquals("\nID: 1\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n",testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job();
        Assert.assertEquals("OOPS! This job does not seem to exist.",testJob.toString());

        Job testJob2 = new Job("Product tester", new Employer(), new Location(), new PositionType(), new CoreCompetency());
      Assert.assertEquals("\nID: 2\nName: Product tester\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available\n",testJob2.toString());
    }
}
