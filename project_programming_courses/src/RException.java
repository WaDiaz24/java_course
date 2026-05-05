public class RException extends Exception {
    public RException(String message) {
        super(message);
    }

    public void metodoA()  throws RException {
        System.out.println("Executing metodoA");
        metodoB();
    }

    public void metodoB() throws RException {
        System.out.println("Executing metodoB");
        throw new RException("Error in metodoB");
    }
}
