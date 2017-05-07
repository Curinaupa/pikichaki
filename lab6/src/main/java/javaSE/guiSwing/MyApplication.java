package javaSE.guiSwing;

import javax.swing.*;
import java.awt.*;

/**
 Lab141
 Create new project called DemoGuiSwing. Add package “com.brainacad.myswing”.
 1) Create MyApplication class as a subclass of Jframe (GUI-application). Define a
 constructor with a name parameter of type String to set the title of the application
 window. Also in the constructor to define the size and location of the application
 window and make it visible.
 2) Create a class MainLab141 with the main() method, which creates an instance of the
 MyApplication class.
 Lab142
 Open project DemoGuiSwing (from 1.4.1 labs).
 Add in the constructor a MyApplication class completion of the application work.
 */
public class MyApplication extends JFrame {
    private String name;
    private int width;
    private int heigth;
    private boolean isVsbl = true;

    public MyApplication(String name, int width, int heigth, boolean isVsbl) throws HeadlessException {
        super(name);
        this.name = name;
        this.width = width;
        this.heigth = heigth;
        this.isVsbl = isVsbl;
        this.setSize(width, heigth);
        this.setLocation(300,300);
        this.setVisible(isVsbl);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
