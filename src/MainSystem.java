import java.util.Random;
import java.util.Scanner;

public class MainSystem {
    private String optionLevel = "";
    private int scoreTotal = 0;

    public void run(){
        IO.menu();
        while (!optionLevel.equals("easy") && !optionLevel.equals("medium") && !optionLevel.equals("hard")){
                optionLevel = scanner.nextLine().trim();
                addScore();
        }
    }

    public void addScore() {
        int level;
        if (optionLevel.equals("easy")) {
            level = 3;
        } else if (optionLevel.equals("medium")) {
            level = 5;
        } else if (optionLevel.equals("hard")) {
            level = 10;
        } else {
            System.out.println("Nível de dificuldade invalido");
            return;
        }
        for (int index = 0; index < level; index++){
            int randomIndex = gerador.nextInt(Fruits.values().length);
            Fruits chosenFruit = Fruits.values()[randomIndex];
            scoreTotal += chosenFruit.getScore();
            System.out.println("| " + chosenFruit + " |");
        }
        System.out.println("Total de pontos: " + scoreTotal);
    }


    public int getScoreTotal() {
        return scoreTotal;
    }
    Random gerador = new Random();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "MainSystem{" +
                "totalPontos=" + scoreTotal +
                ", gerador=" + gerador +
                '}';
    }
}

