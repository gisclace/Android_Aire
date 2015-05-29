package gisclace.aire;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class cercle extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.cercle, container, false);

        Button add = (Button) rootview.findViewById(R.id.calculer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Déclaration des EditText
                EditText valeura = (EditText) rootview.findViewById(R.id.valeura);
                TextView total = (TextView) rootview.findViewById(R.id.resultat);

                //Gestion des champs vides
                final String inTxtL = valeura.getText().toString();
                if (inTxtL.equals("")) {
                    Toast.makeText(rootview.getContext(), "Vous devez remplir toutes les valeurs.", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Float + calcules
                float floata = Float.parseFloat(valeura.getText().toString());


                total.setText(String.valueOf(3.14*((floata/2)*(floata/2))));
            }
        });
        return rootview;
    }
}

