package com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.R
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.adapter.Adapter
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.viewModel.AvatarViewModel
import kotlinx.android.synthetic.main.fragment_avatar_select.*


class AvatarSelect : Fragment() {

    private  lateinit var viewModel: AvatarViewModel
    private var recylerAvatarAdapter= Adapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_avatar_select, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel= ViewModelProviders.of(this).get(AvatarViewModel::class.java)
        //Getting data in the viewModel
        viewModel.getData()

        //For recylerView options
        val layoutManager = GridLayoutManager(requireContext(),3)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup(){
            override fun getSpanSize(position: Int): Int {
                return when(position){
                    0 -> 3
                    else -> 1
                }
            }

        }
        recyclerviewAvatarFragment.layoutManager= layoutManager
        recyclerviewAvatarFragment.adapter = recylerAvatarAdapter
        observeLiveData()
    }
    //I am using view model for the update DataList
    private fun observeLiveData() {
        viewModel.dataset.observe(viewLifecycleOwner, Observer { data->
            data?.let {
                recylerAvatarAdapter.updateToDataList(it)
            }

        })
    }

}