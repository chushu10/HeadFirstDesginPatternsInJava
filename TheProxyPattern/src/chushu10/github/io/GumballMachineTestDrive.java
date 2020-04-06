package chushu10.github.io;

import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        String[] location = {/*"rmi://127.0.0.1/santafe/gumballmachine",
                             "rmi://127.0.0.1/boulder/gumballmachine",*/
                             "rmi://127.0.0.1/seattle/gumballmachine"};

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                GumballMachineRemote machineRemote = (GumballMachineRemote) Naming.lookup(location[i]);
                monitors[i] = new GumballMonitor(machineRemote);
                System.out.println(monitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (GumballMonitor monitor : monitors) {
            monitor.report();
        }
    }
}
