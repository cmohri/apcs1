//Clara, Jessica, Kevin
//Team Jack
//APCS1 pd8
//HW28 --  Ye Olde Role Playing Game
//2017-11-08

public class Monster {

    //declare instance variables
    private int HP;
    private int strength;
    private int defense;
    private double attackrating;
    private String name;
    
    //default constructor
    public Monster(String monstername) {
	HP = 150;
	strength = (int)((Math.random() * 45) + 20);
	defense = 20;
	attackrating = 1; 
	name = monstername;
    }
    
    //returns boolean indicating living or dead
    public boolean isAlive(){
	return (HP > 0);
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
    
    /*takes a Protagonist as a parameter
      calculates damage using this formula: damage = (strength * attack rating) - warrior defense
      damage should be an integer value*/
    public int attack(Protagonist attackedprotag){
	int protagdefense = attackedprotag.getDefense();
	int damage = (int) (strength * attackrating - protagdefense);
	attackedprotag.lowerHP(damage);
	return damage;
    }
}

