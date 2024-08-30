import java.util.Scanner;

public class IO {
    public static Scanner input(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static void menu(){
        StringBuilder model = new StringBuilder();
        model.append("VAMOS JOGAR CAÇA NIQUEL");
        model.append("\n");
        model.append("Escolha o nivel de dificuldade para começar o jogo");
        model.append("\n");
        model.append("easy, medium or hard");
        System.out.println(model);

    }
}
