package MyGame;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import static java.awt.image.ImageObserver.ERROR;
import java.io.File;
import javax.imageio.ImageIO;
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
    int blockY = 50;
    int blockW = 50;
    int blockH = 50;
     Rectangle block = new Rectangle(blockX, blockY, blockW, blockH);
    // Varibles for the first row first piece
    Rectangle firstRow = new Rectangle(0, 100, 600, 25);
    //varibles for the first row second piece
    Rectangle firstrow2 = new Rectangle(700, 100, 600, 25);
    // varibles for the second row on left
    Rectangle secondrow = new Rectangle(-200, 250, 600, 25);
    // variables for second row on right
    Rectangle secondrow2 = new Rectangle(500, 250, 800, 25);
    // varibles for third row on left
    Rectangle thirdrow = new Rectangle(-500, 400, 750, 25);
    // varibles for third row on right
    Rectangle thirdrow2 = new Rectangle(350, 400, 650, 25);
    // variables for fourth row on left
    Rectangle fourthrow = new Rectangle(-300, 550, 600, 25);
    // variables for fourth row on right
    Rectangle fourthrow2 = new Rectangle(400, 550, 600, 25);
    Rectangle underground = new Rectangle(0, 660, 2, 600);
    // new font
    Font biggerFont = new Font("Times new roman", Font.BOLD, 36);
    // fire balls
    Rectangle fireBall = new Rectangle(500, 72, 25, 25);
    Rectangle fireBall2 = new Rectangle(0, 222, 25, 25);
    Rectangle fireBall3 = new Rectangle(775, 372, 25, 25);
    Rectangle fireBall4 = new Rectangle(-25, 522, 25, 25);
    Rectangle fireBall5 = new Rectangle(825, 522, 25, 25);
    // Vertical Fire Balls
    Rectangle fireBall6 = new Rectangle(160, 625, 25, 25);
    Rectangle fireBall7 = new Rectangle(320, 675, 25, 25);
    Rectangle fireBall8 = new Rectangle(480, 725, 25, 25);
    Rectangle fireBall9 = new Rectangle(640, 775, 25, 25);
    // Floor is Lava
    Rectangle floor1 = new Rectangle(0, 249, 300, 26);
    Rectangle floor2 = new Rectangle(500, 399, 365, 26);
   
    //Gravity 
    int changeY = 0;
    int gravity = 2;
    //speeds
    int fireBallSpeed = 3;
    int fireBallSpeed2 = 5;
    int fireBallSpeed3 = 7;
    // score
    int score = 1;
    boolean startscreen = true;
    boolean endScreen = false;
    boolean startgame = false;
    // vertical fire ball movement on certain levels
    boolean fireBall6Movement = false;
    boolean fireBall7Movement = false;
    boolean fireBall8Movement = false;
    boolean fireBall9Movement = false;
    // Images 
    BufferedImage fireBallImage = loadImage("Fireball1.png");
    BufferedImage lavaImage = loadImage("lava.jpg");
    BufferedImage volcanoImage = loadImage("V2.jpg");
    

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
    public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
            
        }catch (Exception e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
        return img;
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
       
        g.drawImage(volcanoImage,0, 0, WIDTH, HEIGHT,null);
        //character
        g.setColor(Color.ORANGE);
        g.fillRect(block.x, block.y, block.width, block.height);
        // Floors
        g.setColor(Color.GRAY);
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
        g.fillRect(underground.x, underground.y, underground.width, underground.height);
         // Lava Obsticals
        g.setColor(Color.RED);
        g.drawImage(lavaImage,floor1.x, floor1.y, floor1.width, floor1.height,null);
        g.drawImage(lavaImage,floor2.x, floor2.y, floor2.width, floor2.height,null);
        // Draw Images of FireBalls
        g.drawImage(fireBallImage, fireBall.x, fireBall.y, fireBall.width, fireBall.height, null);
        g.drawImage(fireBallImage, fireBall2.x, fireBall2.y, fireBall2.width, fireBall2.height, null);
        g.drawImage(fireBallImage, fireBall3.x, fireBall3.y, fireBall3.width, fireBall3.height, null);
        g.drawImage(fireBallImage, fireBall4.x, fireBall4.y, fireBall4.width, fireBall4.height,null);
        g.drawImage(fireBallImage, fireBall5.x, fireBall5.y, fireBall5.width, fireBall5.height,null);
        g.drawImage(fireBallImage, fireBall6.x, fireBall6.y, fireBall6.width, fireBall6.height,null);
        g.drawImage(fireBallImage, fireBall7.x, fireBall7.y, fireBall7.width, fireBall7.height,null);
        g.drawImage(fireBallImage, fireBall8.x, fireBall8.y, fireBall8.width, fireBall8.height,null);
        g.drawImage(fireBallImage, fireBall9.x, fireBall9.y, fireBall9.width, fireBall9.height,null);
        // draw score
        g.setColor(Color.white);
        g.setFont(biggerFont);
        g.drawString("" + score, WIDTH / 2 , 50);
        if (startscreen == true) {
            g.setColor(Color.WHITE);
            g.setFont(biggerFont);
            g.drawString("Press buttons 1, 2, or 3 to Select Difficulty", 104, 350);
           
        }
        // Make Final/End Screen
        if (block.y > HEIGHT) {
            endScreen = true;
            startgame = false;
            g.setColor(Color.WHITE);
            g.setFont(biggerFont);
            if(score == 1){
               g.drawString("It took you " + score + " try to win!"  , 267, 375); 
               g.drawString("Press Escape to Restart", 267, 500);
            }
            if(score > 1){
            g.drawString("It took you " + score + " tries to win!"  , 267, 375);
            g.drawString("Press Escape to Restart", 267, 500);
}
        }
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }
// Collision Detection for ground blocks
    public void collisionDetection(int x, int y, int w, int h) {
        if (!(block.y + block.height < y || block.y > y + h
                || block.x + block.width < x || block.x > x + w)) {
            changeY = 0;
            block.y = y - block.height;

        }
    }
    // move floors to left then reappear on right side of screen
    private void MovingFloorsLeft(Rectangle x) {
        x.x += 1;
        if (x.x > WIDTH) {
            x.x = 0 - x.width;
        }
    }
    // The main game loop
    // In here is where all the logic for my game will go

    public void gameLoop() {
        // only start when start game is true
        if (startgame == true) {
            //make all fire balls move in a direction and make it reapear on the other side
            fireBall.x -= fireBallSpeed;
            if (fireBall.x < -25) {
                fireBall.x = 825;
            }
            fireBall2.x += fireBallSpeed;
            if (fireBall2.x > WIDTH + 25) {
                fireBall2.x = -25;
            }
            fireBall3.x -= fireBallSpeed;
            if (fireBall3.x < -25) {
                fireBall3.x = 825;
            }
            fireBall4.x += fireBallSpeed;
            if (fireBall4.x > 825) {
                fireBall4.x = -25;
            }
            fireBall5.x -= fireBallSpeed;
            if (fireBall5.x < -25) {
                fireBall5.x = 825;
            }
            // stop block from leaveing the screen 
            if (block.x + 50 > WIDTH) {
                block.x = WIDTH - 50;
            } else {
            }
            if (block.x < 0) {
                block.x = 0;
            }

            // move left or right
            if (moveleft) {
                block.x = block.x - 7;
            } else if (moveright) {
                block.x = block.x + 7;
            }
            // jump on command
            if (jump) {
                block.y = block.y - 15;
            }

           
            // gravity on player
            changeY = changeY + gravity;
            block.y = block.y + changeY;
            // Move Vertical Fire Balls up and make them reapear at the bottom
            if(fireBall6Movement == true){
                fireBall6.y -= 6;
            }
            if(fireBall7Movement == true){
               fireBall7.y -= 6;
            }
            if(fireBall8Movement == true){
               fireBall8.y -= 6;
            }
            if(fireBall9Movement == true){
               fireBall9.y -= 6;
            }
            if (fireBall6.y < -150){
                fireBall6.y = 625;
            }
            if (fireBall7.y < -100){
                fireBall7.y = 675;
            }
            if (fireBall8.y < -50){
                fireBall8.y = 725;
            }
            if (fireBall9.y < 0){
                fireBall9.y = 775;
            }
             //Collison detection on the ground
            collisionDetection(firstRow.x, firstRow.y, firstRow.width, firstRow.height);
            collisionDetection(firstrow2.x, firstrow2.y, firstrow2.width, firstrow2.height);
            collisionDetection(secondrow.x, secondrow.y, secondrow.width, secondrow.height);
            collisionDetection(secondrow2.x, secondrow2.y, secondrow2.width, secondrow2.height);
            collisionDetection(thirdrow.x, thirdrow.y, thirdrow.width, thirdrow.height);
            collisionDetection(thirdrow2.x, thirdrow2.y, thirdrow2.width, thirdrow2.height);
            collisionDetection(fourthrow.x, fourthrow.y, fourthrow.width, fourthrow.height);
            collisionDetection(fourthrow2.x, fourthrow2.y, fourthrow2.width, fourthrow2.height);
            collisionDetection(underground.x, underground.y, underground.width, underground.height);
            // Collision Detection for Obsticals
            CollisionDetectionObstacles(floor1);
            CollisionDetectionObstacles(floor2);
            CollisionDetectionObstacles(fireBall);
            CollisionDetectionObstacles(fireBall2);
            CollisionDetectionObstacles(fireBall3);
            CollisionDetectionObstacles(fireBall4);
            CollisionDetectionObstacles(fireBall5);
            CollisionDetectionObstacles(fireBall6);
            CollisionDetectionObstacles(fireBall7);
            CollisionDetectionObstacles(fireBall8);
            CollisionDetectionObstacles(fireBall9);
            MovingFloorsLeft(firstRow);
            MovingFloorsLeft(firstrow2);
            MovingFloorsLeft(fourthrow);
            MovingFloorsLeft(fourthrow2);
        }
    }

    // Collison detection with obstacles and if hit go back to start
    public void CollisionDetectionObstacles(Rectangle obstacle) {
        if (block.intersects(obstacle)) {
            block.x = 0;
            block.y = 0;
            firstRow.x = 0;
            firstrow2.x = 700;
            fourthrow.x = -300;
            fourthrow2.x = 400;
            fireBall.x = 550;
            fireBall2.x = 0;
            fireBall3.x = 825;
            fireBall4.x = -25;
            fireBall5.x = 825;
            fireBall6.y = 625;
            fireBall7.y = 675;
            fireBall8.y = 725;
            fireBall9.y = 775;
            score++;

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
            if (keycode == KeyEvent.VK_W) {
                jump = true;
            }

// level 1
            if (startscreen == true) {
                if (keycode == KeyEvent.VK_1) {
                    startgame = true;
                    startscreen = false;
                    fireBallSpeed = fireBallSpeed;
                }
            }
            // level 2
            if (keycode == KeyEvent.VK_2) {
                if (startscreen == true) {
                    startscreen = false;
                    startgame = true;
                    fireBall6Movement = true;
                    fireBall8Movement = true;
                    fireBallSpeed = fireBallSpeed2;
                    
                }
            }
            // level 3
            if (startscreen == true) {
                if (keycode == KeyEvent.VK_3) {
                    startscreen = false;
                    startgame = true;
                    fireBall6Movement = true;
                    fireBall8Movement = true;
                    fireBall7Movement = true;
                    fireBall9Movement = true;
                    fireBallSpeed = fireBallSpeed3;
                }

            }
            if(block.y > HEIGHT){
                if(keycode == KeyEvent.VK_ESCAPE){   
                    startscreen = true;
                     block.y =0;
                     block.x =0;
                }
//               startscreen = true;
//                startgame = false;
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
            if (keycode == KeyEvent.VK_W) {
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
