package com.succ.IOTest;

import com.succ.entity.Car;
import com.succ.entity.Person;

import java.io.*;

public class SerializableGo {
    public static <T extends Serializable> T clone(T man) throws IOException,ClassNotFoundException{
        ByteArrayOutputStream bot = new ByteArrayOutputStream();
        ObjectOutputStream oot = new ObjectOutputStream(bot);
        oot.writeObject(man);
        ByteArrayInputStream bit = new ByteArrayInputStream(bot.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bit);
        return (T)ois.readObject();
    }

    public static void main(String[] args) throws Exception{
        Person p = new Person("张",213,new Car("宝马",55));
        Person go = SerializableGo.clone(p);
        System.out.println(p);
        System.out.println(go);
        p.setAge(1);
        System.out.println(p);
        System.out.println(go);
    }


}
