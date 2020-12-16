//Третий экран из пяти вопросов для женского пола, узнает что хочет тренировать пользователь.
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
//Класс находит объекты, которые при нажатии запускают другой класс.
public class Step3_1 extends AppCompatActivity implements View.OnClickListener
{
    //Hands, Spine, Torso, Legs - варианты выбора тренировки тела.
    ImageView Hands, Spine, Torso, Legs;
    @Override
    //При запуске класса присваивается к переменным объекты и устанавливается слушатель для
    //взаимодействия при нажатии мышкой.
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3_1);
        Hands = findViewById(R.id.HandsF);
        Spine = findViewById(R.id.SpineF);
        Torso = findViewById(R.id.TorsoF);
        Legs = findViewById(R.id.LegsF);
        Hands.setOnClickListener(this);
        Spine.setOnClickListener(this);
        Torso.setOnClickListener(this);
        Legs.setOnClickListener(this);
    }
    //@param v
    //@returns void
    //При нажатии на объект идет проверка на id, тем программа узнает какое действие
    //нужно выполнять.
    public void onClick(View v)
    {
        switch (v.getId())
        {
            //При нажатии на объекты "TorsoF", "SpineF", "HandsF", LegsF идет запуск класса Step4.
            case R.id.HandsF:
                Intent intent1 = new Intent(this, Step4.class);
                startActivity(intent1);
                break;
            case R.id.SpineF:
                Intent intent2 = new Intent(this, Step4.class);
                startActivity(intent2);
                break;
            case R.id.TorsoF:
                Intent intent3 = new Intent(this, Step4.class);
                startActivity(intent3);
                break;
            case R.id.LegsF:
                Intent intent4 = new Intent(this, Step4.class);
                startActivity(intent4);
                break;
            default:

                break;
        }
    }
}