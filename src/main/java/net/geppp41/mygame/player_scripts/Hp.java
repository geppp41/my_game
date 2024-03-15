package player_scripts;

public class Hp {
    public static long player_damage(long hp, int armor, int defense, long damage, String damage_type) {
        return(((hp * defense) *(long) armor) - damage);
    }
    public static long player_damage1(player player, String damage_type, int damage) {
        if(damage_type == "magic") {
            return(((player.hp * player.def)*player.armor)-damage*(long)player.magic_res);
        } //add blunt slash stab burn exploshion damages
        return((player.hp * player.def)*player.armor );
    }
    public static long player_heal(long hp, float heal_percent) {
        return(hp + (hp* (long)heal_percent));
    }
}
