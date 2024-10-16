package org.example;
import lombok.RequiredArgsConstructor;


import java.util.HashMap;
import java.util.Random;
@RequiredArgsConstructor

public class Game {
    private Random random = new Random();

    public HashMap<Integer, String> startGame(int doorsNumber,int count, boolean changeDoor) {
        HashMap<Integer, String> result = new HashMap<>();

        for (int i = 0; i < count; i++) {
            int doorWIthCar = random.nextInt(doorsNumber);
            int playerChoice = random.nextInt(doorsNumber);

            if (!changeDoor) {
                result.put(i, playerChoice == doorWIthCar ? "победа" : "проигрыш");
            } else {
                int otherDoor = -1;
                for (int j = 0; j < doorsNumber; j++) {
                    if (j != doorWIthCar && j != playerChoice) {
                        otherDoor = j;
                        break;
                    }
                }
                for (int j = 0; j < doorsNumber; j++) {
                    if (j != otherDoor && j != playerChoice) {
                        // Новый выбор игрока
                        result.put(i, j == doorWIthCar ? "победа" : "проигрыш");
                        break;
                    }
                }
            }
        }
        return result;
    }






}
