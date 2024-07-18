package thanhncph30708.fpoly.lab4_nc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class BlankFragment41 extends Fragment {
    Button btn1;
    EditText txt1;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank41, container, false);
        //anh xa
        btn1=view.findViewById(R.id.fra41Btn1);
        txt1=view.findViewById(R.id.fra41Txt1);
        //xu ly su kien
        btn1.setOnClickListener(v->{
            Toast.makeText(getContext(), txt1.getText(), Toast.LENGTH_SHORT).show();
        });
        return view;
    }
}
