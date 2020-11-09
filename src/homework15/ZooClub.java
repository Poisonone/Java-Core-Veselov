package homework15;

import java.util.*;

public class ZooClub {
    List<Pet> pet;
    Map<Person, List<Pet>> map;
    Set<Map.Entry<Person, List<Pet>>> entries;
    Pet petVar;
    Person person;

    public ZooClub(Map<Person, List<Pet>> map) {
        this.map = map;
    }

    Scanner sc = new Scanner(System.in);

    public void addNewPerson() {
        System.out.println("Enter the person's name;");
        String inputName = sc.nextLine();
        System.out.println("Enter the person's age;");
        int inputAge = sc.nextInt();
        map.put(new Person(inputName, inputAge), pet);
    }

    public void addAnAnimalToThePerson() {
        for (Person i : map.keySet()) {
            System.out.println("Enter the person's name");
            String inputName1 = sc.nextLine();
            System.out.println("Enter the person's age");
            int inputAge1 = sc.nextInt();
            if (i.getName().equals(inputName1) && (i.getAge() == (inputAge1))) {
                System.out.println("Enter the Animal's name;");
                String inputName = sc.nextLine();
                System.out.println("Enter the Age's age;");
                String inputType = sc.nextLine();
                pet.add(new Pet(inputName1, inputType));
            }
        }
    }

    public void removeAPerson() {
        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
        System.out.println("Enter the person's name");
        String inputName1 = sc.nextLine();
        System.out.println("Enter the person's age");
        int inputAge1 = sc.nextInt();
        while (iterator.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator.next();
            if (inputName1.equals(person.getName()) && (inputAge1 == person.getAge())) {
                iterator.remove();
            }
        }
    }

    public void removeAnAnimalFromThePerson() {
        Iterator<Map.Entry<Person, List<Pet>>> iterator3 = entries.iterator();
        System.out.println("Enter the person's name");
        String inputName1 = sc.nextLine();
        System.out.println("Enter the person's age");
        int inputAge1 = sc.nextInt();
        for (Person i : map.keySet()) {
            if (inputName1.equals(person.getName()) && ((inputAge1) == (person.getAge()))) {
                List<Pet> saved = map.get(i);
                while (iterator3.hasNext()) {
                    if (saved.equals(petVar.getName()) && saved.equals(petVar.getType())) {
                        iterator3.remove();
                    }
                }
            }
        }

    }

    public void removeAnAnimal() {
        Iterator<Map.Entry<Person, List<Pet>>> iterator2 = entries.iterator();
        System.out.println("Enter the animal's name");
        String inputName1 = sc.nextLine();
        System.out.println("Enter the animal's type");
        String inputType1 = sc.nextLine();
        while (iterator2.hasNext()) {
            Map.Entry<Person, List<Pet>> next = iterator2.next();
            if (inputName1.equals(petVar.getName()) && (inputType1.equals(petVar.getType()))) {
                iterator2.remove();
            }
        }
    }

    public void showZooClub() {
        for (Person i : map.keySet()) {
            System.out.println("Person : " + i + "Animal : " + map.get(i));
        }

    }

    public void exitFromTheMenu() {
        System.exit(0);
    }
}

