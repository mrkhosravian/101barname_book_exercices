public class _026 {
    public static void main(String[] args) {
        StringBuilder row = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            row.delete(0, row.length());
            for (int j = 1; j <= 10; j++) {
                row.append(i * j).append("\t");
            }
            System.out.println(row);
        }
    }
}
