package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу Банковского обслуживания
 *  @author Litvinov Alexander
 *  @version 1.0
 */
public class BankService {
    /**
     * поле содержит всех пользователей системы с привязанными к ним счетами
     * Хранение users осуществляется в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * метод  добавляет пользователя в систему
     * PutIfAbsent() позволяет проверить, если ли такой ключ в
     * карте или нет и если его нет, то произвести вставку данных
     * @param user пользователь которого добавляю в систему
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет к пользователю
     * Пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * @param passport Паспорт пользавателя
     * @param account Новый счет
     */
    public void addAccount(String passport, Account account) {
          Optional<User> optionalUser = findByPassport(passport);
          if (optionalUser.isPresent()) {
              if (!users.get(optionalUser.get()).contains(account)) {
                 users.get(optionalUser.get()).add(account);
              }
          }
    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * @param passport Паспорт пользавателя
     * @return если находит то возвращает user если нет null
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }



    /**
     * метод ищет счет пользователя по реквизитам
     * Пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * Затем получить список счетов этого пользователя и в нем найти нужный счет.
     * @param passport Паспорт пользавателя
     * @param requisite Реквизиты счета
     * @return возвращает счет пользавателя если не находит вернет null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> optionalUser = findByPassport(passport);
        return optionalUser.flatMap(user -> users.get(user)
                .stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());
    }


    /**
     * Метод для перечисления денег с одного счёта на другой счёт
     * Находит счет пользавателя по реквизитам с которого будут переводится деньги
     * Находит счет пользавателя по реквизитам на которых будут  переводится деньги
     * Если они существуют и на счету списанее достаточно денег то отнимаем у первого amount
     * и пребовляем второму
     * Если счёт не найден или не хватает денег на счёте srcAccount
     * (с которого переводят), то метод должен вернуть false.
     * @param srcPassport Паспорт пользавателя откуда будут переведены деньги
     * @param srcRequisite Реквизиты счета откуда будут переведены деньги
     * @param destPassport Паспорт пользавателя куда будут переведены деньги
     * @param destRequisite Реквизиты счета куда будут переведены деньги
     * @param amount сумма перевода
     * @return вернет true если успешно если нет то false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> account1 = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> account2 = findByRequisite(destPassport, destRequisite);
            if (account1.isPresent() && account2.isPresent()&& account1.get().getBalance() >= amount) {
                 account1.get().setBalance(account1.get().getBalance()-amount);
                 account2.get().setBalance(account2.get().getBalance()+amount);
                rsl = true;
            }
        return rsl;
    }
    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser(new User("321", "Petr Arsentev"));
        Optional<User> opt = bank.findByPassport("3211");
        opt.ifPresent(user -> System.out.println(user.getUsername()));
    }

}
