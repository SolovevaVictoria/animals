package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class reestr {
    ArrayList<PackAnimals> packAnimals;
    ArrayList<Pets> pets;
    String nameOfReestr;

    public reestr(String nameOfReestr){
        this.nameOfReestr = nameOfReestr;
    }

    {
        packAnimals = new ArrayList<PackAnimals>();
        pets = new ArrayList<Pets>();
    }

    public void addPet(Pets a){
        this.pets.add(a);
    }
    public void addPackAnimals(PackAnimals a){
        this.packAnimals.add(a);
    }

    public void addSkill(String name){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < this.pets.size(); i++){
            if (Objects.equals(this.pets.get(i).getName(), name)){
                System.out.println("Какой навык вы хотите добавить?");
                String sk = s.nextLine();
                this.pets.get(i).addSkill(sk);
            };
        }
        for(int i = 0; i < this.packAnimals.size(); i++){
            if (Objects.equals(this.packAnimals.get(i).getName(), name)){
                System.out.println("Какой навык вы хотите добавить?");
                String sk = s.nextLine();
                this.packAnimals.get(i).addSkill(sk);
            };
        }}

    public void prSkill(String name1){
        for(int i = 0; i < this.pets.size(); i++){
            if (Objects.equals(this.pets.get(i).getName(), name1)){
                this.pets.get(i).print_skills();
            };
        }
        for(int i = 0; i < this.packAnimals.size(); i++){
            if (Objects.equals(this.packAnimals.get(i).getName(), name1)){
                this.packAnimals.get(i).print_skills();
            };
        }
    }



    public void printAll(){
        System.out.println("Pets:");
        System.out.println("*******************************************");
        for(int i = 0; i < this.pets.size(); i++){
            System.out.println(this.pets.get(i).info());
        }
        System.out.println();
        System.out.println("PackAnimals:");
        for(int i = 0; i < this.packAnimals.size(); i++){
            System.out.println(this.packAnimals.get(i).info());
        }
        System.out.println("*******************************************");
    }
}
