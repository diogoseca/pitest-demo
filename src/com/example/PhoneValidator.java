package com.example;


public class PhoneValidator {
  
  public boolean validNumber(int number) {
	  // checks if number has 9 digits
	  int minNumber = 100000000;
	  int maxNumber = 999999999;
	  
	  if ((number < minNumber) || (number > maxNumber))
		  return false;
	  else
		  return true;
  }
  
  public boolean validNetworkPrefix(int prefix) {
	  // checks if network prefix is a two digit number
	  return prefix >= 10 && prefix <= 99;
  }
  
  public String numberBelongsToNetwork(int number, int networkPrefix) {
	  
    // validate number
	if (!validNumber(number))
    	return "Invalid amount of digits in number";
	
    // validate network_prefix    	
    if (!validNetworkPrefix(networkPrefix))
    	return "Invalid amount of digits in network prefix";
    
    // compare first two digits
    int firstTwoDigits = number / 10000000;
    if (firstTwoDigits == networkPrefix)
    	return "The number belongs to the network";
    else
    	return "The number does not belong to the network";
  }
  
}
