/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AP2;

import java.util.Scanner;

/**
 *
 * @author jaraj
 */
public class Ex6a {

    /**/    
    private static final String MSG_1 = "Introdueix un any i un mes: ";
    private static final String MSG_2 = "El mes té 29 dies";
    private static final String MSG_3 = "El mes té 28 dies";
    private static final String MSG_4 = "El mes té 30 dies";
    private static final String MSG_5 = "El mes té 31 dies";

    public static void main(String[] args) {
        int any, mes;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();
        if (mes % 2 == 0) {
            if (mes == 2) {
                if (any % 4 == 0) {
                    System.out.println(MSG_2);
                } else {
                    System.out.println(MSG_3);
                }
            } else {
                System.out.println(MSG_4);
            }
        } else {
            System.out.println(MSG_5);
        }
    }
}

