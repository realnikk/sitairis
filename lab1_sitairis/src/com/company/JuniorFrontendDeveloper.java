package com.company;

public class JuniorFrontendDeveloper extends FrontendDeveloper {
    @Override
    public void createITProduct() {
        System.out.println("Создавать интерфейс приложения");
    }
    @Override
    public void learnUserExperience() {
        System.out.println("Изучать UX");
    }
    @Override
    void useHTML() {
        System.out.println("Понимать основы HTML");
    }
    public void askForHelp() {
        System.out.println("Попросить помощи у Senior разработчика");
    }
}
