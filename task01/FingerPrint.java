package Lesson06.task01;

public class FingerPrint implements UnlockMethod {

    private String fingerprint;

    public FingerPrint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    @Override
    public void unlockPhone() {
        System.out.println("Сканирование отпечатка пользователя");
        System.out.println("Разблокировка по отпечатку пальца осуществлена");
    }

}
