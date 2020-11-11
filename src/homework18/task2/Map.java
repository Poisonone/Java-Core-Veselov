package homework18.task2;

public class Map {
    public static void main(String[] args) {
        MyEntry<String, Integer> obj = new MyEntry();
        obj.showAllTheKeys();
        obj.showAllTheValues();
        obj.showTheMap();
        obj.deleteWithAKey("Key");
        obj.mapAdd("Key", 12);
    }
}
