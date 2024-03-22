package interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SortArray sortArray = new SortArray();
        Product macbook = new Product("MacBook", 95_000, 10);
        Product lenovo = new Product("Lenovo", 125_000, 8);
        Product asus = new Product("Asus", 75_000, 20);
        Product xiaomi = new Product("Xiaomi", 85_000, 12);
        Product huawei = new Product("Huawei", 80_000, 7);
        Product tecno = new Product("Tecno", 75_000, 7);
        Product acer = new Product("Acer", 75_000, 13);
        Product[] productArray = {macbook, lenovo, acer, asus, xiaomi, huawei, tecno};

        final int[] intArray = {4, 3, 10, 7, 5, 9, 1, 6, 2, 8};

        System.out.println(Arrays.toString(intArray));
        sortArray.sortIntArray(intArray);
        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.toString(productArray));
        sortArray.sortProductArrayByPrice(productArray);
        System.out.println(Arrays.toString(productArray));

        sortArray.sortProductArrayByCount(productArray);
        System.out.println(Arrays.toString(productArray));

    }
}
