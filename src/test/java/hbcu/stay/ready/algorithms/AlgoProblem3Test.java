package hbcu.stay.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class AlgoProblem3Test {

    @Test
    public void testOne(){
        AlgoProblem3 algoProblem3 = new AlgoProblem3();

        String expected = "1\n2\nCode\n4\nDiff\n";
        String actual = algoProblem3.codeDiffForever(5);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem3 algoProblem3 = new AlgoProblem3();

        String expected = "1\n2\nCode\n4\nDiff\nCode\n7\n8\nCode\nDiff\n";
        String actual = algoProblem3.codeDiffForever(10);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem3 algoProblem3 = new AlgoProblem3();

        String expected = "1\n2\nCode\n4\nDiff\nCode\n7\n8\nCode\nDiff\n11\nCode\n13\n14\nCodeDiffForever\n16\n17\nCode\n19\nDiff\nCode\n22\n23\nCode\nDiff\n26\nCode\n28\n29\nCodeDiffForever\n31\n32\nCode\n34\nDiff\nCode\n37\n38\nCode\nDiff\n";
        String actual = algoProblem3.codeDiffForever(40);

        Assert.assertEquals(expected,actual);
    }



}
