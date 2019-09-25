package com.example.toolboxkovathana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HeroActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);

        Intent intent = getIntent();
        Boolean helm = intent.getBooleanExtra(HELM, false);
        Boolean legs = intent.getBooleanExtra(LEGS, false);
        Boolean armo = intent.getBooleanExtra(ARMO, false);
        Boolean shoe = intent.getBooleanExtra(SHOE, false);

        Boolean bana = intent.getBooleanExtra(BANA, false);
        Boolean bagu = intent.getBooleanExtra(BAGU, false);
        Boolean pick = intent.getBooleanExtra(PICK, false);

        Boolean shed = intent.getBooleanExtra(SHED, false);

        int chara = (int) intent.getIntExtra(CHAR, 0);

        if(helm)
            findViewById(R.id.helmetPic).setVisibility(View.VISIBLE);
        if(legs)
            findViewById(R.id.leggingsPic).setVisibility(View.VISIBLE);
        if(armo)
            findViewById(R.id.armorPic).setVisibility(View.VISIBLE);
        if(shoe)
            findViewById(R.id.shoesPic).setVisibility(View.VISIBLE);

        if(bana) {
            findViewById(R.id.weaponPic).setVisibility(View.VISIBLE);
            findViewById(R.id.weaponPic).setBackgroundResource(R.drawable.banana);
        }
        if(bagu) {
            findViewById(R.id.weaponPic).setVisibility(View.VISIBLE);
            findViewById(R.id.weaponPic).setBackgroundResource(R.drawable.baguette);
        }
        if(pick) {
            findViewById(R.id.weaponPic).setVisibility(View.VISIBLE);
            findViewById(R.id.weaponPic).setBackgroundResource(R.drawable.pickle);
        }

        if(shed)
            findViewById(R.id.shieldPic).setVisibility(View.VISIBLE);

        if(chara == 0)
            findViewById(R.id.characterPic).setBackgroundResource(R.drawable.shrek);
        if(chara == 1)
            findViewById(R.id.characterPic).setBackgroundResource(R.drawable.sans);
        if(chara == 2)
            findViewById(R.id.characterPic).setBackgroundResource(R.drawable.bernie_sanders);

    }

    //https://stackoverflow.com/questions/2974862/changing-imageview-source
    // This shows how to paste images

    public static final String HELM = "helm";
    public static final String LEGS = "legs";
    public static final String ARMO = "armo";
    public static final String SHOE = "shoe";

    public static final String BANA = "bana";
    public static final String BAGU = "bagu";
    public static final String PICK = "pick";

    public static final String SHED = "shed";

    public static final String CHAR = "char";



}
