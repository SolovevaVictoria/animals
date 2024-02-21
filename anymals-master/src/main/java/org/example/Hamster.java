package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Hamster extends Pets{

    public Hamster(){
        super();
    }

    public Hamster(String name) {
        super(name);
    }

    public Hamster (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Hamster (String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
}
