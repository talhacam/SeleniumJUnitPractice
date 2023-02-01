package practise;

import org.junit.*;

public class C02_JUnit {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
        // Her class'ta ilk çalışır. 1 kere çalışır.
    }

    @Before
    public void before() {
        System.out.println("Before");
        //Her testten önce çalışır.
    }

    @After
    public void after() {
        System.out.println("After");
        //Her testten sonra çalışır.
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
        //Class'ın en sonunda sadece bir kere çalışır.
    }

    @Test
    public void test01() {
        System.out.println("Test 01");

    }

    @Test
    public void test02(){
        System.out.println("Test 02");
    }

    @Test
    public void best03() {
        System.out.println("Best 03");
    }
}
