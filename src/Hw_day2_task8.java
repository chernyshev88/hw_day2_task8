import java.util.Arrays;

public class Hw_day2_task8 {
    public static void main(String[] args) {
        System.out.println("Дан массив: 1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2");
        int[] a = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int sum_positive = 0;
        Arrays.sort(a);
        System.out.println("Максимальное значение:" + a[a.length - 1]);
        System.out.println("Сумма положительных эл-ов:" + sum_positive(a));
        System.out.println("Сумма четных отрицательных эл-ов:" + sum_even_negative(a));
        System.out.println("Кол-во положительных эл-ов:" + count_positive(a));
        System.out.println("Среднее арифметическое отрицательных эл-ов:"+negative_arithmetic_mean(a));


    }

    public static int sum_positive(int[] a) {
        int sum = 0;
        for (int x : a) {
            if (x > 0) {
                sum = sum + x;
            }
        }
        return sum;
    }

    public static int sum_even_negative(int[] a) {
        int sum = 0;
        for (int x : a) {
            if (x < 0 && x % 2 == 0) {
                sum = sum + x;
            }
        }
        return sum;
    }

    public static int count_positive(int[] a) {
        int count = 0;
        for (int x : a) {
            if (x > 0) {
                count++;
            }
        }
        return count;
    }
    public static double negative_arithmetic_mean(int[] a){
        int sum=0;
        int count=0;
        for (int x : a){
           if(x<0){
               sum=sum+x;
               count++;
           }
        }
       return (double) sum/count;
    }
}