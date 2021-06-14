package OOP06;
import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private Weapon weapon2;
    private List<Item> inventory;
    public Item item;

    public Hero(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void equip(Weapon weapon){
        weapon2 = weapon;
        setCurrentStrength(getBaseStrength()+mweapon.getDamage());
    }
}
