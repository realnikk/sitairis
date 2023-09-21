package com.company;

public class WebDesigner implements CreateWebPage {
    @Override
    public void createITProduct() {
        System.out.println("Создавать дизайн приложения");
    }
    @Override
    public void learnUserExperience() {
        System.out.println("Изучать UI/UX");
    }
    void useFigma() {
        System.out.println("Использовать Figma");
    }
}
