package com.gapestation.animalappdevaughn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    Duck duck1 = new Duck();
    Fish fish1 = new Fish();
    Seal seal1 = new Seal();
    Fox fox1 = new Fox();

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.output);

        animals.add(duck1);
        animals.add(fish1);
        animals.add(seal1);
        animals.add(fox1);

        for (Animal printanimals : animals) {
            this.output.append("\n" + printanimals.getClass().getSimpleName() + " goes " + printanimals.say());
            if (printanimals instanceof Seal) {
                this.output.append("\n" + ((Seal) printanimals).play());
            }
            if (printanimals instanceof Fox) {
                this.output.append("\n" + ((Fox) printanimals).play());
            }
        }
    }
}
