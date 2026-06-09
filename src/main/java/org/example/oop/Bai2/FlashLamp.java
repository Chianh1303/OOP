package org.example.oop.Bai2;

public class FlashLamp {
    private boolean status; // true: bật, false: tắt

    // Constructor mặc định bóng đèn mới tạo sẽ tắt
    public FlashLamp() {
        this.status = false;
    }

    // Phương thức thay đổi trạng thái dựa trên tín hiệu công tắc gửi vào
    public void setStatus(boolean status) {
        this.status = status;
    }

    // Phương thức hiển thị trạng thái hiện tại ra màn hình
    public void light() {
        if (status) {
            System.out.println("Bóng đèn đang SÁNG (ON)");
        } else {
            System.out.println("Bóng đèn đang TẮT (OFF)");
        }
    }
}
