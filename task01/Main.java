// Задача 1.
// Чтобы разблокировать телефон, пользователь может выбрать один из способов:
// • Без пароля
// • С пин-кодом (4-значное число)
// • По отпечатку пальца (кодируется строкой)
// • По распознаванию лица (кодируется строкой)
// Программист написал класс Unlocker, в котором хранятся поля от всех способов сразу:
// class Unlocker {
// private int mode; // режим
// private int pin; // на случай пин-кода
// private String fingerprint; // на случай отпечатка пальца
// private String faceID; // на случай лица
// }
// Здесь нарушен принцип SRP: класс имеет несколько незаивисимых причин меняться.
// Напишите решение, которое будет соответствовать SRP и OCP (мы хотим в будущем добавлять новые способы разблокировки).

package Lesson06.task01;

public class Main {
    public static void main(String[] args) {

        NoPassword noPassword = new NoPassword("любая клавиша для разблокировки");
        PinCode pinCode = new PinCode(0000);
        FingerPrint fingerPrint = new FingerPrint("отпечаток пальца");
        FaceID faceID = new FaceID("сканирование лица");

        System.out.println("Разблокировка без пароля:");
        noPassword.unlockPhone();
        System.out.println();

        System.out.println("Разблокировка посредством пин-кода:");
        pinCode.unlockPhone();
        System.out.println();

        System.out.println("Разблокировка по отпечатку пальца:");
        fingerPrint.unlockPhone();
        System.out.println();

        System.out.println("Разблокировка по FaceID:");
        faceID.unlockPhone();
        System.out.println();

    }

}
