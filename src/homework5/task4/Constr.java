package homework5.task4;

public class Constr {
    int a;
    int b;
    char c;

    public Constr(){
        this(15,25,'S');
    }

    public Constr(int a, char c){
        this(a,25,c);
    }

    public Constr(int a, int b, char c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
