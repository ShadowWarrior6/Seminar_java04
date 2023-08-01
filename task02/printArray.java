/**
 * Задача 2 : Напишите обобщенный метод printArray, который принимает массив
 *  любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает
 массив типа T. Затем мы используем цикл for-each,
  чтобы пройти по всем элементам массива и вывести их на консоль.

В методе main мы создаем массивы типов Integer и String и вызываем printArray
 для каждого из них. В результате мы получаем вывод на консоль
  элементов каждого массива.

Таким образом, обобщенные методы позволяют нам создавать код, который может 
работать с разными типами данных, обеспечивая повторное использование
 и гибкость.
 */




package task02;

public class printArray {
    public static <T> void printArray(T[] inputArray){
        for (T element : inputArray) {
            System.out.printf("%s",element );
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4,5};
        
        Character[] charAray={'H','e','l','l','o'};

        System.out.println("Массив integerArray содержит:");
        printArray(intArray);

       

        System.out.println("\nМассив characterArray содержит:");
        printArray(charAray);
    }
}
