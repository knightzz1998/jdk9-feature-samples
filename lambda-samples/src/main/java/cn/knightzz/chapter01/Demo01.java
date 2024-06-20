package cn.knightzz.chapter01;

/**
 * @author 王天赐
 * @title Chapter01Main
 * @description
 * @create 2024-06-17 08:40
 */
public class Demo01 {

    public static void main(String[] args) {

        // 匿名内部类
        UserFactory userFactory = new UserFactory() {
            @Override
            public User getUser() {
                return new User("张三", 18);
            }
        };
        User user = userFactory.getUser();
        System.out.println(user);

        userFactory = () -> {
            return new User("李四", 20);
        };
        userFactory = () -> new User("李四", 20);
        // lambda 作为参数
        user = getUserFromFactory(() -> {
            return new User("李四", 20);
        }, "User");
        // lambda 作为返回值
        UserFactory factory = getFactory();
    }

    public static User getUserFromFactory(UserFactory factory, String beanName) {
        Object obj = factory.getUser();
        if (obj != null && beanName != null && obj.getClass().getSimpleName().equals(beanName)) {
            return (User) obj;
        }
        return null;
    }

    public static UserFactory getFactory() {
        return () -> {
            return new User("王五", 22);
        };
    }
}
