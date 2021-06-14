package OOP06;

public class Bow {
    private int numberOfArrow;

    public Bow(){
        setName("Bow");
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    public void setNumberOfArrow(int numberOfArrow) {
        this.numberOfArrow = numberOfArrow;
    }
    @Override
    public int getDamage(){
        return 5;
    }
    public void attack(GameCharacter attacker, GameAttacker enemy){
        attacker.attackEnemy(enemy);
    }
    public String toString(){
        return String.format("%s   %d", getName(),getDamage());
    }
}
