/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posb;

import java.net.URL;

/**
 *
 * @author mnish
 */
public class TestURL {
    public static void main(String[] args) {
        try {
            URL url = LoginPage.class.getResource("/bg/bg.jpg");
            System.out.println("URL = " + url);
        } catch (Exception e) {
        }
    }
}
