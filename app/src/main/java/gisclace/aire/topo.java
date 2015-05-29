package gisclace.aire;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class topo extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.topo, container, false);

       Button buttonSend = (Button) rootview.findViewById(R.id.contact);

        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                sendEmail();
            }
        });

        return rootview;
    }
    public void sendEmail()
    {
        String to = "admin@gisclace.fr";
        String subject = "Aire";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
        email.putExtra(Intent.EXTRA_SUBJECT, subject);

        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Choisissez un client de messagerie:"));
    }
}

