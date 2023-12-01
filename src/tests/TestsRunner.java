package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

public class TestsRunner {

    public static void main(String[] args) {

        // Ajoutez ici les autres classes à tester
        // JunitCore.runClasses(Classe1.class, Classe2.class...);
        Result result = JUnitCore.runClasses(DossierBancaireTests.class);
        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests finished successfully...");
        }
    }
}