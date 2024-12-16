package learn.it.dp_with_java.structural.decorator.sample_i;

public interface INotifier {

  public abstract void send(String msg);
  public abstract String getSenderId();
}
