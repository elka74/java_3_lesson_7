public class MyTest {
    @BeforeSuite
    public static void beforeSuite (){
        System.out.println("start");

    }

    @Test
    public static void test1(){
        System.out.println("test1");
    }
    @Test
    public static void test2(){
         System.out.println("test2");
    }
    @Test
    public static void test3(){
        System.out.println("test3");
    }

    @AfterSuite
    public static void afterSuite(){
        System.out.println("stop");
    }
}
