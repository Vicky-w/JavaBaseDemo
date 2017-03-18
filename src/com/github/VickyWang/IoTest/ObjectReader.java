package com.github.VickyWang.IoTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class ObjectReader {

    public static void main(String[] args) {
        File objFile = new File("c:/student.ser");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(objFile))) {
            Student s = (Student) in.readObject();
            System.out.println(s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}