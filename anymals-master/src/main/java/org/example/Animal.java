package org.example;
import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
    protected String name;
    protected Date dayOfBirthday;
    protected ArrayList<String> commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDayOfBirthday(){
        return dayOfBirthday;
    }

    public void addSkill(String skill){
        this.commands.add(skill);
    }

    public void setDayOfBirthday(Date date){
        this.dayOfBirthday = dayOfBirthday;
    }

    public ArrayList<String> getCommands(){
        return this.commands;
    }

    public void setCommands(ArrayList<String> commands){
        this.commands = commands;
    }

    {
        name = "Animal";
        dayOfBirthday = new Date();
        commands = new ArrayList<>();
    }

    public Animal() {
        //System.out.println("Constructor Animal1");
    }

    public Animal(String name) {
        //System.out.println("Constructor Animal2");
        this.name = name;
    }

    public Animal(String name, Date dayOfBirthday) {
        //System.out.println("Constructor Animal");
        this.name = name;
        this.dayOfBirthday = dayOfBirthday;
    }
    public Animal(String name, Date dayOfBirthday, ArrayList<String> commands) {
        //System.out.println("Constructor Animal3");
        this.name = name;
        this.dayOfBirthday = dayOfBirthday;
        this.commands = commands;
    }


}
