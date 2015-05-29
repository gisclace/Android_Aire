package gisclace.aire;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class carre extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.carre, container, false);
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


                total.setText(String.valueOf(floata*floata));
            }
        });
        return rootview;
    }
}



