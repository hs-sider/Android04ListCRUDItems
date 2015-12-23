package com.example.hssider.listcruditems.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hssider.listcruditems.R;
import com.example.hssider.listcruditems.holder.DepartmentHolder;
import com.example.hssider.listcruditems.model.Department;

import java.util.List;

/**
 * Created by hssider on 12/22/15.
 */
public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentHolder> {

    private List<Department> departments;

    public DepartmentAdapter(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public DepartmentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View itemView = inflater.inflate(R.layout.row_department, parent, false);
        return new DepartmentHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DepartmentHolder departmentHolder, int position) {
        final Department department = departments.get(position);
        departmentHolder.bind(department);
    }

    @Override
    public int getItemCount() {
        return  departments.size();
    }

    public void addItem(Department department) {
        departments.add(department);
        int position = getItemCount();
        notifyItemInserted(position);
    }
}