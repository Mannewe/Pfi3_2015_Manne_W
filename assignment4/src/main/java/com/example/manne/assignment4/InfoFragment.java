package com.example.manne.assignment4;


import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_info, container, false);

        PlanetObject planet = (PlanetObject)getArguments().getSerializable("planets");

        TextView planetName = (TextView) v.findViewById(R.id.planet);
        TextView planetInfo = (TextView) v.findViewById(R.id.planet_info);
        TextView planetRadius = (TextView) v.findViewById(R.id.radius);
        TextView planetTemp = (TextView) v.findViewById(R.id.temp);
        ImageView planetImage = (ImageView) v.findViewById(R.id.bild);


       planetName.setText(planet.getName());
       planetInfo.setText(planet.getDescription());
       planetRadius.setText(planet.getRadius());
       planetTemp.setText(planet.getTemp());

       planetImage.setImageResource(planet.getImage());

        return v;
    }

}
