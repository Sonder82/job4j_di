package ru.job4j.di;

public class StartUI {

    private Store store;

    private ConsoleInput consoleInput;

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public void useConsole(String question) {
        consoleInput.askStr(question);
    }
}