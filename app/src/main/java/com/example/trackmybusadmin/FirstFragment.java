package com.example.trackmybusadmin;

import android.app.Activity;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {
    CardView cv1;
    CardView cv2;
    CardView cv3;
    CardView cv4;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_first, container, false);
        cv1 = v.findViewById(R.id.cardView1);
        cv2 = v.findViewById(R.id.cardView2);
//        cv3 = v.findViewById(R.id.cardView3);
//        cv4 = v.findViewById(R.id.cardView4);
        Activity activity = getActivity();
        cv1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent addbus = new Intent(activity, MainActivityBusPart1.class);
              startActivity(addbus);
          }
      });
      cv2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent addstudent = new Intent(activity,MainActivity3BusPart2.class);
              startActivity(addstudent);
          }
      });
//      cv3.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Toast.makeText(activity, "Will Be Available Soon", Toast.LENGTH_SHORT).show();
//          }
//      });
//      cv4.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Toast.makeText(activity, "Will Be Available Soon", Toast.LENGTH_SHORT).show();
//          }
//      });
    return v;}
}