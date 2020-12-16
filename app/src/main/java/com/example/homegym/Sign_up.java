//Sign_up представляет собой регистрацию пользователя, так же выходом на авторизацию.
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
//Класс выходит назад к авторизации и при регистрации выдает ошибки.
public class Sign_up extends AppCompatActivity implements View.OnClickListener {
    ImageView back; //Переменная для выхода к окну авторизации.
    ImageView signup; //Кнопка для регистрации.
    @Override
    //При запуске класса присваивается к переменным объекты и устанавливается слушатель для
    //взаимодействия при нажатии мышкой.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(this);
        back = findViewById(R.id.back);
        back.setOnClickListener(this);
    }
    //@param v
    //@returns void
    //При нажатии на объект идет проверка на id, тем программа узнает какое действие
    //нужно выполнять.
    //Объект "back" запуск перехода к классу "Sign_in" при нажатии.
    //Объект "signup" выводит текст при нажатии.
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.back:
                Intent intent = new Intent(this, Sign_in.class);
                startActivity(intent);
                break;
            case R.id.signup:
                Toast.makeText(getApplicationContext(), "Неверный логин, пароль, не совпадают пароли" ,Toast.LENGTH_SHORT).show();
                break;
            default:

                break;
        }
    }
}