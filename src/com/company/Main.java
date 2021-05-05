package com.company;

import javax.naming.PartialResultException;
import java.awt.*;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
	 /* 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
        участники должны выполнять соответствующие действия (бежать или прыгать),
         результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
        4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
          
          */
        
        Random rand = new Random();
        Skills [] skills = new Skills[3];
        
        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        
        skills[0] = new Human("Vasya", distance, heigth);
        
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        skills[1] = new Robot("T1000", distance, heigth);
        
        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        skills[2] = new Cat("Myrzik", distance, heigth);
        
        Barrier[] barriers = new Barrier[3];
        
       boolean isRaceTrack;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);
            isRaceTrack = rand.nextBoolean();
            if (isRaceTrack) {
                barriers[i] = new Racetrack(" Racetrack № " + i, distance);
            } else {
                barriers[i] = new Wall(" Wall № " + i, distance);
            }
        }
        
        for (int i = 0; i < skills.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                
                result = barriers[j].moving(skills[i]);
    
                if (!result) {
                    break;
                }
            }
            
            if (result) {
                System.out.println(" Success! ");
            } else {
                System.out.println(" Unsuccessfully! ");
            }
        }
    }
}
