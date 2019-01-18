package art;

//imports
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
//imports

public class Game implements Runnable{
    
    //window
    public Window window;
    
    //thread
    private Thread thread;
    
    //screen size
    public int width, height;
    
    //boolean
    private boolean running = false;
    
    //needed for drawings
    public BufferStrategy bs;
    public Graphics g;
    
    public Game(int width, int height){
        
        this.width = width;
        this.height = height;
        
    }
    
    //lets start this!
    public void init(){
        
        //window
        window = new Window(width, height);
        
    }
    
    //update
    public void tick(){
        
    }
    
    //graphics / draw
    public void render(){
        
        bs = window.get_canvas().getBufferStrategy();
        
        //if their are no buffers add num_of_buffers amount of buffers
        if(bs == null){
            int num_of_buffers = 3;
            window.get_canvas().createBufferStrategy(num_of_buffers);
            return;
        }
        
        //makes paintbrush
        g = bs.getDrawGraphics();
        
        //clear
        //g.clearRect(0, 0, width, height);
        
        //drawings
        
        int sizex = 10;
        int sizey = Art_Random.get_random(500, 40);
        
        int size = 1000;
        
        if (size > 0){
        g.setColor(Color.RED);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.BLUE);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.YELLOW);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.CYAN);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.GREEN);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.WHITE);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.BLACK);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.DARK_GRAY);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.GRAY);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.MAGENTA);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.PINK);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        g.setColor(Color.ORANGE);
        g.fillRect(Art_Random.get_random(width, 0), Art_Random.get_random(height, 0), sizex, sizey);
        
        size -=1;
        }
        
        //drawings
        
        //show then delete
        bs.show();
        g.dispose();
        
    }
    
    //need for runnable
    public void run(){
        
        //start
        init();
        
        while(running){
            
            //updating
            tick();
            render();
        }
        
        //stop
        stop();
        
    }
    
    //start
    public synchronized void start(){
        
        //checks if running is true
        if(running){
            return;
        }
        
        running = true;
        
        thread = new Thread(this);
        thread.start();
        
    }
    
    //stop
    public synchronized void stop(){
        
        //checks if running is false
        if(!running){
            return;
        }
        
        running = false;
        
        //try to stop
        try {
            
        thread.join();
        
        } catch (InterruptedException a) {
            
            a.printStackTrace();
            
        }
        
    }
    
}
