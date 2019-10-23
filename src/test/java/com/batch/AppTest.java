package com.batch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
    public void testAWSBatch() {
		AwsBatch batch = new AwsBatch();
		assertEquals("sushant", batch.getMessage());
    }
}
