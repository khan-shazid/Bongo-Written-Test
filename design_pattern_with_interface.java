interface Vehicle{
  int set_num_of_wheels();
  int set_num_of_passengers();
  boolean has_gas();
}

class Car implements Vehicle{
  public int wheels = 0;
  public int passengers = 0;
  public int gas = 0;

  public Car(int wheels,int passengers,int gas){
    this.wheels = wheels;
    this.passengers = passengers;
    this.gas = gas;
  }
  public int set_num_of_wheels(){
    return wheels;
  }
  public int set_num_of_passengers(){
    return passengers;
  }
  public boolean has_gas(){
    if(gas>0){
      return true;
    }else{
      return false;
    }
  }
}

class Plane implements Vehicle{
  public int wheels = 0;
  public int passengers = 0;
  public int gas = 0;

  public Plane(int wheels,int passengers,int gas){
    this.wheels = wheels;
    this.passengers = passengers;
    this.gas = gas;
  }
  public int set_num_of_wheels(){
    return wheels;
  }
  public int set_num_of_passengers(){
    return passengers;
  }
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
      Car car = new Car(4,4,0);
      Plane plane = new Plane(16,50,100);
   }
}
