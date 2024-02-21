package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Horse extends PackAnimals{
    public Horse (){
        super();
    }
    public Horse (String name) {
        super(name);
    }
    public Horse (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Horse (String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
}
