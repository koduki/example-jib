/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.example_jib;

/**
 *
 * @author koduki
 */
public class Main {

    public static void main(String[] args) {
        System.err.printf("%s %s, %s %s" + System.lineSeparator(),
                System.getProperty("os.name"),
                System.getProperty("os.version"),
                System.getProperty("java.vm.name"),
                System.getProperty("java.vm.version")
        );
        System.out.println("Hello World.");
    }
}
