//Четвертый экран из пяти вопросов, узнает вопрос как часто тренируется пользователь.
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
//Класс решает задачи выборки между вариантами ответов, закрашивая выбранный пользователем
//ответ и отправку.
public class Step4 extends AppCompatActivity implements View.OnClickListener {
    //newbie, keepon, advanced - варианты выбора частоты тренировки.
    //i9, i14, i18 - объекты типа newbie, keepon, advanced с другим задним фоном.
    //next - кнопка для перехода в другой класс.
    //phase - проверка на выбрал ли пользователь одно из 3 вариантов выбора.
    ImageView newbie, keepon, advanced, i8, i14, i18, next;
    Boolean phase;
    @Override
    //При запуске класса присваивается к переменным объекты и устанавливается слушатель для
    //взаимодействия при нажатии мышкой.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);
        newbie = findViewById(R.id.newbie);
        keepon = findViewById(R.id.keepon);
        advanced = findViewById(R.id.advanced);
        newbie.setOnClickListener(this);
        keepon.setOnClickListener(this);
        advanced.setOnClickListener(this);
        i8 = findViewById(R.id.imageView8);
        i14 = findViewById(R.id.imageView14);
        i18 = findViewById(R.id.imageView18);
        next = findViewById(R.id.imageView28);
        next.setOnClickListener(this);
        phase = false;
    }
    //@param v
    //@returns void
    //При нажатии на объект идет проверка на id, тем программа узнает какое действие
    //нужно выполнять.
    public void onClick(View v)
    {
        switch (v.getId())
        {
            //При нажатии на объекты "newbie", "keepon", "advanced".
            //Устанавливается видимость другого изображения для выбранного объекта и скрывает
            //у другого изображения его дополнительный объект.
            //"phase" принимает true, это дает программе знать, что пользователь выбрал один
            //из предложенных вариантов тренировки.
            case R.id.newbie:

                i8.setVisibility(View.VISIBLE);
                i14.setVisibility(View.INVISIBLE);
                i18.setVisibility(View.INVISIBLE);
                phase = true;
                break;
            case R.id.keepon:
                i14.setVisibility(View.VISIBLE);
                i8.setVisibility(View.INVISIBLE);
                i18.setVisibility(View.INVISIBLE);
                phase = true;
                break;
            case R.id.advanced:
                i18.setVisibility(View.VISIBLE);
                i14.setVisibility(View.INVISIBLE);
                i8.setVisibility(View.INVISIBLE);
                phase = true;
                break;
            //После нажатия на объект "imageView28" происходит условие, которая проверяет на
            //выбор одного из вариантов ответа. При положительном исходе идет переход к "Step5",
            //иначе упоминает пользователю о выборе уровня тренировок.
            case R.id.imageView28:
                if(phase == true)
                {
                    Intent intent = new Intent(this, Step5.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Выберите ваш уровень тренировок!", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}