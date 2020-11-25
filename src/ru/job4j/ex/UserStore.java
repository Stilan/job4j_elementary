package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User name : users) {
            if (login.equals(name.getUsername())){
                user = name;
            }
        }
        if (user == null){
            throw new UserNotFoundException();
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        String str = user.getUsername();
        if (user.isValid() && str.length() >= 3 ){
            return true;
        }
            throw new UserInvalidException();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }catch (UserInvalidException e){
            System.out.println("Пользователь не валидный.");
        }catch (UserNotFoundException e){
            System.out.println("Пользователя не найдено ");
        }
    }
}
