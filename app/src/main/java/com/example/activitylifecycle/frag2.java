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


public class frag2 extends Fragment {
    public frag2() {
        // Required empty public constructor
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(getContext(), " 2: on Attach frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onAttach: ");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), " 2: on CreateView Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onCreateView: ");
        return inflater.inflate(R.layout.fragment_frag2, container, false);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(), " 2: on Destroy frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onDestroy: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(), " 2: on Resume frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onResume: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(), " 2: on Stop Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onStop: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(), " 2: on Start Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onStart: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getContext(), " 2: on Pause Frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onPause: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(), " 2: on DestroyView frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onDestroyView: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getContext(), " 2: on Detached frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onDetach: ");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getContext(), " 2: on View created frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onViewCreated: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), " 2: on Created frag", Toast.LENGTH_SHORT).show();
        Log.d("TAG", " 2: onCreate: ");
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        Toast.makeText(mContext, "2: on Activity Created ", Toast.LENGTH_SHORT).show();
//    }
}