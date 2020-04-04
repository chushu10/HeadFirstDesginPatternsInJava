package chushu10.github.io.state;

import chushu10.github.io.GumballMachine;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter, the machine sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't insert a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball diispensed");
    }
}
