package hu.helix.WA.WA_1206;

enum SortDirection {ASC, DESC}

public class Main {

    public static void main(String[] args) {

Ameoba ameoba =new Ameoba();
ameoba.drawBoard();


	Bird bird = new Bird();
	bird.move();
		System.out.println(bird.toString());

	Reptile reptile = new Reptile();
	reptile.move();
		System.out.println(reptile.toString());

	Mammal mammal = new Mammal();
	mammal.move();
		System.out.println(mammal.toString());


		int[] array = {1, 2, 6, 4, 3};

		insertionSort(array, SortDirection.DESC);



		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}
	}

	public static void insertionSort(int[] array, SortDirection sortDirection) {
		for (int i = 1; i < array.length; i++) {
			if (sortDirection.equals(SortDirection.ASC)) {
				int j = i;
				while (j > 0 && array[j] < array[j - 1]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					--j;
				}
			} else {
				int j = i;
				while (j > 0 && array[j] > array[j - 1]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					--j;


				}

			}

		}
	}


}
