package player_scripts;

public class new_player {
    public Long hp;
    public Mana mp;
    public Defense def;
    public Armor armor;
    public Charisma cha;
    public new_player() {
        this.hp = 100L;
        this.mp = new Mana();
        this.def = new Defense();
        this.armor = new Armor();
        this.cha = new Charisma();
    }
    //Dexterity dex = new Dexterity();
    //Endurince con = new Endurince();
    //Intelligence Intel = new Intelligence();
    //Strength str = new Strength();
    //Wisdom wis = new Wisdom();
}
