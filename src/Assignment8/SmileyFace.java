package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author salod8556
 */
public class SmileyFace extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    Color skin = new Color(237, 213, 37);
    Color mouth = new Color (137, 24, 78);
    Color tounge = new Color (239, 45, 116);
    Color eyebrow = new Color (119, 80, 8);
    
    int leftEyeX = 250;
    int leftEyeMovement = -1;
    int rightEyex= 492;
    int rightEyeMovement = -1;
    int rightEyeBrowx= 159;
    int righteyeBrowMovement = -1;
    


    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public SmileyFace(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //create face
        g.setColor(skin);
        g.fillOval(100, 35, 550, 550);
        //create eyeballs
        g.setColor(Color.white);
        g.fillArc(185, 200, 140, 175, 0, 180);
        g.fillArc(426, 200, 140, 175, 0, 180);
        //create Irises
        g.setColor(Color.BLACK);
        g.fillOval(leftEyeX, 220, 65, 65);
        g.fillOval(rightEyex, 220, 65, 65);
        // create mouth
        g.setColor(Color.BLACK);
        g.fillArc(164, 140, 420, 400, 180, 180);
        g.setColor(mouth);
        g.fillArc(175, 175, 400, 350, 180, 180);
        // create tounge
        g.setColor(tounge);
        g.fillArc(369, 400, 175, 175, 25, 180);
        // Rotate the mouth filler
        g.translate(371, 509);
        g2d.rotate(Math.toRadians(-26));
        g.fillArc(0, -12, 175, 50, 180, 180 );
        g2d.rotate(Math.toRadians(26));
        g.translate(-371, -509);
        // create eyebrows
        g.setColor(eyebrow);
        g.fillRoundRect(183, rightEyeBrowx, 125, 30, 25, 25);
        g.fillRoundRect(430, 159, 125, 30, 25, 25);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        leftEyeX = leftEyeX + leftEyeMovement;
       
              
        
        if(leftEyeX < 200){
            leftEyeMovement = 1;
        }
        if(leftEyeX > 250){   
            leftEyeMovement = -1;
            
}  
        rightEyex = rightEyex + rightEyeMovement;
        if(rightEyex < 442){
            rightEyeMovement = 1; 
        }
        if(rightEyex > 492){
            rightEyeMovement = -1;
        }
        rightEyeBrowx = rightEyeBrowx +  righteyeBrowMovement;
        if(rightEyeBrowx < 100){
            righteyeBrowMovement = 1;
        }
        
}


    
    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        SmileyFace game = new SmileyFace();
    }
}

