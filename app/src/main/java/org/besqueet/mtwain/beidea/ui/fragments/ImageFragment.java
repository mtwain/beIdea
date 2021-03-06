package org.besqueet.mtwain.beidea.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.io.File;

import org.besqueet.mtwain.beidea.Constants;
import org.besqueet.mtwain.beidea.R;

public class ImageFragment extends Fragment implements Constants {

    public ImageFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_image, container, false);
        String path = getArguments().getString(BUNDLE_PATH);
        Picasso.with(getActivity())
                .load(new File(path))
                .placeholder(R.drawable.ic_launcher)//TODO:Додати картинку
                .error(R.drawable.ic_launcher);//TODO:Додати картинку помилки
        Log.d("B","On Create");
        return rootView;
    }
}
