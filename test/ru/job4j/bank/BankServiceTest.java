package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        assertThat(bank.findByPassport("3434"), is(user));
    }
    @Test
    public void whenEnterInvalidPassport() {
        Optional<User> user = Optional.of(new User("3434", "Petr Arsentev"));
        Optional<User> user2 = Optional.of(new User("3434", "Petr Arsentev"));
        BankService bank = new BankService();
        bank.addUser(user.get());
        bank.addUser(user2.get());
        bank.addAccount(user.get().getPassport(), new Account("5546", 150D));
        bank.addAccount(user2.get().getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546"),is(Optional.empty()));
    }
//    @Test
//    public void addAccount() {
//        User user = new User("3434", "Petr Arsentev");
//        BankService bank = new BankService();
//        bank.addUser(user);
//        bank.addAccount(user.getPassport(), new Account("5546", 150D));
//        assertThat(bank.findByRequisite("3434", "5546").get().getBalance(), is(150D));
//    }
//    @Test
//    public void transferMoney() {
//        User user = new User("3434", "Petr Arsentev");
//        BankService bank = new BankService();
//        bank.addUser(user);
//        bank.addAccount(user.getPassport(), new Account("5546", 150D));
//        bank.addAccount(user.getPassport(), new Account("113", 50D));
//        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
//        assertThat(bank.findByRequisite(user.getPassport(), "113").get().getBalance(), is(200D));
//    }
//    @Test
//    public void add2Accounts() {
//        User user = new User("3434", "Petr Arsentev");
//        BankService bank = new BankService();
//        bank.addUser(user);
//        bank.addAccount(user.getPassport(), new Account("1111", 150D));
//        bank.addAccount(user.getPassport(), new Account("1122", 300D));
//        assertThat(bank.findByRequisite("3434", "1122").get().getBalance(), is(300D));
//    }
}