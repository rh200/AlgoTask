/*
Дан массив целых чисел.
Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты

Пример:
Array: [4,5,6,6,8]
Result: true
Число 6 повторяется 2 раза

Array: [4,5,6,7,8]
Result: false
Дубликатов нет

 */


import java.util.Arrays;

public class Task2 {

    public static boolean Dublicates (int [] nums){

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1])
                return true
        }
            return false;
    }
}
