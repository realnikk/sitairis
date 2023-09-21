package com.company;

public class JavaDeveloper extends BackendDeveloper implements CreateServerSide {
    @Override
    public void createITProduct() {
        System.out.println("Создавать серверную часть приложения");
    }
    @Override
    public void useProgrammingLanguage() {
        System.out.println("Использовать интерпретируемые ЯП");
    }
    @Override
    public void useSQL() {
        System.out.println("Использовать SQL");
    }
    @Override
    public void hashPassword() {
        System.out.println("Хэшировать пароль");
    }
    @Override
    public void useFrameworks() {
        System.out.println("Использовать фрэймворк Spring");
    }
    @Override
    void useIDE() {
        System.out.println("Использовать IntelliJ IDEA");
    }
    void useJVM() {
        System.out.println("Использовать JVM");
    }
}
