package com.TestNG;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zoopla.Zooplaclass;



public class TestNG extends Zooplaclass { 
TestNG test;
 


@BeforeTest
 public void runsetup() {
	 
	test= new TestNG();
	 test.openbrowser();
	 test.maximizeBrowser();
	 test.getUrl();
	 test.closecookies();
	 }

@Test
public void getTrip() throws InterruptedException {
	Thread.sleep(1000);
	
	test.getsingin();
Thread.sleep(1000);	
   test.getsearch();
Thread.sleep(1000); 
   test.closepopup();
  test.getprice();
	test.selectfifthproperty();
	
Thread.sleep(1000);	
	test.verifylogo();
    test.verifyagentname();
    test.verifyphonenumber();
 Thread.sleep(1000);  
    test.getsignout();
}



	
	
	
}




















