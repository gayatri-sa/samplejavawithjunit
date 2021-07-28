package junitwebapp;

import org.junit.Test;
import org.junit.Assert;
import junitwebapp.App;

public class TestApp1 {
  @Test
  public void testPrintHelloWorld() {
    Assert.assertEquals(App.getHelloWorld(), "Hello World1");
    
  }

}
