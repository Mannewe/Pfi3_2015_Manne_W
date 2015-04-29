package com.example.manne.assignment4;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlanetFragment extends Fragment implements AdapterView.OnItemClickListener {
  public ArrayList<PlanetObject> planets = new ArrayList<PlanetObject>();

    public ImageButton imageButton;


    GridView planetGrid;
    PlanetAdapter planetAdapter;

    public PlanetFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_planets, container, false);

        int [] planetImages = {
                R.drawable.mercury,
                R.drawable.venus,
                R.drawable.earth,
                R.drawable.mars,
                R.drawable.jupiter,
                R.drawable.saturn,
                R.drawable.uranus,
                R.drawable.neptune};

        String[] planetNames = getResources().getStringArray(R.array.planet_names);
        String[] planetDescription = getResources().getStringArray(R.array.planet_infos);
        String[] planetTemp = getResources().getStringArray(R.array.temp);
        String[] planetRadius = getResources().getStringArray(R.array.planet_radius);

        for (int i = 0; i<planetNames.length; i++){
            PlanetObject planet = new PlanetObject(planetNames[i],planetDescription[i],planetRadius[i],planetTemp[i], planetImages[i]);
            planets.add(planet);
        }

        PlanetAdapter pa = new PlanetAdapter(getActivity(),planets);
        GridView gv = (GridView) v.findViewById(R.id.gridView);
        gv.setAdapter(pa);

        gv.setOnItemClickListener(this);

        return v;
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        InfoFragment infoFragment = new InfoFragment();
        Bundle b = new Bundle();
        b.putSerializable("planets", planets.get(position));
        infoFragment.setArguments(b);

        ft.replace(R.id.ma, infoFragment).addToBackStack(null).commit();

    }
}
