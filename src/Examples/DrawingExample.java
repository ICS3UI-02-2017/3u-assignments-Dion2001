package Examples;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
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
public class DrawingExample extends JComponent implements ActionListener {

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
    Color purple = new Color(217, 15, 224);
    int pacManx = 100;
    int pacMany = 100;
    int PacManAngle = 45;
    int PacManRotate = 270;
    boolean pacManClosing = false;
    int mousex = 0;
    int mousey = 0;
    boolean moveUp = false;
    boolean moveDown = false;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public DrawingExample() {
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

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        // use our custom colour varible 
        g.setColor(purple);
        //  create a "backround"
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // set colour
        g.setColor(Color.red);
        // draw a filled in rectangle
        // (X,Y , width, height)
        g.fillRect(100, 75, 150, 50);

        g.setColor(Color.yellow);
        //draw anything that is an " oval"
        // (x,y, width, height)
        g.fillOval(100, 75, 150, 50);
        g.fillOval(100, 125, 150, 50);
        g.setColor(Color.black);
        g.drawOval(100, 75, 150, 50);
        g.setColor(Color.blue);
        // (x,y, width, height, radius width, 
        g.fillRoundRect(300, 75, 150, 50, 20, 20);

        //draw pollygon
        g.setColor(Color.cyan);
        int[] triangleX = {mousex, 600, 450};
        int[] triangleY = {mousey, 500, 500};
        // array of x points, arraw of y points, number of points
        g.fillPolygon(triangleX, triangleY, 3);

        g.setColor(Color.yellow);
        // x, y, width, height, start angle, amount to rotate
        g.fillArc(pacManx, pacMany, 100, 100, PacManAngle, PacManRotate);


        // x, y, x, y
        g.setColor(Color.green);
        g.drawLine(250, 125, 500, 400);


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
        pacManx = pacManx + 3;


        // when pack man leaves the screen
        if (pacManx > WIDTH) {
            pacManx = -100;
        }
        if (PacManAngle <= 0) {
            pacManClosing = false;
        }
        if (PacManAngle >= 45) {
            pacManClosing = true;
        }
        // make pacman roll
        if (pacManClosing) {
            PacManAngle = PacManAngle - 1;
            PacManRotate = PacManRotate + 2;
        } else {
            PacManAngle = PacManAngle + 1;
            PacManRotate = PacManRotate - 2;
        }
        // move the player
        if (moveUp) {
            pacMany = pacMany - 3;
        } else {
            if (moveDown) {
                pacMany = pacMany + 3;
            }
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
            mousex = e.getX();
            mousey = e.getY();
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            // get the key code
            int keycode = e.getKeyCode();
            // which key
            if (keycode == KeyEvent.VK_W) {
                moveUp = true;
            } else {
                if (keycode == KeyEvent.VK_S) {
                    moveDown = true;
                }
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
// get the key code
            int keycode = e.getKeyCode();
            // which key
            if (keycode == KeyEvent.VK_W) {
                moveUp = false;
            } else {
                if (keycode == KeyEvent.VK_S) {
                    moveDown = false;
                }
            
        }
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
        DrawingExample game = new DrawingExample();
    }
}
