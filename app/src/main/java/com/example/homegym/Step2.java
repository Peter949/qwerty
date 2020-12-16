//Второй экран из пяти вопросов класс, который определяет гендер у пользователя.
package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Helper;

import android.content.Intent;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
//Класс получает объекты от активити и делает возможным выбор гендера, от которого ссылается на
//определенные классы.
public class Step2 extends AppCompatActivity implements View.OnClickListener {
    //male, female - картинки 2 гендеров, белого фона; takenM, takenF - картинки 2 гендеров
    //с коричневым фоном, что показывает какой гендер пользователь выбрал; gender - значение true
    //значит "male", а значение false "female"; tag - значение true если пользователь выбрал один
    //из гендеров, иначе false; next - кнопка для перехода между классами.
    ImageView male;
    ImageView female;
    ImageView takenM;
    ImageView takenF;
    Boolean gender, tag = false;
    ImageView next;
    @Override
    //При запуске класса присваивается к переменным объекты и устанавливается слушатель для
    //взаимодействия при нажатии мышкой.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
        male = findViewById(R.id.imageView16);
        female = findViewById(R.id.imageView15);
        takenM = findViewById(R.id.takenm);
        takenF = findViewById(R.id.takenf);
        next = findViewById(R.id.imageView17);
        male.setOnClickListener(this);
        female.setOnClickListener(this);
        next.setOnClickListener(this);
    }
    //@param v
    //@returns void
    //При нажатии на объект идет проверка на id, тем программа узнает какое действие
    //нужно выполнять.
    public void onClick(View v)
    {
        switch (v.getId())
        {
            //При нажатии на объекты "imageView16" и "imageView15".
            //Устанавливается видимость другого изображения для выбранного объекта и скрывает
            //у другого изображения его дополнительный объект.
            //"gender" присваивает значение true для понимания программой, что пользователь
            //выбрал мужской пол.
            //"tag" принимает true, это дает программе знать, что пользователь выбрал один
            //из предложенных гендеров.
            case R.id.imageView16:
                takenM.setVisibility(View.VISIBLE);
                takenF.setVisibility(View.INVISIBLE);
                gender = true;
                tag = true;
                break;
            case R.id.imageView15:
                takenF.setVisibility(View.VISIBLE);
                takenM.setVisibility(View.INVISIBLE);
                gender = false;
                tag = true;
                break;
            //При нажатии на объект "imageView17" идет условие проверки на выбор один из двух
            //гендеров, при успехе идет еще подусловие какому гендеру относится выбор, от чего зависит
            //к какому классу дальше перейдет(женский, мужской). Иначе предупредит о выборе гендера.
            case R.id.imageView17:
                if(tag == true)
                {
                    if (gender == true) {
                        Intent intentM = new Intent(this, Step3.class);
                        startActivity(intentM);
                    } else {
                        Intent intentF = new Intent(this, Step3_1.class);
                        startActivity(intentF);
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Выберите ваш гендер!", Toast.LENGTH_LONG).show();
                }
                break;
            default:

                break;
        }

    }
}