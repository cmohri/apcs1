//Clara, Jessica, Kevin
//Team Jack
//APCS1 pd8
//HW28 --  Ye Olde Role Playing Game
//2017-11-08

public class Protagonist {

    //declare instance variables 
    private String name;
    private int HP;
    private int strength;
    private int defense;
    private double attackrating;

    
    //default constructor 
    public Protagonist(String inputname) {
	name = inputname;
	HP = 125;
	strength = 100;
	defense = 40;
	attackrating = 0.4;
	name = inputname;
    }

    //returns boolean indicating living or dead
    public boolean isAlive(){
        return( HP > 0 );
    }

    //returns value of defense attribute
    public int getDefense(){
	return defense;
    }

    //returns value of name attribute
    public String getName(){
	return name;
    }

    //takes an int parameter, decreases life attribute by that amount
    public void lowerHP(int damage){
	HP -= damage;
    }

    /* takes a Monster as a parameter
       calculates damage using this formula: damage = (strength * attack rating) - monster defense
       damage should be an integer value */
    public int attack(Monster attackedmonster){
	int monsterdefense = attackedmonster.getDefense();
	int damage = (int) (strength * attackrating) - monsterdefense;
	attackedmonster.lowerHP(damage);
	return damage;

    }
    
    /*prepares the Protagonist to perform a special attack
      decreases defense attribute
      increases attack attribute*/
    public void specialize(){
	defense -= 10;
	attackrating += 0.5;
    }

    /*prepares the Protagonist to perform a normal attack
      resets defense attribute
      resets attack attribute*/
    public void normalize(){
	defense = 40;
	attackrating = 0.4;
    }    

    /*
    public static void main(String[] args){
	Protagonist test = new Protagonist("hello");
	System.out.println(test.isAlive());
	System.out.println(test.getDefense());
	System.out.println(test.getName());
	test.lowerHP(3);
	System.out.println(test.isAlive());
	test.specialize();
	test.normalize();
	}
    */
}