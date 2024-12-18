package learn.it.dp_with_java.structural.bridge.sample_i;

public sealed interface IService permits ServiceI, ServiceII {

  public static enum Type {
    SERVICE_I((byte)2, "<description>"),
    SERVICE_II((byte)4, "<description>");

    public final byte CODE;
    public final String DESCRIPTION;

    private Type( byte code, String description ) {
      this.CODE = code;
      this.DESCRIPTION = description;
    }
  }

  public abstract String connect(String uri);

}