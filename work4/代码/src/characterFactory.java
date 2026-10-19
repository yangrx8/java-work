public class characterFactory {
    public static Character createCharacter(CharacterType type) {
        if(type == null) {
            throw new IllegalArgumentException("角色类型不能是null");
        }

        if (type == CharacterType.SABER) {
            return new Saber();
        }

        if (type == CharacterType.ARCHER) {
            return new Archer();
        }

        if (type == CharacterType.CASTER) {
            return new Caster();
        }
        throw new IllegalArgumentException();

    }
}
