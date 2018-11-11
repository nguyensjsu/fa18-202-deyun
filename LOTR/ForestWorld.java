import greenfoot.*;  
/**
 * Write a description of class ForestWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestWorld extends World implements IMessageObserver
{

    Characters ch;
     Messages messages;
    public ForestWorld()
    {    
        super(1280, 800, 1); 
               
        //Character Initializations
         messages = new Messages();
         messages.AttachObservers(this);
         addObject(messages,600,680);
         ch= new TheGrandWizard();
         addObject(ch,100,680);
        
         

    }
    
          public void startGame(){
         Arrow arrow =new Arrow();
         addObject(arrow,180,630);
         
         addObject(new Elf(-2), 1280, Greenfoot.getRandomNumber( getHeight()));        
         addObject(new Elf(-2), 1280, Greenfoot.getRandomNumber( getHeight())); 
         addObject(new Elf(-2), 1280, Greenfoot.getRandomNumber( getHeight()));
         addObject(new Elf(-2), 1280, Greenfoot.getRandomNumber( getHeight()));
         removeObject(messages);
         
    }
    
         public void changeCharacterStance(){
         ch.setStance("Attack"); 
    }
    public void UpdateFromMessages(String message){
        if(message.equals("ChangeStance")){
            ch.setStance("Attack");
        }else if(message.equals("StartGame")){
            startGame();
        }
    }
  
    
    
}