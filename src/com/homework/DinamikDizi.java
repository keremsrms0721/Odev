package com.homework;

public class DinamikDizi {

	private static int arrayLength = 5;
	private static int[] myArray = new int[arrayLength];

	public static void main(String[] args) {
		
	}

	private static void ekle(int value) {
		System.out.println("a->" + arrayLength);
		for (int i = 0; i < arrayLength; i++) {
			if (myArray[i] == 0) {
				myArray[i] = value;
				break;
			}
		}
	}

	private static void sil(int veri) {
		for (int i = 0; i < arrayLength; i++) {
			if (myArray[i] == veri) {
				myArray[i] = 0;
			}
		}
	}

	private static void uzunluk() {
		int doluHucre = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (myArray[i] != 0) {
				i++;
			}
		}
		System.out.println("Dolu hucre sayisi -> " + doluHucre);
	}

	private static void kapasite() {
		System.out.println(arrayLength);
	}

	private static void temizle() {
		for (int i = 0; i < arrayLength; i++) {
			myArray[i] = 0;
		}
	}

	private static void controller() {
		if (myArray[arrayLength - 1] != 0) {
			arrayLength *= 2;
		}
	}

	private static void displayElement() {
		for (int i = 0; i < arrayLength; i++) {
			System.out.println(myArray[i]);
		}
	}

	private static void ekle(int value, int index) {
		myArray[index] = value;
	}

}
