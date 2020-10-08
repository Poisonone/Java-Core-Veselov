package homework6.task1;

public class Wages implements Income{
    int hours = 150;
    int payment=40;
    int calculate = hours * payment;

    public int getIncome() {
        return calculate;
    }
}
