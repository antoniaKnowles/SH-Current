package com.example.myapplication;

import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragmentFour extends Fragment {//https://javapapers.com/android/get-user-input-in-android/



    public Questions qLib = new Questions();

    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public ImageView image;
    private String mAnswer;
    private int mQuestionNumber = MainActivity.getQuestionNumber();


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {




           return inflater.inflate(R.layout.fragment_second_four, container, false);
}


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mButtonChoice1 = (Button) view.findViewById(R.id.button_four_1);
        mButtonChoice2 = (Button) view.findViewById(R.id.button_four_2);
        mButtonChoice3 = (Button) view.findViewById(R.id.button_four_3);
        image = (ImageView) view.findViewById(R.id.imageViewCode) ;

        qLib.ReadFilesOne();
        updateQuestion();

        view.findViewById(R.id.button_four_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice1.getText().equals(mAnswer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });
        view.findViewById(R.id.button_four_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice2.getText().equals(mAnswer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });

        view.findViewById(R.id.button_four_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mButtonChoice3.getText().equals(mAnswer)) {

                    correct();

                } else {

                    Incorrect();
                }

            }
        });




    }


    private void updateQuestion() {
        switch(mQuestionNumber) {

            case 1 : image.setImageResource(R.drawable.one_code);break;

        }

        mButtonChoice1.setText(qLib.getchoice1(mQuestionNumber));
        mButtonChoice2.setText(qLib.getchoice2(mQuestionNumber));
        mButtonChoice3.setText(qLib.getchoice3(mQuestionNumber));
        mAnswer = qLib.getAns(mQuestionNumber);
        MainActivity.currentAns(mAnswer);

    }

    private void correct(){
        if( MainActivity.checkCompleted() == "Pass"){
            NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_levelPassed);

        }else if( MainActivity.checkCompleted() == "Complete"){
            NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_to_levelCompleted);

        }else{
            MainActivity.addQuestionNumber();
            NavHostFragment.findNavController(SecondFragmentFour.this).navigate(R.id.action_secondFragmentFour_self);
        }
    }

    private void Incorrect(){

        MainActivity.addIncorrect();

        NavHostFragment.findNavController(SecondFragmentFour.this)
                .navigate(R.id.action_secondFragmentFour_to_thirdFragmentFour);
    }

}
/*
    String name, email;
    int favoriteNumber;
    public EditText e1;
    public Button mButton;

    EditText nameInput;
    EditText emailInput;
    EditText favoriteNumberInput;
    private static EditText edittext;

    Button submitButton;
    private TextView lbl_title;
    private String title;
   // ActivityMessenger mActivityMessenger;

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //  NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_loginFragment);
        // Get the layout for this FirstFragment
        View view = inflater.inflate(R.layout.fragment_second_four, container, false);
        /*
        notatki = (EditText) view.findViewById(R.id.nameInput);
        SharedPreferences settings = this.getActivity().getSharedPreferences("PREFS", 0);
        notatki.setText(settings.getString("value", ""));

         */
/*
        return view;
    }

 //   String data = ((MainActivity.getData();

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        e1 = (EditText) view.findViewById(R.id.nameInput);
      //  loginButton = view.findViewById(R.id.submitButton);



    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }
   // @Override
    public void onResume(View view){
        super.onResume();
        e1 = (EditText) view.findViewById(R.id.nameInput);
      //  loginButton = view.findViewById(R.id.submitButton);

    }
}/*
/*
    private void setupTextFieldsByContact() {
        // call this method anytime the contact changes without having to find views again
        if (contact != null) {
            mName.setText(contact.getName());
            mDescription.setText(contact.getDescription());
            mPrimaryNumber.setText(contact.getPrimaryNumber());
            mSecondaryNumber.setText(contact.getSecondaryNumber());
            mEmail.setText(contact.getEmail());
            mSkype.setText(contact.getSkype());
        }

    }

     /*   final EditText usernameEditText = findViewById(R.id.nameInput);
        final EditText passwordEditText = findViewById(R.id.emailInput);
        final Button loginButton = findViewById(R.id.submitButton);


        TextWatcher afterTextChangedListener = new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String a =usernameEditText.getText().toString();
                String b =passwordEditText.getText().toString();
            }
        };

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  loadingProgressBar.setVisibility(View.VISIBLE);
                String a =usernameEditText.getText().toString();
                String b =passwordEditText.getText().toString();

            }
        });

      */



/*

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =
                inflater.inflate(R.layout.fragment_second_four,
                        container, false);

        edittext = (EditText)
                view.findViewById(R.id.nameInput);




        final Button button =
                (Button) view.findViewById(R.id.submitButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        return view;
    }

    public void buttonClicked (View view) {
    //    activityCallback.onButtonClick(seekvalue,
                edittext.getText().toString();
    }

 */






/*
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Get the layout for this SecondFragment
        return inflater.inflate(R.layout.fragment_second_three, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        final EditText simpleEditText = (EditText) view.findViewById(R.id.editText1);//get the id for edit text
        Button displayText = (Button) view.findViewById(R.id.button1);//get the id for button
        displayText.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if (simpleEditText.getText().toString() != null)//check whether the entered text is not null
                {
                    System.out.println(simpleEditText.getText().toString());

                }
            }
        });
    }



*/
