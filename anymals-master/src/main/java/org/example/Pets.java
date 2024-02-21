package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Pets extends Animal{
    public static int counter;
    public static int idCounter;
    public int id;
    {
        counter++;
        id = ++idCounter;

    }
    public Pets(){
        super();
    }

    public Pets(String name){
        super(name);
    }

    public Pets (String name, Date dayOfBirthday) {
        super(name, dayOfBirthday);
    }
    public Pets(String name, Date dayOfBirthday, ArrayList<String> commands) {
        super(name, dayOfBirthday, commands);
    }
    static {
        idCounter = 0;
    }
    protected static int getCounter(){
        return counter;
    }
    public int getId() {
        return id;
    }

    public void print_skills(){
        ArrayList<String> sk = this.getCommands();
        System.out.println("Commands of pet: " + this.getName());
        System.out.println("------------------------------------------");
        for(int i = 0; i < sk.size(); i++){
            System.out.println(sk.get(i) + ";");
        }
        System.out.println("------------------------------------------");
    }

    public String info(){
        return "pet " + this.getId() + ") " + this.getName() + "\nDay of birthday: " + this.dayOfBirthday;
    }


}
