import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.Assert.*;

/**
 * @author wufeng
 * @date 2022/1/29 16:56
 */
public class ProguidTest {
    @Test(priority = 1)//添加节目单
    public void testAddProgram() throws InterruptedException {
        Proguid.addProgram();
        Proguid.addProgram();
    }

    @Test(priority = 4)//删除节目单
    public void testDelProgram() throws InterruptedException {
        Proguid.delProgram();
    }

    @Test(priority = 3)//复用节目单
    public void testMultiplexing() throws InterruptedException {
        Proguid.multiplexing();
    }

//    @Test(priority = 2)//上传视频
//    public void testUpload() throws InterruptedException, IOException {
//        Proguid.upload();
//    }

    @BeforeMethod
    public void testStart(Method method) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>> Test case: "
                + method.getName());
    }

    @AfterMethod
    public void testEnd(Method method){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<< Test End!\n");
    }
}