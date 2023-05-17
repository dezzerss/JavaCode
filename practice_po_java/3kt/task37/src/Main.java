import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во игроков:");
        int numPlayers = sc.nextInt();
        System.out.println("Введите номер игрока, с которого начинается игра:");
        int startPlayer = sc.nextInt();

        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(i);
        }
        int currentIndex = startPlayer - 1;
        List<Integer> eliminatedPlayers = new ArrayList<>();
        while (players.size() > 1) {
            currentIndex = (currentIndex + 2) % players.size();
            eliminatedPlayers.add(players.remove(currentIndex));
        }
        System.out.println("Выбывшие игроки:");
        for (int player : eliminatedPlayers) {
            System.out.print(player + " ");
        }
        System.out.println("\nПобедитель: " + players.get(0));
    }
}