package homework4car;

public class Car {
   private int carHP;
   private int price;
   Wheel wheel;

   public Car(Wheel wheel){
      this.wheel = wheel;
   }

   public Wheel getWheel() {
      return wheel;
   }

   public void setWheel(Wheel diameter) {
      this.wheel = wheel;
   }

   @Override
   public String toString() {
      return "Car{" +
              "wheel=" + wheel +
              '}';
   }
}

