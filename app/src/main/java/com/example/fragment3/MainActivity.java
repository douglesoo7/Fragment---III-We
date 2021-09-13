package com.example.fragment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CommunicationListener {
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        launchStudentPersonalDetailsFragmetn();
    }

    private void launchStudentPersonalDetailsFragmetn() {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        StudentPersonalDetailsFragment fragment=new StudentPersonalDetailsFragment();
        fragmentTransaction.add(R.id.fconatainer,fragment,"Personal").commit();
    }

    @Override
    public void launchPerformanceFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Student_PerformanceDeatails personDetailsFragment=new Student_PerformanceDeatails();
        personDetailsFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.fconatainer,  personDetailsFragment,"personDetailsFragment").addToBackStack("").commit();

    }
}