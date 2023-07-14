package qa.guru.owner;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HWWebTest extends TestBase {

    @Test
    void githubSimpleTest() {
        open("/");
        $(".eyebrow-banner .pr-3 .color-fg-subtle").shouldHave(text("Your AI pair programmer is leveling up"));
    }
}
