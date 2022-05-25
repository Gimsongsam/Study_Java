package ch7;

import java.awt.*;
import java.awt.event.*;

// 컴파일하면 아래의 클래스가 생성된다.
//    InnerEx6.class
//    InnerEx6$1.class <- 익명 클래스
//    InnerEx6$2.class <- 익명 클래스
//    InnerEx6$3.class <- 익명 클래스


public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener{
    public void actionPerformed (ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
