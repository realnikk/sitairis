package com.company;

public class FullStackDeveloper extends SoftwareEngineer implements CreateClientSide, CreateServerSide {
    @Override
    public void createITProduct() {
        System.out.println("Создавать бизнес-логику приложения");
    }
    @Override
    public void learnUserExperience() {
        System.out.println("Изучать UX");
    }
    @Override
    public void useProgrammingLanguage() {
        System.out.println("Использовать компилируемые ЯП");
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
    public void useReact() {
        System.out.println("Использовать React");
    }
    @Override
    public void useFrameworks() {
        System.out.println("Использовать фрэймворки");
    }
    @Override
    void createOOPModel() {
        System.out.println("Создавать объектную модель");
    }
    void useTimeManagement() {
        System.out.println("Распределять рабочее время");
    }
}
