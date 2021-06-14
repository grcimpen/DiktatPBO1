package OOP06;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Sword {
    public Sword(){
        setName("Sword")
    }
    @Override
    public int getDamage(){
        return 9;
    }
    @Override
    public void attack(GameCharacter attacker, GameAttacker enemy){
        if(((Monster)enemy).isFlyingUnit()){
            System.out.println("Enemy ouf of range");
        }
        else{
            attacker.attackEnemy(enemy);
        }

        )
    }
    public String toString(){
        return String.format("%s   %d", getName(), getDamage());
    }
}
