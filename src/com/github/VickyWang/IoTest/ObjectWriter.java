package com.github.VickyWang.IoTest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
/**
 * Created by Vicky.Wang on 2017/3/18.
 */

public class ObjectWriter {
    public static void main(String[] args) {
        File objFile = new File("c:/student.ser");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(objFile))) {
            Student s = new Student("Tom", "USA", new Date());
            out.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
