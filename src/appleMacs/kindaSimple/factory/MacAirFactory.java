package appleMacs.kindaSimple.factory;

import appleMacs.beforeImplementation.model.MacAir;
import appleMacs.beforeImplementation.model.MacPro;
import appleMacs.beforeImplementation.model.Macbook;

public class MacAirFactory extends MacbookFactory {

    public Macbook createNotebook(String level) {
        if (level.equals("standard")) {
            return new MacAir();
        } else return null;
    }
}
