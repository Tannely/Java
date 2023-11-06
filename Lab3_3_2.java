public class Lab3_3_2 {
    /*Знайти і надрукувати кількість значень від’ємних елементів матриці */
    public static void main(String[] args) {
        int[][] matrix = {{1, -2, -4}, {5, -7, 8}, {10, 11, -12}};
        int countNegative = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    countNegative++;
                }
            }
        }
        System.out.println("Кількість від'ємних елементів матриці: " + countNegative);
    }
    
}
