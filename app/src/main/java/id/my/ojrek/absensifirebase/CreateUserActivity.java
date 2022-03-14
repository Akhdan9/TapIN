package id.my.ojrek.absensifirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateUserActivity extends AppCompatActivity {
    private String uid;
    private TextInputEditText nama, telepon, angkatan, instagram, facebook, twitter;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        nama    = (TextInputEditText)findViewById(R.id.editNama);
        telepon = (TextInputEditText)findViewById(R.id.editTelepon);
        angkatan   = (TextInputEditText)findViewById(R.id.editAngkatan);
        instagram   = (TextInputEditText)findViewById(R.id.editIG);
        facebook = (TextInputEditText)findViewById(R.id.editFB);
        twitter = (TextInputEditText)findViewById(R.id.editTW);

        //ambil referensi Firebase
        database = FirebaseDatabase.getInstance().getReference();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        //uid     = getIntent().getStringExtra("uid");
        //email.setText(getIntent().getStringExtra("email"));
        uid     = firebaseAuth.getUid();

        Button btnSimpan = findViewById(R.id.btnSimpan);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //buat variabel lokal
                String n = nama.getText().toString().trim();
                String m = angkatan.getText().toString().trim();
                String t = telepon.getText().toString().trim();
                String i = instagram.getText().toString().trim();
                String f = facebook.getText().toString().trim();
                String w = twitter.getText().toString().trim();

                if(TextUtils.isEmpty(n) && TextUtils.isEmpty(t) && TextUtils.isEmpty(m)){
                    Toast.makeText(CreateUserActivity.this, "Nama, Telepon, Angkatan Harus diisi", Toast.LENGTH_LONG).show();

                } else {
                    //susun data sesuai model
                    Users users = new Users(n, m, t, i, f, w);
                    //akses ke (table) users
                    database.child("users")
                            .child(uid) //buat child (primary key berdasar uid auth)
                            .setValue(users)    //simpan data di dalamnya
                            .addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Toast.makeText(CreateUserActivity.this, "Data user berhasil disimpan", Toast.LENGTH_SHORT).show();
                                    //lanjut ke dashboard
                                    startActivity(new Intent(CreateUserActivity.this, DashboardActivity.class));
                                    finish();
                                }
                            });
                }
            }


        });

    }


}
