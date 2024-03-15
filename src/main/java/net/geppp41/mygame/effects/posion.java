package effects;
import player_scripts.Hp;
import player_scripts.player;
@SuppressWarnings("unused")
public class posion {
    public int[] durriation = {0, 1, 2, 4, 6, 10}; // each postion is a different effect level
    public static long poison_damage(long hp, player player) {
        return(player.hp );
    }
}
