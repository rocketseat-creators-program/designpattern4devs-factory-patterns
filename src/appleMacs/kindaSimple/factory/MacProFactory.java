package appleMacs.kindaSimple.factory;

import appleMacs.beforeImplementation.model.MacPro;
import appleMacs.beforeImplementation.model.MacPro2016;
import appleMacs.beforeImplementation.model.Macbook;

public class MacProFactory extends MacbookFactory {

    public Macbook createNotebook(String level) {
        if (level.equals("standard")) {
            return new MacPro2016();
        } else if (level.equals("high")) {
            return new MacPro();
        } else return null;
    }
}
