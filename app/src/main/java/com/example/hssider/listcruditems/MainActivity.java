package com.example.hssider.listcruditems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.hssider.listcruditems.adapter.DepartmentAdapter;
import com.example.hssider.listcruditems.model.Department;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DepartmentAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.department_recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Department> departments = generateDepartments();

        adapter = new DepartmentAdapter(departments);
        recyclerView.setAdapter(adapter);
    }

    public void AddClientClick(View v) {
        Intent intent = new Intent(getApplicationContext(), ActivityDepartment.class);
        startActivityForResult(intent, Department.REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == Department.REQUEST_CODE && resultCode == Department.RESULT_CODE) {

            String depName = data.getStringExtra(Department.NAME);
            String depCapital = data.getStringExtra(Department.CAPITAL);
            float depExtension = data.getFloatExtra(Department.EXTENSION, -1);
            int depPopulation = data.getIntExtra(Department.POPULATION, -1);

            Department newDepartment = new Department(depName, depCapital, depExtension, depPopulation);

            adapter.addItem(newDepartment);
        }
    }

    private List<Department> generateDepartments() {

        List<Department> departments = new ArrayList<>();

        Department dpt01 = new Department();
        dpt01.setName("Beni");
        dpt01.setCapital("Trinidad");
        dpt01.setExtension(213564);
        dpt01.setPopulation(430049);
        dpt01.setImgPath("_Beni");
        departments.add(dpt01);

        Department dpt02 = new Department();
        dpt02.setName("Chuquisaca");
        dpt02.setCapital("Sucre");
        dpt02.setExtension(51524);
        dpt02.setPopulation(631062);
        dpt02.setImgPath("_Chuquisaca");
        departments.add(dpt02);

        Department dpt03 = new Department();
        dpt03.setName("Cochabamba");
        dpt03.setCapital("Cochabamba");
        dpt03.setExtension(55631);
        dpt03.setPopulation(1786040);
        dpt03.setImgPath("_Cochabamba");
        departments.add(dpt03);

        Department dpt04 = new Department();
        dpt04.setName("La Paz");
        dpt04.setCapital("Nuestra Señora de La Paz");
        dpt04.setExtension(133985);
        dpt04.setPopulation(2756989);
        dpt04.setImgPath("_LaPaz");
        departments.add(dpt04);

        Department dpt05 = new Department();
        dpt05.setName("Oruro");
        dpt05.setCapital("Oruro");
        dpt05.setExtension(53588);
        dpt05.setPopulation(444093);
        dpt05.setImgPath("_Oruro");
        departments.add(dpt05);

        Department dpt06 = new Department();
        dpt06.setName("Pando");
        dpt06.setCapital("Cobija");
        dpt06.setExtension(63827);
        dpt06.setPopulation(75335);
        dpt06.setImgPath("_Pando");
        departments.add(dpt06);

        Department dpt07 = new Department();
        dpt07.setName("Potosi");
        dpt07.setCapital("Potosi");
        dpt07.setExtension(118218);
        dpt07.setPopulation(780392);
        dpt07.setImgPath("_Potosi");
        departments.add(dpt07);

        Department dpt08 = new Department();
        dpt08.setName("Santa Cruz");
        dpt08.setCapital("Santa Cruz de la Sierra");
        dpt08.setExtension(370621);
        dpt08.setPopulation(2626697);
        dpt08.setImgPath("_SantaCruz");
        departments.add(dpt08);

        Department dpt09 = new Department();
        dpt09.setName("Tarija");
        dpt09.setCapital("Tarija");
        dpt09.setExtension(37623);
        dpt09.setPopulation(496988);
        dpt09.setImgPath("_Tarija");
        departments.add(dpt09);

        return departments;
    }

}
