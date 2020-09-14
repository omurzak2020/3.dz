package com.company;

public class Main {

    public static void main(String[] args) {
	double[]massiv = {42.12,42.31,-31.6,95.32,-42.33,
            45.44,55.33, 75.15,-63.45,452.12,32.01,
            56.11,78.99,445.11,11.01};
	boolean isStert = false;

	double positiveCount = 0;
	double summa = 0;
	int counter = 0;

        for (double i: massiv) {
            if (!isStert && i<0){
                isStert = true;
                continue;
            }
            else if (isStert && i>0){
                positiveCount +=i;
                counter++;
            }
            summa = positiveCount / counter;
        }


        for (double i = 0; i < massiv.length; i++) {
            if (massiv[(int) i] <= -1000) {
            } else System.out.println(massiv[(int) i]);
        }
        System.out.println("Кольичеcтво не целых сичлей: " + massiv.length);
            System.out.println("Результат " + positiveCount);
        System.out.println(counter);
        System.out.println(summa);


    }
}

/*
 Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных
 после первого отрицательного числа и вывести его на экран
ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию
 выбирать самый минимальный элемент и смещать его в начало. При этом каждую
  новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго и т.д.
И при каждой итерации распечатывать текущее состояние массива
Дэдлайн 12.08.2020 23 59
  */



