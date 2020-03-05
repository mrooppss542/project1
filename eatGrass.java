abstract class Vehicle 
{
public int speed() 
{
return 0; 
} 
}
class Car extends Vehicle 
{
public int speed() 
{
return 60; 
} 
}
class RaceCar extends Car 
{
public int speed() 
{
return 150; 
} 
}
public class Test 
{
public static void main(String [] a)
{
RaceCar racer = new RaceCar();
Car car = new RaceCar();
Vehicle vehicle = new RaceCar();
System.out.println(racer.speed() + " , " + car.speed() +", " + vehicle.speed());
<p>What is the result?</p></div>