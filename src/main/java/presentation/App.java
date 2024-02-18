package presentation;

import extension.DaoImplV2;
import metier.MetierImpl;

public class App {
    public static void main(String[] args) {
        //DaoImpl d=new DaoImpl();
        DaoImplV2 d=new DaoImplV2();
        MetierImpl metier=new MetierImpl(d);// injection via le constructeur
        //metier.setDao(d);//injection via le setter
        System.out.println("RES="+metier.calcul());
    }
}
