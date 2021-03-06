package lesson6.battleunit;

abstract public class BattleUnit implements ISpeakerUnit { //абстрактный класс может иметь методы без реализации
    //абстрактный класс не обязан реал методы интерфейса
//    private int health;
//    private int attackScore;
    protected int health;
    protected int attackScore;

    public BattleUnit(int health, int attackScore) {
        this.health = health;
        this.attackScore = attackScore;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public boolean isAlive(){
        return health > 0;
    }
    abstract public  void attack (BattleUnit enemy);
}
