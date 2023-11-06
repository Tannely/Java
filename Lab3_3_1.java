public class Lab3_3_1 {
    /* Для кожного рядка матриці знайти і надрукувати суму значень елементів, 
    розміщених в стовпцях з парними номерами*/
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j += 2) {
                sum += matrix[i][j];
            }
            System.out.println("Сума елементів рядка " + (i + 1) + ", розміщених в стовпцях з парними номерами: " + sum);
        }
    }
    
}
