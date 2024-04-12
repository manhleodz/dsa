package g.dsa.hw2.ex2.InputN;

public class SortingAlgorithms {
    // Thuật toán sắp xếp nổi bọt (bubble sort)
    public static void bubbleSort(Number[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Hoán đổi hai phần tử
                    Number temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Thuật toán sắp xếp chọn (selection sort)
    public static void selectionSort(Number[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng từ vị trí i đến cuối
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử tại vị trí i
            Number temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Thuật toán sắp xếp chèn (insertion sort)
    public static void insertionSort(Number[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            // Lấy phần tử tại vị trí i
            Number key = array[i];
            // So sánh phần tử này với các phần tử trước đó trong mảng
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
                // Dời các phần tử lớn hơn key sang phải một vị trí
                array[j + 1] = array[j];
                j--;
            }
            // Chèn key vào vị trí thích hợp
            array[j + 1] = key;
        }
    }

    // Thuật toán sắp xếp trộn (merge sort)
    public static void mergeSort(Number[] array) {
        int n = array.length;
        if (n < 2) {
            return; // Mảng có ít hơn 2 phần tử thì không cần sắp xếp
        }
        // Chia mảng thành hai nửa
        int mid = n / 2;
        Number[] left = new Number[mid];
        Number[] right = new Number[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        // Sắp xếp đệ quy hai nửa mảng
        mergeSort(left);
        mergeSort(right);
        // Trộn hai nửa mảng đã sắp xếp vào mảng ban đầu
        merge(array, left, right);
    }

    // Hàm trộn hai mảng đã sắp xếp vào một mảng
    private static void merge(Number[] array, Number[] left, Number[] right) {
        int i = 0; // Chỉ số của mảng trái
        int j = 0; // Chỉ số của mảng phải
        int k = 0; // Chỉ số của mảng kết quả
        int nL = left.length;
        int nR = right.length;
        while (i < nL && j < nR) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        // Sao chép các phần tử còn lại của mảng trái (nếu có)
        while (i < nL) {
            array[k] = left[i];
            i++;
            k++;
        }
        // Sao chép các phần tử còn lại của mảng phải (nếu có)
        while (j < nR) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    // Thuật toán sắp xếp nhanh (quick sort)
    public static void quickSort(Number[] array) {
        int n = array.length;
        quickSort(array, 0, n - 1); // Gọi hàm đệ quy với toàn bộ mảng
    }

    // Hàm đệ quy sắp xếp nhanh một đoạn của mảng từ vị trí low đến high
    private static void quickSort(Number[] array, int low, int high) {
        if (low < high) {
            // Tìm vị trí chốt (pivot) để chia mảng thành hai phần
            int pivotIndex = partition(array, low, high);
            // Sắp xếp đệ quy hai phần của mảng
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Hàm tìm vị trí chốt và hoán đổi các phần tử trong mảng sao cho các phần tử nhỏ hơn hoặc bằng chốt nằm bên trái và các phần tử lớn hơn chốt nằm bên phải
    private static int partition(Number[] array, int low, int high) {
        Number pivot = array[high]; // Chọn phần tử cuối cùng làm chốt
        int i = low - 1; // Chỉ số của phần tử nhỏ nhất trong đoạn từ low đến high - 1
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                // Nếu phần tử tại vị trí j nhỏ hơn hoặc bằng chốt
                i++; // Tăng i lên một đơn vị
                // Hoán đổi phần tử tại vị trí i và j
                Number temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Hoán đổi phần tử tại vị trí i + 1 và high (chốt)
        Number temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        // Trả về vị trí của chốt sau khi hoán đổi
        return i + 1;
    }
}
