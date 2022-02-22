/*
 Дан массив целых чисел. Необходимо реализовать метод, который возвращает индексы массива,
 значения которых в сумме дают число переданное в массив.
 Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
 Один и тот же элемент не может быть использован дважды.

     array = [3, 8, 15, 17], Number = 23
    result = [1,2]

     */

    public class Task1 {

        private static int[] FindSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            return new int[] {};
        }

    }
