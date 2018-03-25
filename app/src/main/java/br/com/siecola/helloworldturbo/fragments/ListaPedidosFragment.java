package br.com.siecola.helloworldturbo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.siecola.helloworldturbo.R;

/**
 * Created by paulosiecola on 25/03/18.
 */

public class ListaPedidosFragment extends Fragment {

    public ListaPedidosFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_lista_pedidos,
                container, false);


        getActivity().setTitle("Pedidos");

        return rootView;
    }
}
