public class Saber implements Character {
    private String name;
    private String skill;

    public Saber() {
            this.name = "阿尔托莉雅";
            this.skill = "Excalibur";
        }

    public void attack() {
        System.out.println("[剑士] " + this.name + " 使用 " + this.skill + " 发动攻击!" );
    }
}
