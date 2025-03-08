package ru.stepup.oop;

/*
Практика ООП. Объекты и классы #2. Линия
Создайте класс Линия (Line), расположенную на двумерной плоскости, которая описывается:

Координата начала: Точка
Координата конца: Точка
Создается одним из следующих способов:
с указанием двух Точек
с указанием четырех целых чисел (x y начала и x y конца)
Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
Может вернуть длину Линии. Для расчёта длины следует использовать формулу расчёта гипотенузы: корень суммы квадратов катетов. Для извлечения корня можно использовать Math.sqrt.
Под Точкой имеется ввиду класс, созданный в задании 1 (точка координат).

Создайте три объекта Линии таким образом, чтобы:

Линия 1 начиналась в Точке  {1;3} и кончалась в Точке {5;8}.
Линия 2 начиналась в Точке {10;11} и кончалась в Точке {15;19}
Линия 3 начиналась в Точке конца Линии 1, а кончалась в Точке начала Линии 2
Используя эти объекты, выполните следующее:

Выведите текстовое представление Линии 3 на экран
Измените координаты точек начала и конца Линии 3 таким образом, чтобы изменились все три объекта Линии
Выведите текстовое представление Линии 3 на экран после изменения её состояния
Рассчитайте суммарную длину всех трех линий и выведите её на экран
Подсказка:

·       текстовое представление объекта лучше реализовывать в переопределенном методе toString().

·       наименование метода расчета длины линии - getLength
*/

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(5,8);

        Line l1 = new Line(p1,p2);
        Line l2 = new Line(10,11,15,19);
        Line l3 = new Line(p2, l2.getP1());

        System.out.println(l1 + "\nДлина: " + l1.getLength());
        System.out.println(l2 + "\nДлина: " + l2.getLength());
        System.out.println(l3 + "\nДлина: " + l3.getLength());

        l3.setP1(19,19);
        l3.setP2(0,0);

        System.out.println("\n" + l1 + "\nДлина: " + l1.getLength());
        System.out.println(l2 + "\nДлина: " + l2.getLength());
        System.out.println(l3 + "\nДлина: " + l3.getLength());

        System.out.println("\nСуммарная длина всех трех линий: " + (l1.getLength() + l2.getLength() + l3.getLength()));
    }
}