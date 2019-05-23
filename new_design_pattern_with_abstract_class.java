abstract class Vehicle {
  public abstract int set_num_of_wheels();
  public abstract int set_num_of_passengers();
  public abstract boolean has_gas();
}

class Car extends Vehicle{
  public int wheels = 0;
  public int passengers = 0;
  public int gas = 0;

  public Car(int wheels,int passengers,int gas){
    this.wheels = wheels;
    this.passengers = passengers;
    this.gas = gas;
  }

  @Override
  public int set_num_of_wheels(){
    return wheels;
  }

  @Override
  public int set_num_of_passengers(){
    return passengers;
  }

  @Override
  public boolean has_gas(){
    if(gas>0){
      return true;
    }else{
      return false;
    }
  }
}

class Plane extends Vehicle{
  public int wheels = 0;
  public int passengers = 0;
  public int gas = 0;

  public Plane(int wheels,int passengers,int gas){
    this.wheels = wheels;
    this.passengers = passengers;
    this.gas = gas;
  }

  @Override
  public int set_num_of_wheels(){
    return wheels;
  }

  @Override
  public int set_num_of_passengers(){
    return passengers;
  }

  @Override
  public boolean has_gas(){
    if(gas>0){
      return true;
    }else{
      return false;
    }
  }
}

public class Test{
     public static void main(String []args){
        Vehicle car = new Car(4,4,0);
        Vehicle plane = new Plane(16,50,100);
        test_car_or_plane(car,4,4,0,false);
        test_car_or_plane(plane,16,50,100,true);
     }

     public static void test_car_or_plane(Vehicle v, int wheels, int passengers, int gas, boolean res){ //here 5th parameter refers to the output of has_gas method
       if(v.has_gas()==res){
         System.out.println("has_gas method verified");
       }else{
         System.out.println("has_gas method not verified");
       }

       if(v.set_num_of_wheels()==wheels){
         System.out.println("set_num_of_wheels method verified");
       }else{
         System.out.println("set_num_of_wheels method not verified");
       }

       if(v.set_num_of_passengers()==passengers){
         System.out.println("set_num_of_passengers method verified");
       }else{
         System.out.println("set_num_of_passengers method not verified");
       }
     }
}
