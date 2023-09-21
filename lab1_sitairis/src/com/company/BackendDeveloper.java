package com.company;

public class BackendDeveloper implements DesignDatabase, ProvideCyberSecurity {
    @Override
    public void createITProduct() {
        System.out.println("Создавать систему безопасности приложения");
    }
    @Override
    public void useSQL() {
        System.out.println("Использовать SQL");
    }
    @Override
    public void hashPassword() {
        System.out.println("Хэшировать пароль");
    }
    void useIDE() {
        System.out.println("Использовать IDE");
    }
}