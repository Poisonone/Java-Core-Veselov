package homework13;

import java.util.Scanner;

public class Deputy extends Human {
    String name;
    String surname;
    boolean corrupt = true;
    int bribesum; // сума хабаря
    int bribe = 0;
    String sex;
    Scanner sc = new Scanner(System.in);


    public Deputy() {

    }

    public Deputy(int weight, int height, int age, String name, String surname, boolean corrupt, String sex) {
        super(weight, height, age);
        this.name = name;
        this.surname = surname;
        this.corrupt = corrupt;
        this.sex = sex;

    }

    public int getBribe() {
        return bribe;
    }

    public void setBribe(int bribe) {
        this.bribe = bribe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isCorrupt() {
        return corrupt;
    }

    public void setCorrupt(boolean corrupt) {
        this.corrupt = corrupt;
    }

    public int getBribesum() {
        return bribesum;
    }

    public void setBribesum(int bribesum) {
        this.bribesum = bribesum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public void giveABribe() {

        if (corrupt == false) {
            System.out.println("I'm not playing this game!");
        } else {
            System.out.println("Enter the sum of the bribe:");
            int input = sc.nextInt();
            if (input > 5000) {
                System.out.println("U're such a nasty shit!");
            } else {
                bribesum += input;
                System.out.println("U've got it!");
            }
        }
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", corrupt=" + corrupt +
                ", bribesum=" + bribesum +
                ", sex='" + sex + '\'' +
                '}';
    }
}
