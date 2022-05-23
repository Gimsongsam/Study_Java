package ch7;

import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("ActionEvent occurred!!!");
                }
            }// 익명 클래스의 끝
        );
    } // main의 끝z
} // InnerEx8의 끝
