package sg.edu.rp.c346.id20007386.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvClickModule1;
    TextView tvClickModule2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvClickModule1 = findViewById(R.id.Module1);
        tvClickModule2 = findViewById(R.id.Module2);

        tvClickModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity.this, ModuleDetailActivity.class);
                k.putExtra("app", "ModuleCode: C203 \n ModuleName: Web Appln Development in php\n AcademicYear: 2021\n Semester: 1\n ModuleCredit: 4\n Venue:W67M");


                startActivity(k);
            }
        });

        tvClickModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ModuleDetailActivity.class);
                i.putExtra("soft", "ModuleCode: C206 \n ModuleName: Software Development\n AcademicYear: 2021\n Semester: 1\n ModuleCredit: 4\n Venue:W67M");


                startActivity(i);
            }
        });
    }
}