package items;
public class Item {
    public String name; // item name
    public String type; // what type of item is this
    public int armor; // how much armor item gives
    public int strength; // how much strength item gives
    public int endurance; // how much endurance item gives
    public int dexterity; // how much dexterity item gives
    public int intelligence; // how much intelligence item gives
    public int wisdom; // how much wisdom item gives
    public int charisma; // how much charisma item gives
    public int range; // how much range the item has
    public float magic_res; // how much magic resitence item gives
    public float quality; // item quality
    public double damage; // how much damage item does

    /**
    lets item get its stats on creation
     */
    public Item(String Name, String Type, int Armor, int Strength, int Endurance, int Dexterity, int Intelligence, int Wisdom, int Charisma, int Range, float Magic_res, double Damage, float Quality) {
        name = Name; type = Type; armor = Armor; strength = Strength; endurance = Endurance; dexterity = Dexterity; intelligence = Intelligence; wisdom = Wisdom; charisma = Charisma; range = Range; magic_res = Magic_res; damage = Damage; quality = Quality; 
    }
}