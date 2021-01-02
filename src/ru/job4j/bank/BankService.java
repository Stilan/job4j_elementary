package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            users.putIfAbsent(user,new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null){
            List<Account> accounts = users.get(user);
           if (!accounts.contains(account)){
               accounts.add(account);
           }
        }

    }

    public User findByPassport(String passport) {
        for (User user:users.keySet()) {
            if (user.getPassport().equals(passport)){
                return user;
            }
        }
       return null ;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user =  findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account:accounts) {
                if (account.getRequisite().equals(requisite)){
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account1 = findByRequisite(srcPassport,srcRequisite);
        Account account2 = findByRequisite(destPassport,destRequisite);
            if (account1 != null && account2 != null && account1.getBalance() >= amount){
                account1.setBalance(account1.getBalance()-amount);
                account2.setBalance(account2.getBalance()+amount);
                rsl = true;
            }
        return rsl;
    }
}
