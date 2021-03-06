package lesson04.part01;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


/**
 * Ввести с клавиатуры 10 чисел и заполнить ими список.
 * Вывести их в обратном порядке. Каждый элемент - с новой строки.
 * Использовать только цикл for.
 *
 * Подсказка:
 * Не забудь импортировать класс: java.util.ArrayList;
 *
 * Требования:
 * 1.	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
 * 2.	Считай 10 целых чисел с клавиатуры и добавь их в список.
 * 3.	Выведи числа в обратном порядке.
 * 4.	Используй цикл for.
 */

public class Task05 {
  public static void main(String[] args) throws IOException {
   Scanner in=new Scanner(System.in);
    ArrayList<Integer> ch=new ArrayList<>();
    for(int i=0;i<10;i++){
      ch.add(i,in.nextInt());
    }
    for(int i =9;i>=0;i--){
      System.out.println(ch.get(i));
    }
    //напишите тут ваш код
  }
}
