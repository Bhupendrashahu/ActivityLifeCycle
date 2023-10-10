package com.example.activitylifecycle;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class frag1 extends Fragment {


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(getContext(), "on Attach frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onAttach: ");
    }

    public frag1() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), "on CreatedView Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onCreateView: ");
        return inflater.inflate(R.layout.fragment_frag1, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(), "on Destroy frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onDestroy: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(), "on Resume frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onResume: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(), "on Stop Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onStop: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), "on Start Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onStart: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getContext(), "on Pause Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onPause: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(), "on Destroy frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onDestroyView: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getContext(), "on Detached frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onDetach: ");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getContext(), "on View created frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onViewCreated: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "on Created frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", "onCreate: ");
    }
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        Toast.makeText(mContext, " on Activity Created ", Toast.LENGTH_SHORT).show();
//    }
}
