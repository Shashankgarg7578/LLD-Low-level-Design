package SingletonDesignPattern;

import java.io.*;

public class MainSingleton {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        SingeltonExample test1 = SingeltonExample.getInstance();
        System.out.println(test1.hashCode());

        SingeltonExample test2 = SingeltonExample.getInstance();
        System.out.println(test2.hashCode());

        //in this class must have to implement Clonable interface
        SingeltonExample test3 = (SingeltonExample) test2.clone();
        System.out.println(test3.hashCode());

        //Serialization
        SingeltonExample serializeObject1 = SingeltonExample.getInstance();
        ObjectOutputStream stream1 = new ObjectOutputStream(new FileOutputStream("Obj1.obj"));
        stream1.writeObject(serializeObject1);
        stream1.close();
        System.out.println(serializeObject1.hashCode());

        //Deserialization for this method we must have to use readResolve() Method in our class.
        ObjectInputStream stream2 = new ObjectInputStream(new FileInputStream("Obj1.obj"));
        SingeltonExample serializeObject2 =   (SingeltonExample)stream2.readObject();
        stream2.close();
        System.out.println(serializeObject2.hashCode());

    }
}
