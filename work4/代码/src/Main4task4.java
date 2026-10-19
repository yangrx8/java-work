public class Main4task4 {
    public static void main(String[] args) {

        try {Character c = characterFactory.createCharacter(null);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续运行");

        Character c = characterFactory.createCharacter(CharacterType.CASTER);
        c.attack();

        Character s = characterFactory.createCharacter(CharacterType.SABER);
        s.attack();

        Character a = characterFactory.createCharacter(CharacterType.ARCHER);
        a.attack();

    }
}
