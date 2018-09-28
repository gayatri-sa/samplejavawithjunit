package junitwebapp;

import org.junit.Test;
import org.junit.Assert;
import junitwebapp.App;

public class TestApp2 {
  @Test
  public void testPrintHelloWorld2() {
    Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");
    
  }

}
