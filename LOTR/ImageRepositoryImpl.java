import greenfoot.*;
/**
 * Write a description of class ImageRepositoryImpl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImageRepositoryImpl implements IimageRepository
{
    private Actor image1 = new LeafSplat();
    private Actor image2 = new explosion2();
    // instance variables - replace the example below with your own
    public Actor images[] = {image1, image2};

    /**
     * Constructor for objects of class ImageRepositoryImpl
     */
    public ImageRepositoryImpl()
    {
    }

    public Actor getImage(int i){
        return images[i];
    }
    
    
    public IImageIterator createIterator(){
        return new ImageIteratorImpl();
    }
    
    private class ImageIteratorImpl implements IImageIterator{
        int index;
        
        public boolean hasNext(){
            if(index < images.length){
                return true;
            }
            return false;
        }
        
        public Actor next(){
            if(this.hasNext()){
                return images[index++];
            }
            return null;
        }
    }
}
