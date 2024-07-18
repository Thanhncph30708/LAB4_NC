package thanhncph30708.fpoly.lab4_nc;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity3 extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        viewPager=findViewById(R.id.demo43ViewPager);
        tabLayout=findViewById(R.id.demo43Tablyout);
        addTabLayout(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }
    //viet ham addTabLayout
    public void addTabLayout(ViewPager viewPager){
        //Tao moi adapter
        Adapter adapter=new Adapter(getSupportFragmentManager());
        //them fragmemt vao adapter
        adapter.addFrag(new BlankFragment41(),"ONE");
        adapter.addFrag(new BlankFragment42(),"TWO");
        adapter.addFrag(new BlankFragment43(),"THREE");
        //dua adapter vao viewpager
        viewPager.setAdapter(adapter);
    }
}