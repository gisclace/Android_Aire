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


public class trap extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.trap, container, false);
        Button add = (Button) rootview.findViewById(R.id.calculer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Déclaration des EditText
                EditText valeura = (EditText) rootview.findViewById(R.id.valeura);
                EditText valeurb = (EditText) rootview.findViewById(R.id.valeurb);
                EditText valeurc = (EditText) rootview.findViewById(R.id.valeurc);
                TextView total = (TextView) rootview.findViewById(R.id.resultat);

                //Gestion des champs vides
                final String inTxtL = valeura.getText().toString();
                final String inTxtl = valeurb.getText().toString();
                final String inTxtc = valeurc.getText().toString();
                if (inTxtL.equals("") ||inTxtl.equals("")||inTxtc.equals("")) {
                    Toast.makeText(rootview.getContext(), "Vous devez remplir toutes les valeurs.", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Float + calcules
                float floata = Float.parseFloat(valeura.getText().toString());
                float floatb = Float.parseFloat(valeurb.getText().toString());
                float floatc = Float.parseFloat(valeurc.getText().toString());


                total.setText(String.valueOf((floatc+floata)*floatb/2));
            }
        });
        return rootview;
    }
}



