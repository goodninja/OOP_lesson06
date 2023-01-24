package Lesson06.task01;

public class FaceID implements UnlockMethod {

    private String faceID;

    public FaceID(String faceID) {
        this.faceID = faceID;
    }

    public String getFaceID() {
        return faceID;
    }

    @Override
    public void unlockPhone() {
        System.out.println("Сканирование лица пользователя");
        System.out.println("Разблокировка посредством FaceID осуществлена");
    }

}