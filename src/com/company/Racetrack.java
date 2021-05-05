package com.company;

public class Racetrack extends Barrier {
    private int length;
    
    public Racetrack(String name, int length) {
        super(name);
        
        this.length = length;
    }
    
    public int getLength() {
        return length;
    }
    
    @Override
    protected boolean moving(Skills skills) {
        System.out.println("The racetrack " + super.getName() + " length: " + this.length);
        
        skills.run();
        
        if (getLength() <= skills.getRunDistance()) {
            System.out.println("run success");
            
            return true;
        } else {
            System.out.println("run unsuccessfully");
            
            return false;
        }
    }
}
