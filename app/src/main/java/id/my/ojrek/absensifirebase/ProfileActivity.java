package id.my.ojrek.absensifirebase;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class ProfileActivity extends AppCompatActivity {

    TextInputLayout fullname, email, phone, angkatan;
    TextView fullNameLabel, usernameLabel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
//
//    private void showAllUserData(){
//        Intent intent = getIntent();
//        String user_name = intent.getStringExtra("name");
//        String user_email = intent.getStringExtra("email");
//        String user_phone = intent.getStringExtra("phone");
//        String user_angkatan = intent.getStringExtra("angkatan");
//
//        fullNameLabel.setText(user_name);
//        fullname.getEditText.setText(user_name);
//        fullNameLabel.setText(user_name);
//        fullNameLabel.setText(user_name);
//    }
}
