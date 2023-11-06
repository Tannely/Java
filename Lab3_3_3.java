import java.util.Random;
;
public class Lab3_3_3 {
    /* Заповнити квадратну матрицю випадковими числами (функція). 
    Написати функцію для пошуку мінімального елемента в зазначеному рядку. 
    Зрушити елементи цього рядка циклічно вліво на кількість елементів, 
    рівну мінімальному елементу рядка. Вивести вихідну й отриману матриці  (функція).
     */

/*    public static void main(String[] args) {
        int n = 5; // розмір квадратної матриці
        int[][] matrix = new int[n][n];
        
        // заповнюємо матрицю випадковими числами в діапазоні [-50, 50]
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(101) - 50;
            }
        }
        
        // виводимо вихідну матрицю на екран
        System.out.println("Вихідна матриця:");
        //printMatrix(matrix);
        System.out.println(matrix);
        
        int row = 2; // номер рядка, який треба зсунути
        int minElement = findMinElement(matrix, row); // знаходимо мінімальний елемент рядка
        shiftRowLeft(matrix, row, minElement); // зсуваємо елементи рядка
        System.out.println("Матриця після зсуву рядка " + row + " на " + minElement + " елементів вліво:");
        //printMatrix(matrix);
        System.out.println(matrix);
    }
    
 
    public static int findMinElement(int[][] matrix, int row) {
        int minElement = matrix[row][0];
        for (int j = 1; j < matrix[row].length; j++) {
            if (matrix[row][j] < minElement) {
                minElement = matrix[row][j];
            }
        }
        return minElement;
    }
    
    public static void shiftRowLeft(int[][] matrix, int row, int shiftAmount) {
        int n = matrix.length;
        shiftAmount = shiftAmount % n; // якщо shiftAmount більше за n сувати треба на shiftAmount % n елементів
        if (shiftAmount == 0) { // якщо зсувати не треба, виходимо з функції
            return;
        }
        // створюємо тимчасовий масив для зберігання зсунутих елементів
        int[] temp = new int[n];
        for (int j = 0; j < n; j++) {
            temp[(j - shiftAmount + n) % n] = matrix[row][j];
        }
        // копіюємо зсунуті елементи назад в матрицю
        for (int j = 0; j < n; j++) {
            matrix[row][j] = temp[j];
        }
    }
    */

    
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5, 10);
        System.out.println("Згенерована матриця:");
        printMatrix(matrix);
        
        int rowToShift = 3;
        int minElement = findMinElementInRow(matrix, rowToShift);
        shiftRowLeft(matrix, rowToShift, minElement);
        
        System.out.println("Матриця після зсуву рядка " + rowToShift + " вліво на " + minElement + " елементів:");
        printMatrix(matrix);
    }
    
   
    public static int[][] generateMatrix(int n, int maxValue) {
        int[][] matrix = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(maxValue + 1);
            }
        }
        return matrix;
    }
    
   
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
   
    public static int findMinElementInRow(int[][] matrix, int row) {
        int minElement = matrix[row][0];
        int n = matrix.length;
        for (int j = 1; j < n; j++) {
            if (matrix[row][j] < minElement) {
                minElement = matrix[row][j];
            }
        }
        return minElement;
    }
    
    public static void shiftRowLeft(int[][] matrix, int row, int shiftAmount) {
        int n = matrix.length;
        int[] rowArray = new int[n];
        // Скопіюємо елементи рядка в одновимірний масив
        for (int j = 0; j < n; j++) {
            rowArray[j] = matrix[row][j];
        }
        // Зсуваємо елементи масиву вліво на shiftAmount елементів
        for (int i = 0; i < shiftAmount; i++) {
            int temp = rowArray[0];
            for (int j = 0; j < n - 1; j++) {
                rowArray[j] = rowArray[j + 1];
            }
            rowArray[n - 1] = temp;
        }
        // Перезаписуємо елементи рядка зміненими значеннями з масиву
        for (int j = 0; j < n; j++) {
            matrix[row][j] = rowArray[j];
        }
    }

}
