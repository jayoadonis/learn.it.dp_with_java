package learn.it.dp_with_java.structural.proxy.sample_ii;

public class SimpleInternet implements IInternet {

  @Override
  public String connect( String url ) {
    //REM: TODO, canonical logic
    return url;
  }

  @Override
  public final int getCacheSize() {
    return 1; //REM: [TODO] .|. Hmmm...
  }
}
