package hello;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by DW-Home on 2018/4/8.
 */
@Component
public class Receiver {

  @JmsListener(destination = "mailbox", containerFactory = "myFactory")
  public void receiveMessage(Email email) {
    System.out.println("received email: {" + email + "}");
  }

}
