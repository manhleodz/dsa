package g.dsa.hw2_21000691_doanducmanh.ex2.InputN;

public class Number implements Comparable<Number>{
    private int value; // Giá trị số ngẫu nhiên

    // Hàm tạo với tham số là giá trị số ngẫu nhiên
    public Number(int value) {
        this.value = value;
    }

    // Hàm lấy giá trị số ngẫu nhiên
    public int getValue() {
        return value;
    }

    // Hàm so sánh hai số ngẫu nhiên theo giá trị
    @Override
    public int compareTo(Number other) {
        return this.value - other.value;
    }

    // Hàm biểu diễn số ngẫu nhiên dưới dạng chuỗi
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
