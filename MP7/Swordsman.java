public class Swordsman extends Hero{
    //need changes and improvements

    // because of sword
    private int BASE_ATTACK = 10;
    // because of armor
    private int ARMOR = 19;

    public Swordsman(String name) {
        // a swordsman will have +ARMOR for HP because of ARMOR
        super(name);
        super.setHp(130);
        super.setMana(110);
    }

    //kailangan pa ba nig improvement??
    public int attack() {

        return BASE_ATTACK;
    }

    //special attacks more or less mao ni ilang special moves
    //special attacksss
    public int specAtt(int choice){
        if(choice == 1) {
            //how to record number of turns
            //special attack Bloodlust..
            //an offensive buff..
            //for 4 turns + 5 attack
            super.minusMana(15);
            return BASE_ATTACK += 5;
        }
        else if(choice == 2) {
            //how to record number of turns
            //Guard Stance
            //a defense buff
            //for 5 turns + 8 armor
            super.minusMana(20);
            return ARMOR += 8;
        }
        return BASE_ATTACK;
    }

    public int takeDamage(int damage) {
        // reduce damage because of armor!!! oh yeah!
        damage -= ARMOR;
        // set new hp
        return super.takeDamage(damage);
    }
}
