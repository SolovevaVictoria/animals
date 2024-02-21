package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Camel extends PackAnimals{
    public Camel(){
        super();
    }
    public Camel(String name) {
        super(name);
    }
    public Camel (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Camel (String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
}
