package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Cat extends Pets{

    public Cat(){
        super();
    }

    public Cat (String name){
        super(name);
    }

    public Cat (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Cat (String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
}
