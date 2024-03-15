package player_scripts;

public class player {
    public Long hp;
    public double mp;
    public int def;
    public int armor;
    public int Cha;
    public int Endurince;
    public int dex;
    public int INT;
    public int wisdom;
    public float magic_res;
    public Stats stats;
    public String name;
    public player(String Name) {
        this.hp = 100L;
        this.mp = 100;
        this.def = 10;
        this.armor = 0;
        this.Cha = 5;
        this.Endurince = 3;
        this.dex = 5;
        this.INT = 3;
        this.wisdom = 1;
        this.magic_res = 0.0f;
        this.stats = new Stats();
        this.name = Name;
    }
    //Dexterity dex = new Dexterity();
    //Endurince con = new Endurince();
    //Intelligence Intel = new Intelligence();
    //Strength str = new Strength();
    //Wisdom wis = new Wisdom();
}
