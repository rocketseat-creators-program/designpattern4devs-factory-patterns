package appleMacs.simpleFactory.factory;

import appleMacs.beforeImplementation.model.MacAir;
import appleMacs.beforeImplementation.model.MacPro;
import appleMacs.beforeImplementation.model.MacPro2016;
import appleMacs.beforeImplementation.model.Macbook;

public class MacbookSimpleFactory {

    public static Macbook orderNotebook(String type, String level) {
        Macbook notebook = null;

        if (type.equals("air")) {
            if (level.equals("standard")) {
                notebook = new MacAir();
            }
        } else if (type.equals("pro")) {
            if (level.equals("standard")) {
                notebook = new MacPro2016();
            } else if (level.equals("high")) {
                notebook = new MacPro();
            }
        }

        notebook.getHardware();
        notebook.assemble();
        notebook.getCertificates();;
        notebook.pack();

        return notebook;
    }

}
