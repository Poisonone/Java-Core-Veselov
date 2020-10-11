package homework4car;

public class Body {

    private int Length = 10;

    public Body(int Length){
        this.Length = Length;
    }

    public int getBody() {
        return Length;
    }

    public void setBody(int length) {
        Length = length;
    }

    @Override
    public String toString() {
        return "Body{" +
                "Length=" + Length +
                '}';
    }
    public int Bodyplus(){
        return Length*3;
    }
}
