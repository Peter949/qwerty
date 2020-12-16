//Первый запускающийся класс, представляет собой "Начальную загрузку" приложения.
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;
//Класс запускается в первые 1 секунды, после открывает экран авторизации.
public class MainActivity extends AppCompatActivity {
    //При создании создается таймер и действия к нему "timerTask".
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            //Выполнение функции "run", запускает класс "Sign_in".
            public void run()
            {
                Intent intent = new Intent(MainActivity.this, Sign_in.class);
                startActivity(intent);
            }
        };
        timer.schedule(timerTask, 1000L); //Выполнение таймеров через одну секунду действие "timerTask".
    }
}