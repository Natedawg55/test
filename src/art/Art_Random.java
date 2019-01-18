package art;

//imports
import java.util.Random;
//imports

public class Art_Random {
    
    public static int get_random(int max, int min){
    
        //Determines if tile is usable or not
        Random random = new Random();
        int rand = random.nextInt(max) + min;
        
        return rand;
        
    }//get_random
    
}//end of Kings_Random
