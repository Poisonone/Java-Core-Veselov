package homework3;

public class Main2 {
 public static void main(String[] args) {
     rectangle pr = new rectangle();
     System.out.println("(значення ручні) Периметр = "+ pr.perimeter());
     System.out.println("(значення ручні) Площа = "+ pr.area());
     rectangle pr1 = new rectangle(10,15);
     System.out.println("(значення введені при створенні об'єкту) Периметр = "+ pr1.perimeter());
     System.out.println("(значення введені при створенні об'єкту) Площа = "+ pr1.area());
     System.out.println("=============================================================");
     circle cr = new circle(8,16);
     System.out.println("Area= "+ cr.area());
     System.out.println("Length= "+ cr.length());

 }

}
