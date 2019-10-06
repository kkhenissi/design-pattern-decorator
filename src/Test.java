import boissons.Boisson;
import boissons.Sumatra;
import decorateurs.Chocolat;

public class Test {

    public static void main(String[] args) {
        Boisson b=new Espresso();
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        Boisson s = new Sumatra();
        System.out.println("----------------------------");
        System.out.println(s.getDescription());
        System.out.println(s.cout());
        System.out.println("---------**********************************-------------------");
        s = new Chocolat(new Chocolat(new Chocolat(s)));
        System.out.println(s.getDescription());
        System.out.println(s.cout());

    }
}
