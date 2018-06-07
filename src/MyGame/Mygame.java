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
    int triX2 = 185;
    int triX3 = 195;
    
//    Rectangle invis1 = new Rectangle(175, 92, 25, 10);
    Rectangle fireBall = new Rectangle(250, 72, 25, 25);
//    Rectangle invis2 = new Rectangle(0, 222, 25, 25);
    Rectangle fireBall2 = new Rectangle(0, 222, 25, 25);
//    Rectangle invis3 = new Rectangle(775, 375, 25, 25);
    Rectangle fireBall3 = new Rectangle(775, 372, 25, 25);
//    Rectangle invis4 = new Rectangle(-25, 522, 25, 25);
    Rectangle fireBall4 = new Rectangle(-25, 522, 25, 25);
    Rectangle fireBall5 = new Rectangle(825, 522, 25, 25);
    Rectangle fireBall6 = new Rectangle(160, -230, 25, 25);
    Rectangle fireBall7 = new Rectangle(320, -280, 25, 25);
    Rectangle fireBall8 = new Rectangle(480, -320, 25, 25);
    Rectangle fireBall9 = new Rectangle(640, -350, 25, 25);
    
    
    Rectangle floor1 = new Rectangle(0,249, 300, 26 );
    Rectangle floor2 = new Rectangle(455, 399, 365, 26);
    Rectangle block = new Rectangle(blockX, blockY, blockW, blockH);
    //Gravity 
    int changeY = 0;
    int gravity = 2;
    // score
    int score =10;
    boolean endScreen = false;
    

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
        g.fillRect(floor2.x,floor2.y, floor2.width, floor2.height);
        
        
        
        g.setColor(Color.RED);
        int[] triangle1x= {triX1, triX2, triX3};
        int[] triangle1y ={80, 100, 100};
//        g.fillPolygon(triangle1x, triangle1y, 3);
        g.fillOval(fireBall.x, fireBall.y, fireBall.width, fireBall.height);
        g.fillOval(fireBall2.x, fireBall2.y, fireBall2.width, fireBall2.height);
        g.fillOval(fireBall3.x, fireBall3.y, fireBall3.width, fireBall3.height);
        g.fillOval(fireBall4.x, fireBall4.y, fireBall4.width, fireBall4.height);
        g.fillOval(fireBall5.x, fireBall5.y, fireBall5.width, fireBall5.height);
        g.fillOval(fireBall6.x, fireBall6.y, fireBall6.width, fireBall6.height);
        // draw score
        g.drawString(""+ score, WIDTH /2 -50 , 50);
        
        if(block.y > HEIGHT){
            endScreen = true;
            g.setColor(Color.RED);
            g.drawString("You Won", 500, 300);
            
        }
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
        fireBall.x -=3;
         if(fireBall.x < -25){
             fireBall.x = 825;
         }    
         fireBall2.x +=3;
         if(fireBall2.x  > WIDTH + 25){
             fireBall2.x= -25;
         }
         fireBall3.x -=3;
         if(fireBall3.x < -25){
             fireBall3.x = 825;
         }
         fireBall4.x +=3;
         if(fireBall4.x > 825){
             fireBall4.x = -25;
         }
         fireBall5.x -=3;
         if(fireBall5.x < -25){
             fireBall5.x = 825;
         }
        // stop block from leaveing the screen 
        if (block.x + 50 > WIDTH) {
            block.x = WIDTH - 50;
        }else{
        }if(block.x < 0){
                block.x =  0;
            }
        
        // move left or right
        if (moveleft) {
            block.x = block.x - 7;
        } else if (moveright) {
                block.x = block.x +7;
            }
         // jump on command
         if(jump){
                block.y = block.y - 15;
            }
        
        if(block.y > HEIGHT){
            
        }
        // gravity on player
        changeY = changeY + gravity;
        block.y = block.y + changeY;
        
       
        // Collison detection on the ground
       collisionDetection(firstRow.x, firstRow.y, firstRow.width, firstRow.height);
       collisionDetection(firstrow2.x, firstrow2.y, firstrow2.width, firstrow2.height);  
       collisionDetection(secondrow.x, secondrow.y, secondrow.width, secondrow.height);
       collisionDetection(secondrow2.x, secondrow2.y, secondrow2.width, secondrow2.height);
       collisionDetection(thirdrow.x, thirdrow.y, thirdrow.width, thirdrow.height);
       collisionDetection(thirdrow2.x, thirdrow2.y, thirdrow2.width, thirdrow2.height);
       collisionDetection(fourthrow.x, fourthrow.y, fourthrow.width, fourthrow.height);
       collisionDetection(fourthrow2.x , fourthrow2.y, fourthrow2.width, fourthrow2.height);
//       CollisionDetectionObstacles(floor1);
//       CollisionDetectionObstacles(floor2);
//       CollisionDetectionObstacles(fireBall);
//       CollisionDetectionObstacles(fireBall2);
//       CollisionDetectionObstacles(fireBall3);
//       CollisionDetectionObstacles(fireBall4);
//       CollisionDetectionObstacles(fireBall5);
       MovingFloorsLeft(firstRow);
       MovingFloorsLeft(firstrow2);
       MovingFloorsLeft(fourthrow);
       MovingFloorsLeft(fourthrow2);

       
      
               
       }
        
        // Collison detection with obstacles and if hit go back to start
    public void CollisionDetectionObstacles (Rectangle obstacle){
      if(block.intersects(obstacle)){
          block.x =0;
          block.y =0;
          firstRow.x =0; 
          firstrow2.x =700;
          fourthrow.x = -300;
          fourthrow2.x = 400;
          triX1 = 175;
          triX2 = 180;
          triX3 = 185;
//          invis1.x= 175;
          fireBall.x = 350;
//          invis2.x = 0;
          fireBall2.x = 0;
//          invis3.x = 825;
          fireBall3.x= 825;
          fireBall4.x = -25;
          fireBall5.x = 825;
          score--;
          
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
