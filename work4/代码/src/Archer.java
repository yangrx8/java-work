public class Archer implements Character {
    private String name;
    private String skill;

    public Archer() {
        this.name = "卫宫";
        this.skill = "Unlimited Blade Works";
    }

    @Override
    public void attack() {
        System.out.println("[弓兵] " + this.name + " 使用 " + this.skill + " 发动攻击!");
    }

}
