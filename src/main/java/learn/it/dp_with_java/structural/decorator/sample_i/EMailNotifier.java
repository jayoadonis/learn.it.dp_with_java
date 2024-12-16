package learn.it.dp_with_java.structural.decorator.sample_i;

public class EMailNotifier extends SubNotifier {

  public EMailNotifier( INotifier notifier ) {
    super(notifier);
  }

  @Override
  public void send(String msg) {
    super.send(msg);
    System.out.printf(
      "%s, %s\n",
      this.getSenderId(), msg
    );
  }
  @Override
  public String getSenderId() {
    return "email~" + super.notifier.getSenderId();
  }
}