package homework3;

public class rectangle {
    int width;
    int length;

    public rectangle(int width,int length){
        this.width=width;
        this.length=length;
    }
    rectangle(){
        width=100;
        length=40;
    }
    public int perimeter(){
        return width*2+length*2;
    }
    public int area(){
        return width*length;
    }
}
