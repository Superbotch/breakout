import greenfoot.*;
import java.applet.*;
import java.awt.*;

/**
 * Write a description of class face here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the face wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(1);
}
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
    }// Add your action code here.
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
