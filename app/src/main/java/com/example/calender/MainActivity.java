package com.example.calender;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final String date = "com.example.calender.eventPage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String message= intent.getStringExtra(eventPage.msg);
        TextView textView = findViewById(R.id.eventDisp);
        textView.setText(message);

   }

    public void addEvent(View view){
        Toast.makeText(this,"select date from above calendar",Toast.LENGTH_LONG).show();
        final Intent intent = new Intent(this,eventPage.class);
        CalendarView calender = findViewById(R.id.calendar);
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int day) {
                String dt = day +" / " + (month+1) + " / " + year ;
                intent.putExtra(date,dt);
                startActivity(intent);
            }
        });

    }
}
