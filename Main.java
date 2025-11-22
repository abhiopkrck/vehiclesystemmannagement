import java.io.File;
import java.util.Scanner;

abstract class vehicle{
    static Scanner sc= new Scanner(System.in);
    abstract public void brand();
    abstract public void Model();
    abstract public void Price();
    abstract public void Speed();
}
class Car extends vehicle{
        String brand;
        String Model;
        int price;
        int speed;

        @Override
        public void brand(){
            System.out.println("Enter Car Brand Name:");
            brand=sc.next();
        }

        @Override
        public void Model(){
            System.out.println("Enter Car Model Name:");
            Model=sc.next();
        }

        @Override
        public void Price() {
            System.out.println("Enter Car Price :");
            price=sc.nextInt();
        }
        @Override
        public void Speed(){
            System.out.println("Enter Car Speed :");
            speed=sc.nextInt();
        }
}
class bike extends vehicle{
        String brand;
        String Model;
        int price;
        int speed;

        @Override
        public void brand(){
            System.out.println("Enter Bike Brand Name:");
            brand=sc.next();
        }

        @Override
        public void Model(){
            System.out.println("Enter Bike Model Name:");
            Model=sc.next();
        }

        @Override
        public void Price() {
            System.out.println("Enter Bike Price :");
            price=sc.nextInt();
        }
        @Override
        public void Speed(){
            System.out.println("Enter Bike Speed :");
            speed=sc.nextInt();
        }
}
class Truck extends vehicle{
        String brand;
        String Model;
        int price;
        int speed;

        @Override
        public void brand(){
            System.out.println("Enter Truck Brand Name:");
            brand=sc.next();
        }

        @Override
        public void Model(){
            System.out.println("Enter Truck Model Name:");
            Model=sc.next();
        }

        @Override
        public void Price() {
            System.out.println("Enter Truck Price :");
            price=sc.nextInt();
        }
        @Override
        public void Speed(){
            System.out.println("Enter Truck Speed :");
            speed=sc.nextInt();
        }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bike B=new bike();
        Car c= new Car();
        Truck T= new Truck();
       

        do { 
        System.out.println("=====Car Details=====");
        System.out.println(" 1.Add Car  ");
        System.out.println(" 2.Add Truck ");
        System.out.println(" 3.Car Bike");
        System.out.println(" 4.Display all availables vehicle");
        System.out.println(" 5.Exit:");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch (choice) {
           case 1:
                c.brand();
                c.Model();
                c.Price();
                c.Speed();
                System.out.println("=====Car Details=====");
                System.out.println(" Car Brand Name:"+c.brand);
                System.out.println(" Car Model Name:"+c.Model);
                System.out.println(" Car Price:"+c.price+"$");
                System.out.println(" Car Speed:"+c.speed+"km/h");
                break;
            case 2:
                T.brand();
                T.Model();
                T.Price();
                T.Speed();
                System.out.println("=====Car Details=====");
                System.out.println(" Truck Brand Name:"+T.brand);
                System.out.println(" Truck Model Name:"+T.Model);
                System.out.println(" Truck Price:"+T.price+"$");
                System.out.println(" Truck Speed:"+T.speed+"km/h");
                break;
            case 3:
                B.brand();
                B.Model();
                B.Price();
                B.Speed();
                System.out.println("=====Bike Details=====");
                System.out.println(" Bike Brand Name:"+B.brand);
                System.out.println(" Bike Model Name:"+B.Model);
                System.out.println(" Bike Price:"+B.price+"$");
                System.out.println(" Bike Speed:"+B.speed+"km/h");
                break;
            case 4:
                System.out.println("1.Car");
                System.out.println("2.Bike");
                System.out.println("Truck");
                System.out.println("Enter yout choice:");
                int select=sc.nextInt();
                if (select==1){
                System.out.println("=====Car Details=====");
                System.out.println(" Car Brand Name:"+c.brand);
                System.out.println(" Car Model Name:"+c.Model);
                System.out.println(" Car Price:"+c.price+"$");
                System.out.println(" Car Speed:"+c.speed+"km/h");
                }if(select==2){
                System.out.println("=====Bike Details=====");
                System.out.println(" Bike Brand Name:"+B.brand);
                System.out.println(" Bike Model Name:"+B.Model);
                System.out.println(" Bike Price:"+B.price+"$");
                System.out.println(" Bike Speed:"+B.speed+"km/h");
                }if(select==3){
                System.out.println("=====Car Details=====");
                System.out.println(" Truck Brand Name:"+T.brand);
                System.out.println(" Truck Model Name:"+T.Model);
                System.out.println(" Truck Price:"+T.price+"$");
                System.out.println(" Truck Speed:"+T.speed+"km/h");
                }
                break;

            case 5:
                System.out.println("Exiting bye.....");
                return;
            default:
                break;
        } 
            
        } while (true);


    }
}