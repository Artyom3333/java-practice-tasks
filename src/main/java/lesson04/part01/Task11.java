package lesson04.part01;

import java.util.Stack;

/**
 * Написать пять методов, которые вызывают друг друга.
 * Каждый метод должен возвращать свой StackTrace.
 *
 * Требования:
 * 1.	В классе должно быть 5 методов (метод main не учитывать).
 * 2.	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
 * 3.	Каждый метод должен возвращать свой StackTrace.
 * 4.	Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
 */

public class Task11 {

  public static void main(String[] args) {
    method1();
  }

  public static StackTraceElement[] method1() {
    method2();
    StackTraceElement[] StackTrace=Thread.currentThread().getStackTrace();
    //напишите тут ваш код
    return StackTrace;
  }

  public static StackTraceElement[] method2() {
    method3();
    StackTraceElement[] StackTrace=Thread.currentThread().getStackTrace();
    //напишите тут ваш код
    return StackTrace;
  }

  public static StackTraceElement[] method3() {
    method4();
    StackTraceElement[] StackTrace=Thread.currentThread().getStackTrace();
    //напишите тут ваш код
    return null;
  }

  public static StackTraceElement[] method4() {
    method5();
    StackTraceElement[] StackTrace=Thread.currentThread().getStackTrace();
    //напишите тут ваш код
    return StackTrace;
  }

  public static StackTraceElement[] method5() {
    StackTraceElement[] StackTrace=Thread.currentThread().getStackTrace();
    //напишите тут ваш код
    return StackTrace;
  }
}
