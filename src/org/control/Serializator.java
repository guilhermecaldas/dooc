/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author guilherme
 */
public class Serializator {

    public static String serialize(Object obj) throws Exception {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream so = new ObjectOutputStream(bo);
            so.writeObject(obj);
            so.flush();
            return bo.toString();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static Object deserialize(String obj) throws Exception {
        try {
            byte b[] = obj.getBytes();
            ByteArrayInputStream bi = new ByteArrayInputStream(b);
            ObjectInputStream si = new ObjectInputStream(bi);
            return si.readObject();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
