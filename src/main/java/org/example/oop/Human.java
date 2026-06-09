package org.example.oop;

public class Human {
    private String name;
    private String gender;
    private int weight;

    // Constructor để khởi tạo một con người cụ thể
    public Human(String name, String gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    // Phương thức biết nói
    public void say(String words) {
        System.out.println(this.name + " nói: \"" + words + "\"");
    }

    // Kiểm tra khối lượng quả táo
    public int checkApple(Apple apple) {
        return apple.getWeight();
    }

    // Phương thức ăn táo: nhận vào chính đối tượng quả táo đang có trong vườn
    public void eat(Apple apple) {
        if (this.checkApple(apple) > 0) {
            apple.decrease(); // Giảm 1 đơn vị của quả táo
            this.weight++;    // Tăng 1 đơn vị cân nặng của người ăn
            System.out.println(this.name + " vừa ăn 1 miếng táo. Cân nặng hiện tại: " + this.weight + " kg.");
        } else {
            System.out.println(this.name + " định ăn nhưng táo đã hết mất rồi!");
        }
    }

    // Các hàm Getter để đối tượng khác có thể xem thông tin
    public String getName() { return name; }
    public String getGender() { return gender; }
    public int getWeight() { return weight; }
}
