package khoapham.ptp.phamtanphat.sqlite10052019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PatternMatcher;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class ThemActivity extends AppCompatActivity {

    EditText edtTen,edtGia,edtDiachi;
    Button btnHuy,btnXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them);

        edtDiachi = findViewById(R.id.edittextDiachi);
        edtGia = findViewById(R.id.edittextGiamonan);
        edtTen = findViewById(R.id.edittextTenmonan);
        btnHuy = findViewById(R.id.buttonHuy);
        btnXacnhan = findViewById(R.id.buttonXacnhan);

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtTen.getText().toString();
                String gia = edtGia.getText().toString();
                String diachi = edtDiachi.getText().toString();

                if (!TextUtils.isEmpty(ten) && !TextUtils.isEmpty(gia) && !TextUtils.isEmpty(diachi)){
                    try{
                        String insert = "INSERT INTO Monan VALUES(null , '"+ten+"' , "+Integer.parseInt(gia)+" , '"+diachi+"')";
                        SingletonDatabase.getInstance(ThemActivity.this).onQuery(insert);
                        Toast.makeText(ThemActivity.this, "Them thanh cong", Toast.LENGTH_SHORT).show();
                        finish();
                    }catch (Exception e){
                        Toast.makeText(ThemActivity.this, e.getMessage().toString(), Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(ThemActivity.this, "Truyen thieu thong tin", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
