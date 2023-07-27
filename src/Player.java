public class Player
{
    String name;
    int healthPercentage;
    Weapon weapon;

    public enum Weapon {
        Sword,Axe,Bow,Staff
    }
    public Player(String name,int healthPercentage
    ,Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.min(100,Math.max(0,healthPercentage));
        this.weapon = weapon;
    }
    public  int healthRemaining() {
        return Math.max(0, healthPercentage);
    }
    public void loseHealth(int damage) {
        healthPercentage = Math.max(0,healthPercentage- damage);
        if(healthPercentage == 0) {
            System.out.println(name + "player has been knocked out of the game");
        }
    }
    public  void restoreHealth(int healthPotion) {
        healthPercentage = Math.min(100,healthPercentage+healthPotion);
    }

    public static void main(String[] args) {
        Player player1 = new Player("Alice ",90, Weapon.Sword );
        Player player2 = new Player("bob ",110, Weapon.Bow);
        Player player3 = new Player("Eve ",-20, Weapon.Staff);

        System.out.println(player1.healthRemaining());
        player1.loseHealth(30);
        System.out.println(player1.healthRemaining());
        player1.restoreHealth(80);
        System.out.println(player1.healthRemaining());
        player1.loseHealth(100);
        System.out.println(player1.healthRemaining());
        System.out.println(player3.healthRemaining());
    }
}

