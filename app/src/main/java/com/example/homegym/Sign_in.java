//Класс авторизации пользователя с которой можно перейти в регистрацию.
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
//Класс позволяет запускать экран авторизации, так же авторизироваться под уже заданным
//логином и паролем. Имеет выход к классу регистрации.
public class Sign_in extends AppCompatActivity implements View.OnClickListener {
    //login & password - данные для авторизации.
    String login = "serk";
    String password = "123";
    //e1 - поле ввода логина, e2 - поле ввода пароли.
    EditText e1;
    EditText e2;
    //button - кнопка авторизации, а s1 - переход к регистрации.
    ImageView button;
    ImageView s1;
    @Override
    //При создании класса присваиваем к переменным объекты из активити и устанавливаем слушатель
    //для взаимодействия при нажатии мышкой.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        e1 = findViewById(R.id.login);
        e2 = findViewById(R.id.password);
        button = findViewById(R.id.signin);
        s1 = findViewById(R.id.sunext);
        button.setOnClickListener(this);
        s1.setOnClickListener(this);
    }
    //@param v
    //@returns void
    //При нажатии на объект идет проверка на id, тем программа узнает какое действие
    //нужно выполнять.
    //При совпадении с полем ввода и данными для авторизации совпадают, то идет переход
    //к классу "Step1", иначе выводит текст об ошибке.
    //Запуск перехода к классу "Step1" при нажатии на объект "signin".
    //Запуск перехода к классу "Sign_up" при нажатии на объект "suntext".
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.signin:

                if(e1.getText().toString().equals(login) && e2.getText().toString().equals(password))
                {
                    Intent intent = new Intent(this, Step1.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Login or Password!" , Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.sunext:

                Intent intent = new Intent(this, Sign_up.class);
                startActivity(intent);
                break;
            default:

                break;
        }
    }
}