package com.github.VickyWang.Reflect;
import com.github.VickyWang.Reflect.model.IndexField;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;



/**
 * Created by Vicky.Wang on 2017/3/18.
 */
public class IndexFieldReader {
    public static List<String> getIndexFieldName(Object o){
        List<String> result = new ArrayList<String>();

        Class<?> clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation ann = field.getAnnotation(IndexField.class);
            if(ann!=null){
                String name = field.getName();
                result.add(name);
            }
        }
        return result;
    }
}