package com.example.henry89.sigappsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    EditText mEditText;
    ChatRecyclerAdapter mChatAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void onClick(View view){
        String inputtedText = mEditText.getText().toString();

        mEditText.getText().clear();
    }

}
