public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int[] age = new int[5];
        age[0] = 10;
        System.out.println(age[0]);
        System.out.println(arr.length);
        for (int j : arr) {
            System.out.println(j);
        }
        int result = 0;
        for (int iterator : arr) {
            result += iterator;
        }
        System.out.println("Result: " + result);

        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Buddy", "Golden Retriever");
        dogs[1] = new Dog();

        System.out.println(dogs[1]);

        for (Dog dog : dogs) {
            if (dog != null) {
                System.out.println(dog.getName() + " is a " + dog.getBreed());
            }
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrix2 = new int[3][];
        matrix2[0] = new int[3];
        matrix2[1] = new int[3];
        matrix2[2] = new int[3];


        System.out.println(matrix[2][2]);
        int[][][] threeDArray = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };
    }
}