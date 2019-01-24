package com.jc.io;

import java.io.*;

/**
 * @author JC.
 * @date 2019-01-21.
 */
public class IOTest {

    public static void main(String[] args) {

        try(InputStream input = new FileInputStream("");
            OutputStream output = new FileOutputStream("")) {

        } catch (Exception e) {

        }
    }
}
