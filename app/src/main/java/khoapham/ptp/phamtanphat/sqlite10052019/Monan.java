package khoapham.ptp.phamtanphat.sqlite10052019;

public class Monan {
    //design pattern builder
    private int id;
    private String ten;
    private int gia;
    private String diachi;

    private Monan(final Builder builder) {
        id = builder.id;
        ten = builder.ten;
        gia = builder.gia;;
        diachi = builder.diachi;
    }
        static public class Builder{
            private int id;
            private String ten;
            private int gia;
            private String diachi;

            public int getId() {
                return id;
            }

            public Builder setId(int id) {
                this.id = id;
                return this;
            }

            public String getTen() {
                return ten;
            }

            public Builder setTen(String ten) {
                this.ten = ten;
                return this;
            }

            public int getGia() {
                return gia;
            }

            public Builder setGia(int gia) {
                this.gia = gia;
                return this;
            }

            public String getDiachi() {
                return diachi;
            }

            public Builder setDiachi(String diachi) {
                this.diachi = diachi;
                return this;
            }
        }
    //builder thay constructor

}
