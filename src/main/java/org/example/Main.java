package org.example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*В качестве задачи предлагаю вам реализовать код для демонстрации парадокса Монти Холла (Парадокс Монти Холла — Википедия ) и наглядно убедиться в верности парадокса
(запустить игру в цикле на 1000 и вывести итоговый счет).
Необходимо:
Создать свой Java Maven или Gradle проект;
Подключить зависимость lombok.
Можно подумать о подключении какой-нибудь математической библиотеки для работы со статистикой
Самостоятельно реализовать прикладную задачу;
Сохранить результат в HashMap<шаг теста, результат>
Вывести на экран статистику по победам и поражениям
*/
        Game game = new Game();
        HashMap<Integer,String> withChanging = game.startGame(3,1000,true);
        HashMap<Integer,String> withoutChanging = game.startGame(3,1000,false);


        Multiset<String> multiset = HashMultiset.create(withChanging.values());
        Multiset<String> multiset2 = HashMultiset.create(withoutChanging.values());
        System.out.println("Если игрок решает поменять дверь" + multiset);
        System.out.println("Если игрок решает не менять дверь" + multiset2);

    }
}