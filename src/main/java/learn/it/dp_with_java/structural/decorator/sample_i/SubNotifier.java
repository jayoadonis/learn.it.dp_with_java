package learn.it.dp_with_java.structural.decorator.sample_i;

public abstract class SubNotifier implements INotifier {

  protected INotifier notifier;

  public SubNotifier( INotifier notifier ) {
    this.notifier = notifier;
  }

  @Override
  public void send( String msg ) {
    this.notifier.send(msg);
  }

  @Override
  public String getSenderId() {
    return this.notifier.getSenderId();
  }
}
