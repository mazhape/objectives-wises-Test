package LoopConstructs;

public class PointTest {
    public static void main(String[] args) {
        public void method1(int i) {
            int j = (i * 30 - 2) / 100;

            POINT1: for (; j < 10; j++) {
                boolean flag = false;
                while (!flag) {
                    if (Math.random() > 0.5) {
                        break POINT1; // Exit the for loop if condition is met
                    }
                    flag = true; // Set flag to true to exit the while loop
                }
            }

            // This while loop is outside the labeled for loop
            while (j > 0) {
                System.out.println(j--);
                if (j == 4) {
                    break; // This will exit the while loop, not the for loop
                }
            }
        }
    }
}
