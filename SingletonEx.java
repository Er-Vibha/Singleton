class Single {
    // Private instance static of the class
    private static Single single;
    // static Single obj=new Single(); Another way of creating object like single

    // Private Constructor to prevent/avoid instantiation
    private Single() {
    }

    // Public static method to provide access to the instance/object
    public static Single getInstance() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }

    // Individual Public method of the class
    public void display() {
        System.out.println("Single info");
    }
}

public class SingletonEx {
    public static void main(String[] args) {
        Single.getInstance().display();
        // Single ob= Single.getInstance();
        // System.out.println(ob);
    }
}
