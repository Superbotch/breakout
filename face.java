import greenfoot.*;

/**
 * Write a description of class face here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class face extends Actor
{
    /**
     * Act - do whatever the face wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        
            setRotation( 0 );
            move( 10 );   
        
        }
        if(Greenfoot.isKeyDown( "up" )){
            setRotation(270);
            move(1);
        }

    }    
}
