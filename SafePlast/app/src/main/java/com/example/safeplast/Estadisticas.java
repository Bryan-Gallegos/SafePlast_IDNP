package com.example.safeplast;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.safeplast.AdaptadoresParaInformate.AdapterPlasticos;
import com.example.safeplast.Room.Plasticos;

import java.util.ArrayList;


public class Estadisticas extends Fragment {
    /*
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public Estadisticas() {
        // Required empty public constructor
    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Estadisticas.
    // TODO: Rename and change types and number of parameters
    public static Estadisticas newInstance(String param1, String param2) {
        Estadisticas fragment = new Estadisticas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    */

    //AdapterPlasticos adapterPlasticos;
    //RecyclerView recyclerView;
    //ArrayList<Plasticos>listaplasticos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_estadisticas, container, false);
        //View view = inflater.inflate(R.layout.fragment_estadisticas, container, false);
        //listaplasticos = new ArrayList<Plasticos>();
        //cargarLista();
        //mostrarData();
        return inflater.inflate(R.layout.fragment_estadisticas, container, false);
    }
    /*
    public void cargarLista() { //"PET","HDPE","PVC","LDPE","PP","PS"
        listaplasticos.add(new Plasticos(1,"PET",
                "Polímero plástico que se elabora a partir de un proceso de polimeración de ácido tereftálico y monoetilenglicol."
                ,"1","1","1","sd",R.drawable.pet));
        listaplasticos.add(new Plasticos(2,"HDPE",
                "El polietileno de alta densidad es un polímero termoplástico formado por múltiples unidades de etileno.",
                "1","1","1","sd",R.drawable.hdpe));
        listaplasticos.add(new Plasticos(3,"PVC",
                "Es una combinación química de carbono, hidrógeno y cloro. Sus componentes provienen del petróleo bruto (43%) y de la sal (57%). Es el plástico con menos dependencia del petróleo.",
                "1","1","1","sd",R.drawable.pvc));
        listaplasticos.add(new Plasticos(4,"LDPE",
                "Es un polímero termoplástico de la familia de los olefínicos, formado por múltiples unidades de etileno.",
                "1","1","1","sd",R.drawable.ldpe));
        listaplasticos.add(new Plasticos(5,"PP",
                "Se obtiene a partir de la polimerización del propileno, un material que entra en la categoría de los termoplásticos.",
                "1","1","1","sd",R.drawable.pp));
        listaplasticos.add(new Plasticos(6,"PS",
                "Es un polímero termoplástico que se obtiene de la polimerización del estireno. Se trata de un plástico duro y transparente.",
                "1","1","1","sd",R.drawable.ps));
    }*/
}