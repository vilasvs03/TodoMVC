import com.assignment.TodoMVC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TodoMVC.class)
public class TodoMVCTests {
    @Test
    public void contexLoads() {
        //Do nothing
    }
}
