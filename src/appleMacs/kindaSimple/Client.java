package appleMacs.kindaSimple;

import appleMacs.beforeImplementation.model.Macbook;
import appleMacs.kindaSimple.factory.MacAirFactory;
import appleMacs.kindaSimple.factory.MacProFactory;
import appleMacs.kindaSimple.factory.MacbookFactory;

public class Client {
    public static void main(String[] args) {
        MacbookFactory levelAirFactory = new MacAirFactory();
        MacbookFactory levelProFactory = new MacProFactory();

        System.out.println("==Ordering an MacPro");
        Macbook notebook = levelProFactory.orderMacbook("high");
        System.out.println(notebook);

        System.out.println("==Ordering an MacAir");
        Macbook notebook2 = levelAirFactory.orderMacbook("standard");
        System.out.println(notebook);

    }
}
