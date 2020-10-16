package com.example;
 
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;



public class RangeValidatorTest {
  private RangeValidator cut;

  @Before
  public void setUp() {
    cut = new RangeValidator();
  }

  @Test
  public void testCut() {
	assertEquals(cut.isValid(1), true);
	assertEquals(cut.isValid(50), true);
	//TODO: writing as less code as possible to increase coverage to 100%  
  }
}