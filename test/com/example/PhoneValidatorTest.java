package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;



public class PhoneValidatorTest {
  private PhoneValidator validator;
  
  @Before
  public void setUp() {
	  validator = new PhoneValidator();
  }
  
  @Test
  public void testValidNumbers() {
	  //TODO: write a test to increase line coverage and mutation coverage
  }
 
  @Test
  public void testValidNetworkPrefixes() {
    assertEquals(validator.validNetworkPrefix(10),true);
    assertEquals(validator.validNetworkPrefix(99),true);
    assertEquals(validator.validNetworkPrefix(10-1),false);
    assertEquals(validator.validNetworkPrefix(99+1),false);
    assertEquals(validator.numberBelongsToNetwork(100000000, 1), 
    		"Invalid amount of digits in network prefix");
  }
  
  @Test
  public void testNumberBelongsNetwork() {
    assertEquals(validator.numberBelongsToNetwork(912345678, 91), 
    		"The number belongs to the network");
    assertEquals(validator.numberBelongsToNetwork(100000000, 10), 
    		"The number belongs to the network");
    assertEquals(validator.numberBelongsToNetwork(999999999, 99), 
    		"The number belongs to the network");
    assertEquals(validator.numberBelongsToNetwork(964643934, 91), 
    		"The number does not belong to the network");
  }
}
