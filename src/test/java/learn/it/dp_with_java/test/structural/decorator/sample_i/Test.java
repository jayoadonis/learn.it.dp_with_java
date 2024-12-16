package learn.it.dp_with_java.test.structural.decorator.sample_i;

import learn.it.dp_with_java.structural.decorator.sample_i.*;
import org.junit.jupiter.api.Assertions;

public class Test {

  @org.junit.jupiter.api.Test
  public void TestInit() {
    INotifier notifyIt = new EMailNotifier(
      new SMSNotifier(
        new MainNotifier( "12321" )
      )
    );

    notifyIt.send("the message");

    System.out.println("<><> " + (notifyIt.getSenderId()));

    Assertions.assertEquals("email~sms~main~12321", notifyIt.getSenderId());
  }

  @org.junit.jupiter.api.Test
  public void TestPartialSetup() {

    INotifier notifyIt = new EMailNotifier(
      new MainNotifier( "12321" )
    );

    notifyIt.send("the Partial setup msg I");

    INotifier notifyItII = new MainNotifier( "12321" );

    notifyItII.send("the Partial setup msg II");

  }
}
