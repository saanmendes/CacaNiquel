public enum Fruits {
    BANANA("banana",10),
    STRAWBERRY("morango", 20),
    STAR("estrela",40);

    private String name;
    private int score;

    Fruits(String name, int score){
        this.name = name;
        this.score= score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return
                name + " "
                + score;
    }
}
