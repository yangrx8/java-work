public class Caster implements Character{
    private String name;
    private String skill;

    public Caster() {
        this.name = "美狄亚";
        this.skill = "Rho Aias";
    }

    @Override
    public void attack() {
        System.out.println("[法师] " + this.name + " 使用 " + this.skill + " 发动攻击!");
    }

}
