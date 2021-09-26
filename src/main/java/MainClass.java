public class MainClass {
    public static void main(String[] args) {
        POJO pojo = new POJO("a", "b", "c", "d");
        AppendStrImpl appendStrImpl = new AppendStrImpl();
        try {
            appendStrImpl.changeFields(pojo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(pojo);
    }
}
