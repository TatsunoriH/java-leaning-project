package domain.service.student645;

import domain.service.ITask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task645Test {

    @Test
    void すべての文字列が正常となる() {
        ITask task = new Task645();
        assertTrue(task.task1("すべての文字列"));
    }

    @Test
    void 最初の１文字はＡで２文字目は数字で３文字目は数字か無しが正常となる() {
        ITask task = new Task645();
        assertTrue(task.task1("A10"));
    }

    @Test
    void 最初の１文字はＵで２文字目から４文字目は英大文字が正常となる() {
        ITask task = new Task645();
        assertTrue(task.task1("USAGI"));
    }
}
