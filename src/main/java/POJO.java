public class POJO {
    @AppendStr(str = "?")
    private String filed1;

    @AppendStr(str = "!")
    private String filed2;

    private String filed3;

    @AppendStr(str = "+")
    private String filed4;

    public String getFiled1() {
        return filed1;
    }

    public POJO(String filed1, String filed2, String filed3, String filed4) {
        this.filed1 = filed1;
        this.filed2 = filed2;
        this.filed3 = filed3;
        this.filed4 = filed4;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2;
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3;
    }

    public String getFiled4() {
        return filed4;
    }

    public void setFiled4(String filed4) {
        this.filed4 = filed4;
    }

    @Override
    public String toString() {
        return "POJO{" +
                "filed1='" + filed1 + '\'' +
                ", filed2='" + filed2 + '\'' +
                ", filed3='" + filed3 + '\'' +
                ", filed4='" + filed4 + '\'' +
                '}';
    }
}
