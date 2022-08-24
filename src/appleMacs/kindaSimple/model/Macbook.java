package appleMacs.kindaSimple.model;

public abstract class Macbook {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling the notebooks hardwares");
    }


    public void getCertificates() {
        System.out.println("Testing all the certificates");
    }


    public void pack() {
        System.out.println("Packing the notebook");
    }
}
