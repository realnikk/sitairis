package com.company;

public class SeniorFrontendDeveloper extends FrontendDeveloper {
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
        System.out.println("Идеально знать HTML");
    }
    void trainOtherDevs() {
        System.out.println("Обучать Junior разработчиков");
    }
}
