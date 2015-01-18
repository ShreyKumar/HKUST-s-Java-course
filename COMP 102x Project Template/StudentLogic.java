import java.util.Random;

import comp102x.ColorImage;
import comp102x.assignment.GameLogic;
import comp102x.assignment.GameRecord;
import comp102x.assignment.Goal;

public class StudentLogic implements GameLogic{
    
    
    public ColorImage generateIntermediateFootballImage(ColorImage[] depthImages, int initialStep, int currentStep, int finalStep, double initialScale, double finalScale, int initialX, int finalX, int initialY, int finalY) {
        // write your code after this line
        //declare properties
        int imageIndex = (depthImages.length - 1)*((currentStep - initialStep)/(finalStep - initialStep));
        int xPosition = initialX + (finalX - initialX) * ((currentStep - initialStep)/(finalStep - initialStep));
        int yPosition = initialY + (finalY - initialY) * ((currentStep - initialStep)/(finalStep - initialStep));
        double scale = initialScale + (finalScale - initialScale) * ((currentStep - initialStep)/(finalStep - initialStep));
        
        //declare window and image
        depthImages[imageIndex].setX(xPosition);
        depthImages[imageIndex].setY(yPosition);
        depthImages[imageIndex].setScale(scale);
        
        //final return
        return depthImages[imageIndex];
    }


    public void updateGoalPositions(Goal[][] goals) {
        // write your code after this line
        boolean goalSwapped = false; 
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                
            }
        }
        
        
        
        
    }

    
    public GameRecord[] updateHighScoreRecords(GameRecord[] highScoreRecords, String name, int level, int score) {
        // write your code after this line
        
        
        
        
        
    }
    
    
}
