import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {


    @Test
    void successfulSearchTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.google.com/");
    }
}