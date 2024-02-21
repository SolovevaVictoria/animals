package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Donkey extends PackAnimals{
    public Donkey (){
        super();
    }
    public Donkey (String name) {
        super(name);
    }
    public Donkey (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Donkey (String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
}
