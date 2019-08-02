package khoapham.ptp.phamtanphat.sqlite10052019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLite sqLite;
    ArrayList<Monan> monanArrayList;
    MonanAdapter monanAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerviewMonan);
        //Mỗi database sẽ có 1 file riêng
        sqLite = new SQLite(this,"Quanlymonan.sql",null , 1);
        monanArrayList = new ArrayList<>();
        monanAdapter  = new MonanAdapter(monanArrayList,MainActivity.this);
        recyclerView.setAdapter(monanAdapter);
        //Tạo bảng : Thông tin món ăn
//                    +Idmonan
//                    +Ten
//                    +Gia
//                    +Dia chi
        //Sử dụng ngôn ngữ truy vấn sql để thao tác với database
//        String createTable = "CREATE TABLE IF NOT EXISTS Monan (Id INTEGER PRIMARY KEY AUTOINCREMENT , Ten VARCHAR ,Gia INTEGER ,Diachi VARCHAR)";
//        sqLite.onQuery(createTable);
//        String insertData = "INSERT INTO Monan VALUES(null,'Cơm sườn',25000,'Quận 10')";
//        sqLite.onQuery(insertData);

        String selectdatabase = "SELECT * FROM Monan";
        Cursor cursor = sqLite.getData(selectdatabase);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            int gia = cursor.getInt(2);
            String diachi = cursor.getString(3);
            monanArrayList.add(new Monan(id,ten,gia,diachi));
            monanAdapter.notifyDataSetChanged();
        }


    }
}
