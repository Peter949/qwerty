//Первый экран из пяти шагов вопроса класс, отвечает на вопрос "What is your purpose?"
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
//Класс для получения объектов и решения задач с помощью интерфейса "View.OnClickListener"
public class Step1 extends AppCompatActivity implements View.OnClickListener {
    //i9, i10, i11 - это варианты объектов для выбора.
    ImageView i11;
    ImageView i9;
    ImageView i10;
    @Override
    //При запуске класса присваивается к переменным объекты и устанавливается слушатель для
    //взаимодействия при нажатии мышкой.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
        i11 = findViewById(R.id.imageView11);
        i9 = findViewById(R.id.imageView9);
        i10 = findViewById(R.id.imageView10);
        i11.setOnClickListener(this);
        i9.setOnClickListener(this);
        i10.setOnClickListener(this);
    }
    //@param v
    //@returns void
    //При нажатии на объект идет проверка на id, тем программа узнает какое действие
    //нужно выполнять.
    public void onClick(View v)
    {
        switch (v.getId())
        {
            //Кейсы не содержат в себе действия, но в дальнейшем можно реализовать
            //возвращение значений, что конкретно выбрал пользователь.
            case R.id.imageView11:

                break;
            case R.id.imageView9:

                break;
            case R.id.imageView10:

                break;
        }
        //Запуск перехода к классу "Step2" при нажатии на объект в любом случае.
        Intent intent = new Intent(this, Step2.class);
        startActivity(intent);
    }
}