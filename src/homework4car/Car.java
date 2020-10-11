package homework4car;

public class Car {
   private int carHP;
   private int price;
   Wheel wheel;
   Body body;
   Helm helm;

   public Car(Wheel wheel, Body body, Helm helm) {
      this.wheel = wheel;
      this.body = body;
      this.helm = helm;
   }

   public int getCarHP() {
      return carHP;
   }

   public void setCarHP(int carHP) {
      this.carHP = carHP;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public Wheel getWheel() {
      return wheel;
   }

   public void setWheel(Wheel wheel) {
      this.wheel = wheel;
   }

   public Body getBody() {
      return body;
   }

   public void setBody(Body body) {
      this.body = body;
   }

   public Helm getHelm() {
      return helm;
   }

   public void setHelm(Helm helm) {
      this.helm = helm;
   }

   @Override
   public String toString() {
      return "Car{" +
              "carHP=" + carHP +
              ", price=" + price +
              ", wheel=" + wheel +
              ", body=" + body +
              ", helm=" + helm +
              '}';
   }
}

