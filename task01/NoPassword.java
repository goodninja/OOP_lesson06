package Lesson06.task01;

public class NoPassword implements UnlockMethod {

    private String nopassword;

    public NoPassword(String nopassword) {
        this.nopassword = nopassword;
    }

    public String getNopassword() {
        return nopassword;
    }

    @Override
    public void unlockPhone() {
        System.out.println("Для разблокировки нажмите любую клавишу");
        System.out.println("Телефон разблокирован");
    }

}
