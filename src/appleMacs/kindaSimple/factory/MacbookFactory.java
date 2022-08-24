package appleMacs.kindaSimple.factory;

import appleMacs.beforeImplementation.model.Macbook;

public abstract class MacbookFactory {

    public Macbook orderMacbook(String level) {
        Macbook notebook = null;

        notebook = createNotebook(level);

        notebook.getHardware();
        notebook.assemble();;
        notebook.getCertificates();
        notebook.pack();

        return notebook;
    }

    protected abstract Macbook createNotebook(String level);
}
