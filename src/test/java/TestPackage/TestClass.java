package TestPackage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestClass extends BaseClass {

    @BeforeAll
    public static void setUp(){
        baseUrl();
    }

    @Test
    @Order(1)
    public void createAboard(){
        setTheEndPoint("1,boards","Creation");
        sendTheQuery("creating a board");

        setTheEndPoint("1,lists","Lists");
        sendTheQuery("creating a list");

        setTheEndPoint("1,cards","Cards");
        sendTheQuery("creating two cards");

        setTheEndPoint("1,cards","Card update");
        sendTheQuery("updating cards");

        setTheEndPoint("1,cards","Delete cart");
        sendTheQuery("deleting cards");

        setTheEndPoint("1,boards","Delete board");
        sendTheQuery("deleting board");
    }
}
