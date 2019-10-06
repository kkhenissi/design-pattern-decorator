package decorateurs;

import boissons.Boisson;

public abstract class AbstractDecorator  extends Boisson{
  public Boisson boisson;

    public AbstractDecorator(Boisson boisson) {
        super();
        this.boisson = boisson;
    }

    public  abstract  String getDescription();
}
