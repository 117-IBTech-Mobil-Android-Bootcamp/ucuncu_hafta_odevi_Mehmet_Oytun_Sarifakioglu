package com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.R
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.base.BaseFragment

class DeckFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_deck

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        exitShowPopUp()
        return inflater.inflate(R.layout.fragment_deck, container, false)
    }
}