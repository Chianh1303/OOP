package org.example.oop.Bai2;

public class SwitchButton {
    private boolean status;   // Trạng thái công tắc
    private FlashLamp lamp;   // Đối tượng bóng đèn được kết nối

    public SwitchButton() {
        this.status = false;  // Mặc định công tắc tắt
        this.lamp = null;     // Chưa kết nối với đèn nào
    }

    // Phương thức kết nối công tắc với một bóng đèn cụ thể
    public void connectToLamp(FlashLamp lamp) {
        this.lamp = lamp;
    }

    // Phương thức bật công tắc
    public void switchOn() {
        this.status = true;
        System.out.print("-> Bật công tắc: ");
        if (lamp != null) {
            lamp.setStatus(true); // Gửi tín hiệu BẬT sang đèn
        }
    }

    // Phương thức tắt công tắc
    public void switchOff() {
        this.status = false;
        System.out.print("-> Tắt công tắc: ");
        if (lamp != null) {
            lamp.setStatus(false); // Gửi tín hiệu TẮT sang đèn
        }
    }
}
