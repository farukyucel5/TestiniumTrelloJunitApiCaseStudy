package testlogger;

import logger.Log;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class TestResultLogger implements TestWatcher {

    Log log = new Log();

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        log.info(testName + " PASSED");
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage() ;
        log.error(testName + " FAILED with cause : " + testFailCause);
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("TEST DISABLED: " + context.getDisplayName() + " with reason = "
                + reason.orElse("No reason provided."));

    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        System.out.println("TEST ABORTED: " + context.getDisplayName() +
                " with cause = " + cause.getMessage());

    }
}
