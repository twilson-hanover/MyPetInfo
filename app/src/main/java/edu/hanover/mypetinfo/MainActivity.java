package edu.hanover.mypetinfo;

import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private String getPetInfo(String pet_name)  {
        String info;
        if (pet_name.equals("Cleo")) {
            info = "My sweetheart tortie, who unfortunately hates Ruthie."; }
        else if (pet_name.equals("Ruthie")) {
            info = "My big puppy, who everybody loves."; }
        else if (pet_name.equals("Skye")) {
            info = "My wee boy, who is a snugglebug."; }
        else if (pet_name.equals("Spike")) {
            info = "My laid-back boy, who wants all the food."; }
        else if (pet_name.equals("Ziggy")) {
            info = "My needy boy, who is annoying but I love anyways."; }
        else {
            info = "I don't know anything about this pet."; }
        return info;
    }

    //
    public void onClickFindPetInfo(View view) {

        //
        TextView petInfoView = findViewById(R.id.pet_info);

        //
        Spinner pet_names = findViewById(R.id.pets);

        //
        String pet = String.valueOf(pet_names.getSelectedItem());

        //
        String petInfo = getPetInfo(pet);

        //
        petInfoView.setText(petInfo);
        petInfoView.setTextSize(50);
    }
}
