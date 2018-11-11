package com.example.shangbao.neuralhub.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shangbao.neuralhub.Models.NNObject;
import com.example.shangbao.neuralhub.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddObjectFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddObjectFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "ARG_NN_OBJ";

    // TODO: Rename and change types of parameters
    private NNObject nnObject;


    public AddObjectFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param nnObject Parameter 1.
     * @return A new instance of fragment AddObjectFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddObjectFragment newInstance(NNObject nnObject) {
        AddObjectFragment fragment = new AddObjectFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, nnObject);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            nnObject = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_object, container, false);
        view.findViewById(R.id.done).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

}
