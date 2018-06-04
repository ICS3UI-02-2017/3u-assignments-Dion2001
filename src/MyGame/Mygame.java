package MyGame;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.Timer;

/**
 *
 * @author salod8556
 */
public class Mygame extends JComponent implements ActionListener {

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
    //Background Color
    Color background = new Color(140, 199, 247);
    // Varible for moving charater
    boolean moveleft = false;
    boolean moveright = false;
    boolean jump = false;
    // Variables for player 
    int blockX = 0;
    int blockY =50;
    int blockW = 50;
    int blockH = 50;
    // Varibles for the first row first piece
    int firstrowY = 100;
    int firstrowH = 25;
    int firstrowX = 0;
    int firstrowW = 600;
    Rectangle firstRow = new Rectangle(0, 100, 600, 25);
    //varibles for the first row second piece
    int firstrowX2 = 700;
    int firstrowY2 = 100;
    int firstrowW2 = 600;
    int firstrowH2 = 25;
    Rectangle firstrow2 = new Rectangle(700, 100, 600, 25);
    // varibles for the second row on left
    int secondrowX =-400;
    int secondrowY =250;
    int secondrowW = 400;
    int secondrowH = 25;
    Rectangle secondrow = new Rectangle(-200, 250, 600, 25);
    // variables for second row on right
    int secondrowX2 = 500;
    int secondrowY2 = 250;
    int secondrowW2 = 800;
    int secondrowH2 = 25;
    Rectangle secondrow2 = new Rectangle(500, 250, 800, 25);
    // varibles for third row on left
    int thirdrowX = 0;
    int thirdrowY = 400;
    int thirdrowW = 50;
    int thirdrowH =25;
    Rectangle thirdrow = new Rectangle(-500, 400, 750, 25);
    // varibles for third row on right
    int thirdrowX2 = 150;
    int thirdrowY2 = 400;
    int thirdrowW2 = 650;
    int thirdrowH2 = 25;
    Rectangle thirdrow2 = new Rectangle(350, 400, 650, 25);
    // variables for fourth row on left
    int fourthrowX = 0;
    int fourthrowY = 550;
    int fourthrowW = 300;
    int fourthrowH = 25;
    Rectangle fourthrow = new Rectangle(-300, 550, 600, 25);
    // variables for fourth row on right
    int fourthrowX2 = 400;
    int fourthrowY2 = 550;
    int fourthrowW2 = 400;
    int fourthrowH2 = 25;
    Rectangle fourthrow2 = new Rectangle(400, 550, 600, 25);
    // obsticals and the box it goes over for collision 
    int triX1 = 175;
    int triX2 = 180;
    int triX3 = 185;
    
    Rectangle tri1 = new Rectangle(175, 92, 10, 10);
    Rectangle floor1 = new Rectangle(0,249, 300, 26 );
    
    Rectangle block = new Rectangle(blockX, blockY, blockW, blockH);
    
    
    //Gravity 
    int changeY = 0;
    int gravity = 2;
    // score
    
    

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Mygame() {
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
        //Back round
        g.setColor(background);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //character
        g.setColor(Color.ORANGE);
        g.fillRect(block.x, block.y, block.width, block.height);
        // Floors
        g.setColor(Color.WHITE);
        //First row
        g.fillRect(firstRow.x, firstRow.y, firstRow.width, firstRow.height);
        g.fillRect(firstrow2.x, firstrow2.y, firstrow2.width, firstrow2.height);
        // Second row
        g.fillRect(secondrow.x, secondrow.y, secondrow.width, secondrow.height);
        g.fillRect(secondrow2.x, secondrow2.y, secondrow2.width, secondrow.height);
        // Third Row
        g.fillRect(thirdrow.x, thirdrow.y, thirdrow.width, thirdrow.height);
        g.fillRect(thirdrow2.x, thirdrow2.y, thirdrow2.width, thirdrow2.height);
        // fourth Row
        g.fillRect(fourthrow.x, fourthrow.y, fourthrow.width, fourthrow.height);
        g.fillRect(fourthrow2.x, fourthrow2.y, fourthrow2.width, fourthrow2.height);
       
        g.setColor(Color.RED);
        g.fillRect(floor1.x,floor1.y, floor1.width, floor1.height );
        
        
        
        
        g.setColor(Color.RED);
        int[] triangle1x= {triX1, triX2, triX3};
        int[] triangle1y ={100, 80, 100};
        g.fillPolygon(triangle1x, triangle1y, 3);
        
        
        
        // draw score
        
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }
    
    public void collisionDetection(int x, int y, int w, int h){
        if(!( block.y + block.height < y || block.y > y + h || 
               block.x + block.width < x || block.x > x + w )){
            changeY = 0;
            block.y = y - block.height;
           
    }
    }
    // move floors to right then reappear on left side of screen
  private void MovingFloorsRight(Rectangle x){
          x.x -= 1;
       if(x.x + x.width < 0){
         x.x = 800;
        }
    
}
private void MovingFloorsLeft(Rectangle x){
    x.x += 1;
    if(x.x > WIDTH){
        x.x = 0 - x.width;
    }
}
    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
         firstRow.x -= 1;
        if(firstRow.x + firstRow.width < 0){
            firstRow.x = 800;
        }
        firstrow2.x -=1;
         if(firstrow2.x + firstrow2.width < 0){
            firstrow2.x = 800;
         }
        
        triX1 -=1;
         triX2 -=1;
         triX3 -=1;
         tri1.x -=1;
         if(tri1.x < 0){
             tri1.x = 800;
         }
        
           
         
         if(triX3 < 0){
             triX1 = 800;
             triX2 = 805;
             triX3 = 810;
             tri1.x = 800;
         }
//     
        // stop block from leaveing the screen 
        if (block.x + 50 > WIDTH) {
            block.x = WIDTH - 50;
        }else{
        }if(block.x < 0){
                block.x =  0;
            
            }
        
        // move left or right
        if (moveleft) {
            block.x = block.x - 5;
        } else if (moveright) {
                block.x = block.x +5;
            }
         // jump on command
         if(jump){
                block.y = block.y - 15;
            }
        
        
        // gravity on player
        changeY = changeY + gravity;
        block.y = block.y + changeY;
        
       
        // Collison detection on the ground
       collisionDetection(firstRow.x, firstRow.y, firstRow.width, firstRow.height);
       collisionDetection(firstrow2.x, firstrow2.y, firstrow2.width, firstrow2.height);  
       collisionDetection(secondrow.x, secondrow.y, secondrow.width, secondrow.height);
       collisionDetection(secondrowX2, secondrowY2, secondrowW2, secondrowH2);
       collisionDetection(thirdrowX, thirdrowY, thirdrowW, thirdrowH);
       collisionDetection(thirdrowX2, thirdrowY2, thirdrowW2, thirdrowH2);
       collisionDetection(fourthrowX, fourthrowY, fourthrowW, fourthrowH);
       collisionDetection(fourthrowX2, fourthrowY2, fourthrowW2, fourthrowH2);
       CollisionDetectionObstacles(tri1);
       CollisionDetectionObstacles(floor1);
      

       
      
               
       }
        
        // Collison detection with obstacles and if hit go back to start
    public void CollisionDetectionObstacles (Rectangle obstacle){
      if(block.intersects(obstacle)){
          block.x =0;
          block.y =0;
          firstRow.x =0; 
          firstrow2.x =700;
          tri1.x= 175;
          triX1 = 175;
          triX2 = 180;
          triX3 = 185;
          
          
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
            // get the key code
            int keycode = e.getKeyCode();
            // which key
            if (keycode == KeyEvent.VK_A) {
                moveleft = true;
            }
                if (keycode == KeyEvent.VK_D) {
                    moveright = true;
                } 
                    if(keycode == KeyEvent.VK_W){
                jump = true;
                }
            
            
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            // get the key code
            int keycode = e.getKeyCode();
            // which key
            if (keycode == KeyEvent.VK_A) {
                moveleft = false;
            }
                if (keycode == KeyEvent.VK_D) {
                    moveright = false;
                }
                    if(keycode == KeyEvent.VK_W){
                jump = false;
                    
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
        Mygame game = new Mygame();
    }
}
