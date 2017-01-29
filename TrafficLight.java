import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 * @author (I Brittanie Gonzalez am
 * the author of this code) 
 * @version (2/10/16)
 */
public class TrafficLight extends JApplet implements ActionListener  {

    // instance variables - replace the example below with your own
    private int x;
    private JButton one, two, three;
    
    private boolean clickone = false;
    private boolean clicktwo = false;
    private boolean clickthree = false;

    
    Image img,img1,img2,img3,img4;
    ImageIcon icon;
    

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
     
        setLayout( new FlowLayout( ) ); 
        //Image img=getImage(getDocumentBase(),"cool.jpg");
        //ImageIcon Iimg = new ImageIcon(img);
        //JLabel Jimg= new JLabel(Iimg);
        //Jimg.setBounds(0,0,500,500);
        //this.add(Jimg);
        
        this.setSize(1400,750);
        
        img1 = getImage( getCodeBase( ), "flowers.jpg"); // URL for flowers.jpg:http://images6.fanpop.com/image/photos/33600000/flowers-tumblr-flowers-33623929-500-374.jpg
        icon = new ImageIcon( img1 );
        
        one = new JButton("GO ");
        one.setOpaque(true);//this line and the next line makes the button  black
        one.setBorderPainted(false);//
        one.setBackground(Color.black); // sets the background of button black
        
        one.setForeground(Color.green); //sets color to green
        one.setIcon(icon);
        one.addActionListener( this );
        
        
        img2 = getImage( getCodeBase( ), "blue.jpg"); //URl for blue.jpg:https://s-media-cache-ak0.pinimg.com/564x/d1/76/42/d17642af1ab2315b9c78321dfa8967c8.jpg
        icon = new ImageIcon( img2 );
        
        two = new JButton("WAIT", icon);
        two.setOpaque(true);//this line and the next line makes the button  black
        two.setBorderPainted(false);
        two.setForeground(Color.yellow); //sets color to yellow
        two.setBackground(Color.black); // sets the background of button black
        two.addActionListener( this );
      
        img3 = getImage( getCodeBase( ), "cflowers.jpg"); //URl for cflowers.jpg: https://secure.static.tumblr.com/6242afa1fe801f54166d6743a4ebb5d3/w4tx5m3/K5lniopkv/tumblr_static_tumblr_static_ce97tpdl1n488484o8k4w000c_640.jpg 
        three = new JButton("STOP", new ImageIcon( img3 ) );
        three.setForeground(Color.red); //sets color to red
        three.setBackground(Color.black); // sets the background of button black\  
        three.setOpaque(true);//this line and the next line makes the button  black
        three.setBorderPainted(false);
        three.addActionListener( this );
        
        add( one );
        add( two );
        add( three );
        
       Image img=getImage(getDocumentBase(),"cool.jpg"); //sets background image, I know it's below my buttons I like it. 
       ImageIcon Iimg = new ImageIcon(img); // URl for cool.jpg: https://wallpaperscraft.com/image/mclaren_p1_side_view_road_105099_3840x2160.jpg
       JLabel Jimg= new JLabel(Iimg);
       Jimg.setBounds(0,0,500,500);
       this.add(Jimg);
        //Image img = Toolkit.getDefaultToolkit().createImage("road.jpg");
    
      
        // this is a workaround for a security conflict with some browsers
        // including some versions of Netscape & Internet Explorer which do 
        // not allow access to the AWT system event queue which JApplets do 
        // on startup to check access. May not be necessary with your browser. 
    
        // provide any initialisation necessary for your JApplet
    }
    
    
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
       super.paint(g);
       //Image img=getImage(getDocumentBase(),"cool.jpg"); I tried this code for my background imge
       //Image img = Toolkit.getDefaultToolkit().createImage("cool.jpg"); // this is the background image
       //g.drawImage(img, 0, 0, null);
       
       Image img4=getImage(getDocumentBase(),"stoplight.jpg");
       g.drawImage(img4, 100, 250, this); // this draws a picture of a stoplight
       //Image ge=getImage(getDocumentBase(),"lambo.png");
       //g.drawImage(ge,400,450,this);
        // simple text displayed on applet
        
       if (clickone == true) 
       { 
           g.setColor(Color.black); //adds a black outline around oval
           g.drawOval(120, 350, 30, 30);//draws oval
           g.setColor(Color.green);
           g.fillOval(120, 350, 30, 30);
           clickone = false;
        }
  
       if (clicktwo == true)
        {
           g.setColor(Color.black); //adds a black outline around oval
           g.drawOval(120, 310, 30, 30);//draws oval
           g.setColor(Color.yellow);
           g.fillOval(120, 310, 30, 30);
           clicktwo = false;
        }
        
       if (clickthree == true) 
       {
           g.setColor(Color.black); //adds a black outline around oval
           g.drawOval(120, 265, 30, 30); //draws oval
           g.setColor(Color.red);
           g.fillOval(120, 265, 30, 30);
           clickthree = false;
        }
         }
    
   public void actionPerformed( ActionEvent ae) {
        Object obj=ae.getSource();
        if(ae.getSource()==one)
        {
            clickone = true;
            repaint();
          
        }
         
        if(ae.getSource()==two)
        {
            clicktwo = true;
            repaint();
          
        }
        
        if(ae.getSource()==three)
        {
            clickthree = true;
            repaint();
            
        }
    }
 
    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
