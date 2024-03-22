package interfaces;
public class SortArray {
    public void sortIntArray(final int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    final int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void sortProductArrayByPrice(final Product[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                final Product current = array[j];
                final Product next = array[j + 1];
                if (current.price > next.price) {
                    final Product temp = current;
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else if (current.price == next.price) {
                    if (current.count >= next.count) {
                        final Product temp = current;
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    public void sortProductArrayByCount(final Product[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                final Product current = array[j];
                final Product next = array[j + 1];
                if (current.count > next.count) {
                    final Product temp = current;
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
