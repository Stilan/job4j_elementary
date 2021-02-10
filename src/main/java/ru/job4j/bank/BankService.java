package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
           if (!accounts.contains(account)) {
               accounts.add(account);
           }
        }

    }

    /**
     * Метод ищет пользователя по номеру паспорта.
     * @param passport Паспорт пользавателя
     * @return если находит то возвращает user если нет null
     */
    public User findByPassport(String passport) {

       return users.keySet()
               .stream()
               .filter(s -> s.getPassport().equals(passport))
               .findFirst()
               .orElse(null);
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
    public Account findByRequisite(String passport, String requisite) {
        User user =  findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
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
        Account account1 = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, destRequisite);
            if (account1 != null && account2 != null && account1.getBalance() >= amount) {
                account1.setBalance(account1.getBalance() - amount);
                account2.setBalance(account2.getBalance() + amount);
                rsl = true;
            }
        return rsl;
    }
}
