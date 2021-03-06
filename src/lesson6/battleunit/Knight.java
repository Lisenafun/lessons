package lesson6.battleunit;

public class Knight extends BattleUnit implements ISpeakerUnit {

    public Knight(int health, int attackScore) {
        super(health, attackScore);
    }
    private void addHealth(){
        if (this.health>1){
        this.health += 5;
        }
    }
    @Override
    public  void attack (BattleUnit enemy){
        enemy.health -= this.attackScore;
        addHealth();
    }

    @Override
    public void say(String text) {
        System.out.println("Рыцарь сказал" + text);

    }

    @Override
    public void sing(String song) {
        System.out.println("Поет песню" + song);

    }
}
