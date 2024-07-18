package thanhncph30708.fpoly.lab4_nc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity2 extends AppCompatActivity {
    Button btnAn,btnHien;
    BlankFragment41 frg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnAn=findViewById(R.id.demo42BtnAn);
        btnHien=findViewById(R.id.demo42BtnHien);
        btnAn.setOnClickListener(v->{
            //tao doi tuong quan ly fragment
            FragmentManager fragmentManager=getSupportFragmentManager();
            //anh xa fragment
            frg=(BlankFragment41) fragmentManager.findFragmentById(R.id.demo42Fr1);
            //an
            fragmentManager.beginTransaction()
                    .hide(frg)
                    .commit();
        });
        btnHien.setOnClickListener(v->{
            //tao doi tuong quan ly fragment
            FragmentManager fragmentManager=getSupportFragmentManager();
            //anh xa fragment
            frg=(BlankFragment41) fragmentManager.findFragmentById(R.id.demo42Fr1);
            //an
            fragmentManager.beginTransaction()
                    .show(frg)
                    .commit();
        });
    }
}