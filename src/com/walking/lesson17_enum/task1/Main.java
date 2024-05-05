package com.walking.lesson17_enum.task1;

import com.walking.lesson17_enum.task1.answer.GreetingType;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3/Task2SwitchCase.java">...</a>
 * через enum. В т.ч. реализуйте в enum'е поиск значения по фразе,
 * введенной пользователем. Напоминаю, что enum'ы могут содержать поля.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String word = scanner.nextLine();
        scanner.close();

        GreetingType answer = GreetingType.findGreetingAnwer(word);

        System.out.println(answer.getAnswer());
    }
}
