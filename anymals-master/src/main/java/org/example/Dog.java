package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Dog extends Pets{
    public Dog(){
        super();
    }

    public Dog (String name){
        super(name);
    }

    public Dog (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Dog (String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
}
