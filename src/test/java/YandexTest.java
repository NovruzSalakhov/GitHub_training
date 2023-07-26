import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class YandexTest {


    @Test
    void successfulSearchTest() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.ya.ru/");
    }
}