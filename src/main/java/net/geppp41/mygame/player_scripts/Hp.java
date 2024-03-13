package player_scripts;

public class Hp {
    long hp = 100L;
    int level = 0;
    public static long player_damage(long hp, int armor, int defense, long damage, String damage_type) {
        return(((hp * defense) *(long) armor) - damage);
    }
    public static long player_heal(long hp, float heal_percent) {
        return(hp + (hp* (long)heal_percent));
    }
}
