/**Задача 1 : Напишите обобщенный метод printElement, который принимает один
 *  параметр типа T и выводит его на консоль.

В этом примере мы объявляем обобщенный метод printElement, который принимает
 один параметр типа T. Мы просто выводим этот элемент на консоль с 
 помощью метода System.out.println().

В методе main мы вызываем printElement с различными типами данных:
 целое число (Integer), строку (String) и число с плавающей запятой
  (Double). Компилятор автоматически выводит тип параметра T на
   основе переданных аргументов.

Таким образом, обобщенные методы позволяют нам писать код, который может
 работать с различными типами данных, обеспечивая простоту и гибкость
  использования. */


public class Task {
    public static void main(String[] args) {
       Gen<Integer>ob=new Gen<>(55);
       ob.showType(); 
       int  v= ob.getOb();
       System.out.println(v);
       Gen<String>iob=new Gen<String>("Строка");
       iob.showType();
       String s =iob.getOb();
       System.out.println(s);
       Gen<Double>dob=new Gen<Double>(5.25);
       dob.showType();
       Double d=dob.getOb();
       System.out.println(d);
    }
}
