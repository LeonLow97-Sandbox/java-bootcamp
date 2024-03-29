package repository;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import pojo.Account;

public class AccountRepository {

    private Map<String, Account> datastore = new TreeMap<>();

    public void createAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clone();
    }

    public void updateAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }

}

