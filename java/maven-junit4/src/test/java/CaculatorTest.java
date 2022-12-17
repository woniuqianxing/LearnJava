import com.imooc.junit.Caculator;
import org.junit.Test;

import java.sql.SQLOutput;

public class CaculatorTest {
    private Caculator cac=new Caculator();
    //1.与原方法保持一致
    //2.在原方法基础上增加Test前缀
    @Test
    public void testAdd(){
        int result=cac.add(1,2);
        System.out.println(result);
    }
    @Test
    public void testSubtract(){
        int result=cac.subtract(9,2);
        System.out.println(result);
    }
    @Test
    public void testMultiply(){
        int result=cac.multiply(2,3);
        System.out.println(result);
    }
    @Test
    public void testDivide(){
        float result = cac.divide(2,3);
        System.out.println(result);
    }
    @Test
    public void testDivide2(){
        float result = cac.divide(2,0);
        System.out.println(result);
    }
}
