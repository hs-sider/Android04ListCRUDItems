package com.example.hssider.listcruditems;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.hssider.listcruditems.model.Department;

/**
 * Created by hssider on 12/22/15.
 */
public class ActivityDepartment extends AppCompatActivity {

    private EditText et_name;
    private EditText et_capital;
    private EditText et_extension;
    private EditText et_population;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        et_name = (EditText) findViewById(R.id.et_name);
        et_capital = (EditText) findViewById(R.id.et_capital);
        et_extension = (EditText) findViewById(R.id.et_extension);
        et_population = (EditText) findViewById(R.id.et_population);
    }

    public void SaveClientClick(View v) {

        Intent output = new Intent();

        String name = et_name.getText().toString();
        String capital = et_capital.getText().toString();
        float extension = Float.parseFloat(et_extension.getText().toString());
        int population = Integer.parseInt(et_population.getText().toString());

        output.putExtra(Department.NAME, name);
        output.putExtra(Department.CAPITAL, capital);
        output.putExtra(Department.EXTENSION, extension);
        output.putExtra(Department.POPULATION, population);

        setResult(Department.RESULT_CODE, output);
        finish();
    }
}
