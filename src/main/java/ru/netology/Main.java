package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Марк";
        post.patronymic="Маркович";
        post.surname="Марков";
        post.birthday = new FormDate();
        post.birthday.day = 18;
        post.birthday.month=5;
        post.birthday.year=1985;
        post.passport="3515№555555";
        post.phone="+7495000000";
        post.subscription=true;

    }
}