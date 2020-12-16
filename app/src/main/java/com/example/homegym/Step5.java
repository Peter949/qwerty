//Пятый экран из пяти вопросов, где нужно указать свои данные веса и роста.
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
//Класс позволяет вводить данные веса и роста, так же проверить на правильность заполнения.
public class Step5 extends AppCompatActivity implements View.OnClickListener {


    ImageView save; //save - кнопка для сохранения результатов.
    EditText height, weight; //height - рост пользователя и weight - вес пользователя
    @Override
    //При запуске класса присваивается к переменным объекты и устанавливается слушатель для
    //взаимодействия при нажатии мышкой.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step5);
        save = findViewById(R.id.imageView29);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        save.setOnClickListener(this);
    }
    //@param v
    //@returns void
    //При нажатии на объект идет проверка на id, тем программа узнает какое действие
    //нужно выполнять.
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            //При нажатии на объект "imageView29" происходит условие отрицания пустоты в местах
            //где вводятся данные о пользователе. При успешном вводе - данные зарегистрированы,
            //иначе - введите свои данные.
            case R.id.imageView29:
                if(!height.getText().toString().equals("") && !weight.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Данные зарегистрированы!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Введите свои данные!", Toast.LENGTH_LONG).show();
                }
                break;
            default:
                break;
        }
    }
}