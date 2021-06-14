package OOP06;

public class Monster extends GameCharacter{
    private boolean fly;

    public Monster(){
        setMaxHealth(100);
        setBaseStrength(100);
    }
    public boolean isFlyingUnit(){
        return fly;
    }
    public void setFlyingUnit(boolean flyingUnit){
        if (flyingUnit){
            fly = true;
        }
        else{
            fly = false;
        }
    }
    @Override
    public void attackEnemy(GameCharacter gameCharacter){

    }
}
