public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.passport = "7777 № 777777";
        post.patronymic = "Иванович";
        post.phone = "+7 (888)-888-88-88";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
