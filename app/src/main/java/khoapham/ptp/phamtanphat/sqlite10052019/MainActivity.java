package khoapham.ptp.phamtanphat.sqlite10052019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SQLite sqLite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Mỗi database sẽ có 1 file riêng
        sqLite = new SQLite(this,"Quanlymonan.sql",null , 1);
        //Tạo bảng : Thông tin món ăn
//                    +Idmonan
//                    +Ten
//                    +Gia
//                    +Dia chi
        //Sử dụng ngôn ngữ truy vấn sql để thao tác với database
        String createTable = "CREATE TABLE IF NOT EXISTS Monan (Id)";
    }
}
