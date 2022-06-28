package mavenTestNGHomework;

import com.github.lalyos.jfiglet.FigletFont;
import org.openqa.selenium.json.JsonOutput;

import java.io.IOException;

public class MavenTest {
        public static void main(String[] args) throws IOException {
            String asciiArt = FigletFont.convertOneLine("Eduards");
            System.out.println(asciiArt);

    }

}
