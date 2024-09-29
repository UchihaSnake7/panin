/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panin.application.form.insumos;

import static com.github.weisj.jsvg.attributes.filter.BlendMode.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import javax.swing.JTextArea;

/**
 *
 * @author USUARIO
 */
public class TextArea extends JTextArea{

    public TextArea() {
        setEditable(false);
        setFocusable(false);
        setWrapStyleWord(true);
        setLineWrap(true);
 
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
//        super.addMouseListener(l); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
//        super.addMouseMotionListener(l); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
//        super.addMouseWheelListener(l); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void addNotify() {
         }
    
    
    
}
