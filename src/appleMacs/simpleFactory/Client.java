package appleMacs.simpleFactory;

import appleMacs.beforeImplementation.model.Macbook;
import appleMacs.kindaSimple.factory.MacAirFactory;
import appleMacs.kindaSimple.factory.MacProFactory;
import appleMacs.kindaSimple.factory.MacbookFactory;
import appleMacs.simpleFactory.factory.MacbookSimpleFactory;

public class Client {

    public static void main(String[] args) {

        System.out.println("==Ordering an MacPro");
        Macbook notebook = MacbookSimpleFactory.orderNotebook("pro", "high");
        System.out.println(notebook);

        System.out.println("==Ordering an MacAir");
        Macbook notebook2 = MacbookSimpleFactory.orderNotebook("air", "standard");
        System.out.println(notebook2);

    }
}
