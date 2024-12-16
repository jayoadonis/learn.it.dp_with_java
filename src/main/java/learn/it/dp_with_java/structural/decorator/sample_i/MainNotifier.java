package learn.it.dp_with_java.structural.decorator.sample_i;

public class MainNotifier implements INotifier {

  protected String senderId;

  public MainNotifier( String senderId ) {
    this.senderId = senderId;
  }

  @Override
  public void send(String msg) {
    System.out.printf(
      "%s, %s\n",
      this.getSenderId(), msg
    );
  }

  @Override
  public String getSenderId() {
    return "main~" + this.senderId;
  }

}
