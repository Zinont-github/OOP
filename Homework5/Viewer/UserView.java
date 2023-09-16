package Homework5.Viewer;

import mvp_try.Presenter.Presenter;

import java.util.Scanner;

public class UserView implements UI {

    Scanner in;

    Presenter presenter;

    private String s = """
      1. Загрузить базу данных.
      2. Сохранить базу данных.
      3. Добавить пользователя.
      4. Удалить пользователя.
      5. Поиск пользователя.
      6. Вывести список пользователей.
      7. Выход.
      """;

    public UserView() {
        in = new Scanner(System.in);
        presenter = new Presenter(this);
    }

    @Override
    public void greetings() {
        System.out.println("Добро пожаловать в социальную сеть \"Храбрые котята\"");
    }

    public void select() {
        greetings();
        while (true) {
            System.out.println(s);
            switch (in.nextLine()) {
                case "1":
                    presenter.loadData();
                    System.out.println("База успешно загружена!");
                    break;
                case "2":
                    presenter.saveData();
                    System.out.println("База успешно сохранена!");
                    break;
                case "3":
                    presenter.addUser(setUser(), setUserName(), setPassword());
                    System.out.println("Ваши данные успешно внесены базу");
                    break;
                case "4":
                    presenter.removeUser(in.nextLine());
                    System.out.println("Пользователь успешно удален");
                    break;
                case "5":
                    presenter.searchUser(in.nextLine());
                    break;
                case "6":
                    presenter.printAllUsers();
                    break;
                case "7":
                    System.out.println("Досвидания");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова!");
            }
        }

    }

    public String setUser() {
        System.out.println("Введите ваше имя: ");
        return in.nextLine();
    }

    public String setUserName() {
        System.out.println("Введите ваш логин: ");
        return in.nextLine();
    }

    public String setPassword() {
        System.out.println("Введите ваш пароль!");
        return in.nextLine();
    }

}
