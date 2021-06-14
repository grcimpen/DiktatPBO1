package OOP06;

public abstract class GameCharacter {
    private int maxHealth, currentHealth, baseStrength, currentStrength;

    public GameCharacter(){

    }
    public int getMaxHealth(){
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getBaseStrength() {
        return baseStrength;
    }

    public void setBaseStrength(int baseStrength) {
        this.baseStrength = baseStrength;
    }

    public int getCurrentStrength() {
        return currentStrength;
    }

    public void setCurrentStrength(int currentStrength) {
        this.currentStrength = currentStrength;
    }
    public String getStatus(){
        String status = String.format("%d/%d    %d/%d",getCurrentHealth(),getMaxHealth(),getCurrentStrength(),getBaseStrength());
        return status;
    }
    public abstract void attackEnemy(GameCharacter gameCharacter);
}
