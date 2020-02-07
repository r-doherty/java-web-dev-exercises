package exercises.technology;

import exercises.technology.AbstractEntity;
import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;

public class Program {

    public static void main(String[] args) {
        Laptop macBookOne = new Laptop("Apple", 12, false, true);
        System.out.println(macBookOne.divisibleBy(20, 5));
        System.out.println(macBookOne.sumNumbers(20, 5));

        System.out.println(macBookOne.id);

        Laptop linuxMachine = new Laptop("Dell", 16, true, false);
        System.out.println(linuxMachine.id);

        SmartPhone iPhone = new SmartPhone("Apple", 8, true, "128 mega pixel");
        System.out.println(iPhone.id);

        Computer artificialIntelligence = new Computer("Google", 100000, false);
        System.out.println(artificialIntelligence.id);
    }
}
