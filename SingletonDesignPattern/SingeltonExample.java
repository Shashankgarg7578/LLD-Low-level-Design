package SingletonDesignPattern;

import java.io.Serializable;

public class SingeltonExample implements Serializable,Cloneable {

    private static SingeltonExample singeltonExample;

    private SingeltonExample() {
    }

    public static SingeltonExample getInstance() {
        if (singeltonExample == null) {
            singeltonExample = new SingeltonExample();
        }
        return singeltonExample;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object readResolve(){
        return singeltonExample;
    }

}
