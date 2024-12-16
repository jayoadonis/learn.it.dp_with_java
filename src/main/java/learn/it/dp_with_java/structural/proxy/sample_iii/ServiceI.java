package learn.it.dp_with_java.structural.proxy.sample_iii;

public class ServiceI implements IService {

  private byte varI;
  private float varII;

  public ServiceI() {
    this.varI = 8;
    this.varII = 9.129f;
  }

  @Override
  public void response() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return String.format(
      "%s@%x[varI=%d, varII=%.2f]",
      this.getClass().getCanonicalName(),
      this.hashCode(),
      this.varI, this.varII
    );
  }

  @Override
  public int hashCode() {
    int result = 31;
    result *= this.varI + 7;
    result *= Float.floatToIntBits(this.varII) + 7;

    return result;
  }

  @Override
  public boolean equals( Object obj ) {
    if( this == obj ) return true;
    if( !( obj instanceof ServiceI ) )
      return false;
    final ServiceI OTHER_OBJ = (ServiceI)obj;
    return OTHER_OBJ.varI == this.varI
      && Float.compare( OTHER_OBJ.varII, this.varII ) == 0;
  }

}
