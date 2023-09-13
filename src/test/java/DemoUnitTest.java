import org.example.topic1.UnitTest;
import org.junit.jupiter.api.*;

public class DemoUnitTest {

    UnitTest unitTest;
    @BeforeEach
    public void init(){
        unitTest = new UnitTest();
    }

    @AfterEach
    public void tearDown(){
        unitTest = null;
    }
    @Test
    public void testtambah(){

        Integer hasil = unitTest.tambah(1,1);
        Assertions.assertEquals(2, hasil);
    }

    @Test
    public void testKurang(){

        Integer hasil = unitTest.kurang(2,3);
        Assertions.assertEquals(-1, hasil);
    }

    @Test
    public void testAppender(){

        String hasil = unitTest.appender(1);
        Assertions.assertEquals("a", hasil);

        hasil = unitTest.appender(0);
        Assertions.assertEquals("salah", hasil);
    }
}
