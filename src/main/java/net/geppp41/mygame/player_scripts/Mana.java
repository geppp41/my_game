package player_scripts;


public class Mana {

    public static double Spend_mana(double mana, double cost) {
        return(mana-cost);
    }
    public static double Poation_mana_recover(double mana, float heal_percent) {
        return(mana * (double) heal_percent);
    }
    public static double Recover_mana(double mana, float heal_amount){
        return(mana+heal_amount);
    }
}
