package com.example.toolboxkovathana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.character);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.characters_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }


    public void createHero(View v)
    {
        CheckBox helmet = (CheckBox) findViewById(R.id.checkBoxHelmet);
        CheckBox leggings = (CheckBox) findViewById(R.id.checkBoxLeggings);
        CheckBox armor = (CheckBox) findViewById(R.id.checkBoxArmor);
        CheckBox shoes = (CheckBox) findViewById(R.id.checkBoxShoes);

        RadioButton banana = (RadioButton) findViewById(R.id.wBanana);
        RadioButton baguette = (RadioButton) findViewById(R.id.wBaguette);
        RadioButton pickle = (RadioButton) findViewById(R.id.wPickle);

        Switch shield = (Switch) findViewById(R.id.shieldBoolean);

        Spinner character = (Spinner) findViewById(R.id.character);

    /*
        if(helmet.isChecked())
            findViewById(R.id.helmetPic).setBackgroundResource(R.drawable.helmet);
*/
        Intent intent = new Intent(this, HeroActivity.class);

        intent.putExtra(HeroActivity.HELM, helmet.isChecked());
        intent.putExtra(HeroActivity.LEGS, leggings.isChecked());
        intent.putExtra(HeroActivity.ARMO, armor.isChecked());
        intent.putExtra(HeroActivity.SHOE, shoes.isChecked());

        intent.putExtra(HeroActivity.BANA, banana.isChecked());
        intent.putExtra(HeroActivity.BAGU, baguette.isChecked());
        intent.putExtra(HeroActivity.PICK, pickle.isChecked());

        intent.putExtra(HeroActivity.SHED, shield.isChecked());

        int charNum = character.getSelectedItemPosition();

        intent.putExtra(HeroActivity.CHAR, charNum);

        startActivity(intent);
    }




}
