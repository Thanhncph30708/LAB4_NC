package thanhncph30708.fpoly.lab4_nc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn=findViewById(R.id.demo41Btn1);
        txt=findViewById(R.id.demo41Txt1);
        //xu ly su kien
        btn.setOnClickListener(v->{
            //Doi tuong quan ly Fragment
            FragmentManager fragmentManager=getSupportFragmentManager();
            //anh xa fragment
            BlankFragment41 fragment41=(BlankFragment41) fragmentManager
                    .findFragmentById(R.id.fr41);
            //truyen du lieu tu activity sang fragment
            fragment41.txt1.setText(txt.getText().toString());
        });
    }
}