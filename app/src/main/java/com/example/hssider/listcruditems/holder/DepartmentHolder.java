package com.example.hssider.listcruditems.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hssider.listcruditems.R;
import com.example.hssider.listcruditems.model.Department;

/**
 * Created by hssider on 12/22/15.
 */
public class DepartmentHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    private final TextView tv_depName;
    private final TextView tv_depCapital;
    private final TextView tv_depExtension;
    private final TextView tv_depPopulation;

    public DepartmentHolder(View itemView) {
        super(itemView);

        tv_depName = (TextView) itemView.findViewById(R.id.tv_dep_name);
        tv_depCapital = (TextView) itemView.findViewById(R.id.tv_dep_capital);
        tv_depExtension = (TextView) itemView.findViewById(R.id.tv_dep_extension);
        tv_depPopulation = (TextView) itemView.findViewById(R.id.tv_dep_population);

        itemView.setOnClickListener(this);

        tv_depName.setOnClickListener(this);
        tv_depCapital.setOnClickListener(this);
        tv_depExtension.setOnClickListener(this);
        tv_depPopulation.setOnClickListener(this);

        itemView.setOnLongClickListener(this);

        tv_depName.setOnLongClickListener(this);
        tv_depCapital.setOnLongClickListener(this);
        tv_depExtension.setOnLongClickListener(this);
        tv_depPopulation.setOnLongClickListener(this);
    }

    public void bind(Department department) {
        tv_depName.setText(department.getName());
        tv_depCapital.setText(department.getCapital());
        tv_depExtension.setText(department.getExtension() + "");
        tv_depPopulation.setText(department.getPopulation() + "");
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "OnClick; " + tv_depName.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(v.getContext(), "onLongClick; " + tv_depName.getText(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
