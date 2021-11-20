package come.testing.class11;

/**
 * @Classname TestLgoin
 * @Description 类型说明
 * @Date 2021/8/28 21:04
 * @Created by 特斯汀Roy
 */
public class TestLgoin {

    public static void main(String[] args) {
        LoginSample ls = new LoginSample();
//相当于对loginSample类中的两个方法进行了单元测试。
        //用户名 密码正确
        ls.login("Roy", "123456");
//        System.out.println(ls.getResultMSG());
        if ("恭喜您，登录成功".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }

        //用户名空
        ls.login(null, "123456");
        if ("用户名密码不能为空！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }

        //密码空
        ls.login("Roy", null);
        if ("用户名密码不能为空！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }

        //用户名长度大于17（可以按边界值设计）
        ls.login("royroyroyroyroyroyroy", "123456");
        if ("用户名密码长度应是3-16位！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }

        //用户名长度小于3
        ls.login("ro", "123456");
        if ("用户名密码长度应是3-16位！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }

        //密码长度大于17
        ls.login("Roy", "12345678912中文45678a");

        if ("用户名密码长度应是3-16位！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }

        //密码长度小于3
        ls.login("Roy", "12");

        if ("用户名密码长度应是3-16位！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }
        //用户正确 密码错误,但是在【3,16】
        ls.login("Roy", "12345");

        if ("用户名或密码错误！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }
        //用户错误 密码正确
        ls.login("roy", "123456");
        if ("用户名或密码错误！".equals(ls.getResultMSG())) {
            System.out.println("PASS");
        }else{
            System.out.println("fail");
        }


    }

}
