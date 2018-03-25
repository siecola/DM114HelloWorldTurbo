package br.com.siecola.helloworldturbo.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import br.com.siecola.helloworldturbo.R;
import br.com.siecola.helloworldturbo.adapters.PedidoAdapter;
import br.com.siecola.helloworldturbo.models.Pedido;

/**
 * Created by paulosiecola on 25/03/18.
 */

public class ListaPedidosFragment extends Fragment {

    private ListView listViewPedidos;
    private ArrayList<Pedido> pedidos;

    public ListaPedidosFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_lista_pedidos,
                container, false);

        setHasOptionsMenu(true);
        getActivity().setTitle("Pedidos");

        pedidos = new ArrayList<Pedido>();
        for (int j = 0; j < 5; j++) {
            Pedido pedidoAux = new Pedido();
            pedidoAux.setOrderId(j);
            pedidoAux.setDataPedido("10/04/2016 11:50:00");
            pedidos.add(pedidoAux);
        }

        listViewPedidos = (ListView) rootView.
                findViewById(R.id.lista_pedidos);

        PedidoAdapter pedidoAdapter = new PedidoAdapter(
                getActivity(), pedidos);
        listViewPedidos.setAdapter(pedidoAdapter);

        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.pedidos_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.novo_pedido:
                Toast.makeText(getActivity(),
                        "Novo pedido", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}