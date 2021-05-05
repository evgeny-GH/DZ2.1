package com.company;

public class Wall extends Barrier {
    
    private int heigth;
    
    public Wall(String name, int heigth) {
        super(name);
        
        this.heigth = heigth;
    }
    
    public int getHeigth() {
        return heigth;
    }
    
    @Override
    protected boolean moving(Skills skills) {
        System.out.println("The wall " + super.getName() + " heigth: " + this.heigth);
        
        skills.jump();
        
        if (getHeigth() <= skills.getJumpHeight()) {
            System.out.println(" jump success");
            
            return true;
        } else {
            System.out.println(" jump unsuccessfully");
            
            return false;
        }
    }
}