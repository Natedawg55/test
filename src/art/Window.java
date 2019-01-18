/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art;

/**
 *
 * @author Nate
 */

//imports
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
//imports

public class Window extends JFrame {
    
    //Makes a JFrame object
    public static JFrame gui;
    
    //Makes canvas
    private Canvas canvas;
    
    //Makes a JPanel object
    public static JPanel panel = new JPanel(); 
    
    //constructor for window
    Window(int width, int height){
        
        //title
        gui = new JFrame("Art");
        
        //Make sure when the gui is closed it closes
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Sets the window in the middle of the screen
        gui.setLocationRelativeTo(null);
        
        //Resizable is false
        gui.setResizable(false);
        
        //Title
        gui.setTitle("Art");  
        
        //canvas for drawings
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        
        //adds canvas to the window
        gui.add(canvas);
        gui.pack();
        
        //Sets size---------------------------------------------------------------- 
        gui.setSize(width, height);
        //Sets size----------------------------------------------------------------
        
        //can you see the gui
        gui.setVisible(true);
        
    }//end of consturctor
    
    public Canvas get_canvas(){
        
        return canvas;
        
    }//get_canvas
    
    
}//end of constructor
