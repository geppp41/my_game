package player_scripts;

public class Mana {
    double mana = 100;
    int level = 0;
    public static double Spend_mana(double mana, double cost) {
        return(mana-cost);
    }
    public static double Recover_mana(double mana, float heal_percent) {
        return(mana * (double) heal_percent);
    }
}
