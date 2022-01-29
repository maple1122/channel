import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static org.testng.Assert.*;

/**
 * @author wufeng
 * @date 2022/1/29 16:56
 */
public class ChoiceProgramTest {

    @Test(priority = 1)//添加分类
    public void testAddClass() throws InterruptedException {
        ChoiceProgram.addClass();
    }

    @Test(priority = 4)//删除分类
    public void testDelClass() throws InterruptedException {
        ChoiceProgram.delClass();
    }

    @Test(priority = 2)//设置分类
    public void testSetClass() throws InterruptedException {
        ChoiceProgram.setClass();
    }

    @Test(priority = 3)//取消精选
    public void testCancelChoice() throws InterruptedException {
        ChoiceProgram.cancelChoice();
    }

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