//**********************************************
public class variableScope {

 public static void main(String[] args) {
  
  //local =  declared inside a method
  //   visible only to that method
  
  //global  = declared outside a method, but within a class
  //   visible to all parts of a class
  
  DiceRoller diceRoller = new DiceRoller();
  
 }
}
//**********************************************
import java.util.Random;

public class DiceRoller {
 
 Random random;
 int number;
 
 DiceRoller(){
  random = new Random();
  roll();
 }
 
 void roll() {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}
//**********************************************