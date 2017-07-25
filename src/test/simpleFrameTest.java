/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ayo
 */
public class simpleFrameTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
        });
    }
    
    public void activate()
    {
        EventQueue.invokeLater(() ->
        {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(0, 100, 300, 1000);
            frame.setTitle("Test Evo2017");
            frame.setVisible(true);
            
        });
    }
    
    public void activate2()
    {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new SizedFrame();
            frame.setTitle("Salem Won");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE );
            frame.setVisible(true);
            
        });
    }
}

class SimpleFrame extends JFrame
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    
    public SimpleFrame()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        
    }
    
}

class SizedFrame extends JFrame
{
  public SizedFrame()
  {
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    int screenHeight = screenSize.height;
    int screenWidth = screenSize.width;
    
    setSize(screenWidth / 2, screenHeight / 2);
    setLocationByPlatform(true);
    
    Image img = new ImageIcon("icon.gif").getImage();
    setIconImage(img);
    
  }  
}