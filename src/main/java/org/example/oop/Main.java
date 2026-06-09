package org.example.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- CÂU CHUYỆN ADAM VÀ EVA TRÊN JAVA ---");

        // Khởi tạo các đối tượng đúng theo yêu cầu
        Apple apple = new Apple();
        Human adam = new Human("Adam", "Nam", 70);
        Human eva = new Human("Eva", "Nữ", 50);

        // Kịch bản trò chuyện ban đầu
        adam.say("Chào Eva, quả táo này nhìn chín mọng ngon quá!");
        eva.say("Anh ăn trước một miếng đi!");

        System.out.println("\n[Bắt đầu] Khối lượng quả táo ban đầu: " + apple.getWeight() + " đơn vị.\n");

        // Vòng lặp chạy cho đến khi quả táo hết khối lượng
        while (!apple.isEmpty()) {

            // Đến lượt Adam ăn (nếu táo chưa hết)
            if (!apple.isEmpty()) {
                adam.eat(apple);
            }

            // Đến lượt Eva ăn (nếu táo chưa hết)
            if (!apple.isEmpty()) {
                eva.eat(apple);
            }

            System.out.println("--> Táo còn lại: " + apple.getWeight() + " đơn vị.\n");
        }

        System.out.println("--- KẾT THÚC CÂU CHUYỆN: QUẢ TÁO ĐÃ ĐƯỢC ĂN HẾT! ---");
    }
}
