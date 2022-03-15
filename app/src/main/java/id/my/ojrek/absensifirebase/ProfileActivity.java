package id.my.ojrek.absensifirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {

    TextInputLayout fullname, email, phone, angkatan;
    TextView fullNameLabel, usernameLabel;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_navmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        firebaseAuth = FirebaseAuth.getInstance();

        if(id == R.id.absen_menu){
            Intent intent = new Intent(ProfileActivity.this,DashboardActivity.class);
            startActivity(intent);
            return true;
        } else{
            firebaseAuth.signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

//    public void setMode(int selectedMode) {
//        switch(selectedMode){
//            case R.id.absen_menu:
//                Toast.makeText(this, "tes tekan", Toast.LENGTH_LONG).show();
//                break;
//
//            case R.id.logout_menu:
//                Toast.makeText(this, "tes logout", Toast.LENGTH_LONG).show();
//                break;
//        }
//    }
}
