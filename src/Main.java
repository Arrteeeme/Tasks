import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // создаю массив
        int minArray = 2; // максимальная длинна подмассива
        List<int[]> result = sA(array, minArray); // вызов sA(splitArray)

        // вывод результата
        for (int[] min : result) {
            System.out.print(Arrays.toString(min));
        }
    }

    // функция принимает массив, и длинну подмассива
    public static List<int[]> sA(int[] array, int minArray) {
        List<int[]> result = new ArrayList<>();
        int length = array.length;

        // разбиваю массив
        for (int i = 0; i < length; i += minArray) {
            int end = Math.min(length, i + minArray); // конец текущего подмассива
            int[] min = Arrays.copyOfRange(array, i, end); // создание подмассива
            result.add(min); // добавление
        }
        return result;
    }
}