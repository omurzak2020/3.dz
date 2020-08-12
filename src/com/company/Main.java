package com.company;

public class Main {

    public static void main(String[] args) {
	double[]massiv = {42.12,42.31,-31.6,95.32,-42.33,
            45.44,55.33, 75.15,-63.45,452.12,32.01,
            56.11,78.99,445.11,11.01,58.45};
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
        System.out.println(summa);
    }
}
