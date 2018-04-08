package hello;

/**
 * Created by DW-Home on 2018/4/8.
 */
public class Email {

  private String body;
  private String to;

  public Email() {
  }

  public Email(String body, String to) {
    this.body = body;
    this.to = to;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  @Override
  public String toString() {
    return "Email{" +
        "body='" + body + '\'' +
        ", to='" + to + '\'' +
        '}';
  }
}
