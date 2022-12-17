// 2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package homework_02;

import java.io.FileWriter;
import java.util.Arrays;

public class hw_2 {
    public static void main(String[] args) {

        int[] array = { 3, 5, 1, 7, 3, 9, 2, 0 };
        for (int j = array.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int n = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = n;

                }

            }
            try (FileWriter f = new FileWriter("../Семинары/homework_02/log-file.txt", true)) {
                f.write(Arrays.toString(array));
                f.write("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(Arrays.toString(array));

        }

    }
}
