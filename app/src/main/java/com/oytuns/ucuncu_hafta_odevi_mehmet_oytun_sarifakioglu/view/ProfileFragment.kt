package com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.R
import com.oytuns.ucuncu_hafta_odevi_mehmet_oytun_sarifakioglu.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_profile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        exitShowPopUp()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageViewEdit.setOnClickListener {
            getAvatarSelectFragment(it)
        }
    }
    //Going to avatar select screen
    private fun getAvatarSelectFragment(view: View) {
        findNavController().navigate(R.id.action_profileFragment_to_avatarSelectFragment)
    }

}