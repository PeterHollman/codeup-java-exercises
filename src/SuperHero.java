class SuperHero extends newPerson {
    private String alterEgo;
    public SuperHero(String name, String alterEgo) {
        super(name);
        this.alterEgo = alterEgo;
    }
    public String getName() {
        return alterEgo;
    }
    public String getSecretIdentity() {
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");
        SuperHero theBetterManofSteel = new SuperHero("Tony Stark", "IronMan");

        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"
        System.out.println(theBetterManofSteel.getName());
        System.out.println(theBetterManofSteel.alterEgo);
    }
}
