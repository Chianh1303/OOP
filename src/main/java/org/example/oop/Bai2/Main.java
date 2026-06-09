package org.example.oop.Bai2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- MÔ PHỎNG CÔNG TẮC VÀ BÓNG ĐÈN --- \n");

        // 1. Khởi tạo đối tượng
        FlashLamp lamp = new FlashLamp();
        SwitchButton switchButton = new SwitchButton();

        // 2. Kết nối công tắc với bóng đèn
        switchButton.connectToLamp(lamp);

        // 3. Thực hiện bật/tắt lặp lại 10 lần (Dùng vòng lặp for)
        for (int i = 1; i <= 5; i++) {
            System.out.println("=== Lần lặp thứ " + i + " ===");

            switchButton.switchOn();  // Bật công tắc
            lamp.light();             // Xem đèn thế nào

            switchButton.switchOff(); // Tắt công tắc
            lamp.light();             // Xem đèn thế nào
            System.out.println();     // Xuống dòng cho đẹp
        }
    }
}
