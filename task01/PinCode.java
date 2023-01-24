package Lesson06.task01;

public class PinCode implements UnlockMethod {

    private int pincode;

    public PinCode(int pincode) {
        this.pincode = pincode;
    }

    public int getPincode() {
        return pincode;
    }

    @Override
    public void unlockPhone() {
        System.out.println("Ввод пин-кода");
        System.out.println("Разблокировка по пин-коду осуществлена");
    }

}
