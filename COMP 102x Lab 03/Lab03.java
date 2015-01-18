import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage pic1 = new ColorImage("A.jpg");
        int width = pic1.getWidth();
        int height = pic1.getHeight();
        Canvas canvas = new Canvas(width, height);
        canvas.add(pic1);
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        ColorImage pic1 = new ColorImage("A.jpg");
        ColorImage pic2 = new ColorImage("B.jpg");
        int width = pic1.getWidth();
        int height = pic1.getHeight();
        Canvas canvas = new Canvas(width*2, height);
        canvas.add(pic1);
        canvas.add(pic2, width, 0);
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage pic1 = new ColorImage("A.jpg");
        ColorImage pic2 = new ColorImage("B.jpg");
        ColorImage pic3 = new ColorImage(pic1.add(pic2));
        int width = pic1.getWidth();
        int height = pic1.getHeight();
        int width2 = pic2.getWidth();
        Canvas canvas = new Canvas((width*3)+20, height);
        canvas.add(pic1);
        canvas.add(pic2, width+10, 0);
        int xpos = width2*2+20;
        canvas.add(pic3, xpos, 0);
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        ColorImage pic1 = new ColorImage("A.jpg");
        ColorImage pic2 = new ColorImage("B.jpg");
        ColorImage pic3 = new ColorImage(pic1.multiply(pic2));
        int width = pic1.getWidth();
        int height = pic1.getHeight();
        int width2 = pic2.getWidth();
        Canvas canvas = new Canvas((width*3)+20, height);
        canvas.add(pic1);
        canvas.add(pic2, width+10, 0);
        int xpos = width2*2+20;
        canvas.add(pic3, xpos, 0);
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseGreen(100);
        image.increaseRed(400);
        image.increaseBlue(500);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        image.save();
    }
}
