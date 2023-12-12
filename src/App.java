import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Complexe x = new Complexe(1, 2);
        Complexe y = new Complexe(3, -4);
        Complexe z = new Complexe();
        Complexe t = new Complexe(y);
        Complexe u = x.additionnerA(y);

        Complexe[] tab = {x,y,z,t,u}; 
        Complexe add = new Complexe();
        for(int i = 0; i < tab.length; i++) {
            add = add.additionnerA(tab[i]);
        }
        System.out.println(add.toString());


        ArrayList<Complexe> tab2 = new ArrayList<Complexe>();
        tab2.add(x);
        tab2.add(y);
        tab2.add(z);
        tab2.add(t);
        tab2.add(u);

        Complexe add2 = new Complexe();
        for(int i = 0; i < tab2.size(); i++) {
            add2 = add2.additionnerA(tab2.get(i));
        }
        System.out.println(add2.toString());

        System.out.println(x.toString()+"\n"+y.toString()+"\n"+z.toString()+"\n"+t.toString());
        System.out.println(x.additionnerA(y).toString()+"\n"+x.retrancher(y).toString());
    }
}
